package sugimomoto.withings4j.query;

import java.security.Timestamp;
import java.time.LocalDateTime;

import sugimomoto.withings4j.model.WithingsActionType;

public class SignatureGetnonceQueryParameters extends QueryParameters {

    public SignatureGetnonceQueryParameters(String secretKey) {
        this.parameters.put("action", WithingsActionType.SIGNATURE_V2_GETNONCE_GETNONCE.getValue());
        this.secretKey = secretKey;
    }
    
    public void setClientId(String clientId) {
        this.parameters.put("client_id", clientId);
    }

    public void setTimestamp(long timestamp){
        this.parameters.put("timestamp", String.valueOf(timestamp));
    }
}
