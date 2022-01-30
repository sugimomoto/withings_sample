package sugimomoto.withings4j.query;

import sugimomoto.withings4j.model.WithingsActionType;

public class NotifyGetQueryParameters extends QueryParameters {

    public NotifyGetQueryParameters() {
        this.parameters.put("action", WithingsActionType.NOTIFY_GET_GET.getValue());
    }
    
    public void setCallbackurl(String callbackurl) {
        this.parameters.put("callbackurl", callbackurl);
    }

    public void setAppli(int appli) {
        this.parameters.put("appli", String.valueOf(appli));
    }

}
