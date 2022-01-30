package sugimomoto.withings4j.query;

import sugimomoto.withings4j.model.WithingsActionType;

public class SignatureGetnonceQueryParameters extends QueryParameters {

    public SignatureGetnonceQueryParameters() {
        this.parameters.put("action", WithingsActionType.SIGNATURE_V2_GETNONCE_GETNONCE.getValue());
    }
    
    public void setClientId(String clientId) {
        this.parameters.put("client_id", clientId);
    }

    private void setTimestamp(){
        this.parameters.put("timestamp", "");
    }
}
