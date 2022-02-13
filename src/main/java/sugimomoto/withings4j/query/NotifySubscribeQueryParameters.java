package sugimomoto.withings4j.query;

import java.util.List;

import sugimomoto.withings4j.model.WithingsActionType;

public class NotifySubscribeQueryParameters extends QueryParameters {

    public NotifySubscribeQueryParameters(String secretKey) {
        this.parameters.put("action", WithingsActionType.NOTIFY_SUBSCRIBE_SUBSCRIBE.getValue());
        this.secretKey = secretKey;
    }
        
    public void setCallbackurl(String callbackurl) {
        this.parameters.put("callbackurl", callbackurl);
    }

    public void setAppli(int appli) {
        this.parameters.put("appli", String.valueOf(appli));
    }

    public void setClientId(String clientId) {
        this.parameters.put("client_id", clientId);
    }

    public void setNonce(String nonce) {
        this.parameters.put("nonce", nonce);
    }

    public void setComment(String comment) {
        this.parameters.put("comment", comment);
    }
}
