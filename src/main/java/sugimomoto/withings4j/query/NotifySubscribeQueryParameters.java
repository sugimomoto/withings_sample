package sugimomoto.withings4j.query;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.FormBody;
import sugimomoto.withings4j.model.WithingsActionType;

public class NotifySubscribeQueryParameters extends QueryParameters {

    public NotifySubscribeQueryParameters() {
        this.builder.add("action", WithingsActionType.NOTIFY_SUBSCRIBE_SUBSCRIBE.getValue());
    }

    @Override
    public FormBody getQueryParameters() {
        setSignature();
        return builder.build();
    }
        
    public void setCallbackurl(String callbackurl) {
        this.builder.add("callbackurl", callbackurl);
    }

    public void setAppli(int appli) {
        this.builder.add("appli", String.valueOf(appli));
    }

    public void setClientId(String clientId) {
        this.builder.add("client_id", clientId);
    }

    public void setNonce(String nonce) {
        this.builder.add("nonce", nonce);
    }

    public void setComment(String comment) {
        this.builder.add("comment", comment);
    }

    private void setSignature(){
        this.builder.add("signature", "");
    }
}
