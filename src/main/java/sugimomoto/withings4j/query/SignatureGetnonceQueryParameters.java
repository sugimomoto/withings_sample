package sugimomoto.withings4j.query;

import okhttp3.FormBody;
import sugimomoto.withings4j.model.WithingsActionType;

public class SignatureGetnonceQueryParameters extends QueryParameters {

    public SignatureGetnonceQueryParameters() {
        this.builder.add("action", WithingsActionType.SIGNATURE_V2_GETNONCE_GETNONCE.getValue());
    }
    
    @Override
    public FormBody getQueryParameters() {
        setSignature();
        setTimestamp();
        return builder.build();
    }

    public void setClientId(String clientId) {
        this.builder.add("client_id", clientId);
    }

    private void setSignature(){
        this.builder.add("signature", "");
    }

    private void setTimestamp(){
        this.builder.add("timestamp", "");
    }
}
