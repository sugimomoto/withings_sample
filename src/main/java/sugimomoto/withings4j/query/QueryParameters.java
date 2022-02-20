package sugimomoto.withings4j.query;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedHashMap;

import okhttp3.FormBody;
import sugimomoto.withings4j.WithingsAPIException;

public class QueryParameters implements IQueryParameters {

    protected LinkedHashMap<String,String> parameters = new LinkedHashMap<>();

    protected String secretKey;

    public FormBody getQueryParameters() throws WithingsAPIException {

        setupSignatured();

        FormBody.Builder builder = new FormBody.Builder();

        parameters.forEach(
            (key,value) -> {
                builder.add(key, value);
            }
        );

        return builder.build();
    }

    private void setupSignatured() throws WithingsAPIException {

        if(secretKey == null || secretKey.isEmpty()){
            return;
        }

        if(!parameters.containsKey("client_id") && (!parameters.containsKey("nonce") || !parameters.containsKey("timestamp"))){
            throw new WithingsAPIException("If you need a signatured this query parameters, client_id and nonce or timestamp are required.");
        }

        try{
            String param = parameters.containsKey("nonce") ? parameters.get("nonce") : parameters.get("timestamp");

            parameters.put("signature", Signature.SignedByHmacSHA256(
                parameters.get("action"),
                parameters.get("client_id"),
                param,
                secretKey
                ));

        }catch(InvalidKeyException | NoSuchAlgorithmException ex){
            throw new WithingsAPIException("Probably you use invalid client secret. Please confirm that value.");
        }
    }
}
