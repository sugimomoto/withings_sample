package sugimomoto.withings4j.query;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

import okhttp3.FormBody;
import sugimomoto.withings4j.WithingsAPIException;

public abstract class QueryParameters implements IQueryParameters {

    protected HashMap<String,String> parameters;

    public FormBody getQueryParameters() {

        FormBody.Builder builder = new FormBody.Builder();

        parameters.forEach(
            (key,value) -> {
                builder.add(key, value);
            }
        );

        return builder.build();
    }

    public FormBody getQueryParameters(String secretKey) throws InvalidKeyException, NoSuchAlgorithmException, WithingsAPIException {

        if(parameters.containsKey("client_id") && parameters.containsKey("nonce")){
            throw new WithingsAPIException("If you need a signature, client_id and nonce is required.");
        }

        parameters.put("signature", Signature.SignedByHmacSHA256(
            parameters.get("action"),
            parameters.get("client_id"),
            parameters.get("nonce"),
            secretKey
            ));

        return getQueryParameters();
    }


}
