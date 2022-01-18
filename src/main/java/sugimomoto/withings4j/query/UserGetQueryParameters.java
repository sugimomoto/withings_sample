package sugimomoto.withings4j.query;

import okhttp3.FormBody;
import sugimomoto.withings4j.model.WithingsActionType;

public class UserGetQueryParameters extends QueryParameters {

    public UserGetQueryParameters() {
        this.builder.add("action", WithingsActionType.USER_V2_GET_GET.getValue());
    }

    @Override
    public FormBody getQueryParameters() {
        setSignature();
        return builder.build();
    }

    public void setClientId(String clientId) {
        this.builder.add("client_id", clientId);
    }

    public void setNonce(String nonce) {
        this.builder.add("nonce", nonce);
    }

    private void setSignature(){
        this.builder.add("signature", "");
    }
    
    public void setEmail(String email) {
        this.builder.add("email", email);
    }
}
