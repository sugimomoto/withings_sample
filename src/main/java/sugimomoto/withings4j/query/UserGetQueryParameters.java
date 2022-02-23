package sugimomoto.withings4j.query;

import okhttp3.FormBody;
import sugimomoto.withings4j.model.WithingsActionType;

public class UserGetQueryParameters extends QueryParameters {

    public UserGetQueryParameters(String seretKey) {
        this.parameters.put("action", WithingsActionType.USER_V2_GET_GET.getValue());
        this.secretKey = seretKey;
    }

    public void setClientId(String clientId) {
        this.parameters.put("client_id", clientId);
    }

    public void setNonce(String nonce) {
        this.parameters.put("nonce", nonce);
    }
    
    public void setEmail(String email) {
        this.parameters.put("email", email);
    }
}
