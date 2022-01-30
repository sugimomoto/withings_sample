package sugimomoto.withings4j.query;

import java.util.List;

import sugimomoto.withings4j.model.WithingsActionType;

public class NotifyRevokeQueryParameters extends QueryParameters {

    public NotifyRevokeQueryParameters() {
        this.parameters.put("action", WithingsActionType.NOTIFY_REVOKE_REVOKE.getValue());
    }
        
    public void setCallbackurl(String callbackurl) {
        this.parameters.put("callbackurl", callbackurl);
    }

    public void setAppli(int appli) {
        this.parameters.put("appli", String.valueOf(appli));
    }

}
