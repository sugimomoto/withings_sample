package sugimomoto.withings4j.query;

import sugimomoto.withings4j.model.WithingsActionType;

public class NotifyGetQueryParameters extends QueryParameters {

    public NotifyGetQueryParameters() {
        this.builder.add("action", WithingsActionType.NOTIFY_GET_GET.getValue());
    }
    
    public void setCallbackurl(String callbackurl) {
        this.builder.add("callbackurl", callbackurl);
    }

    public void setAppli(int appli) {
        this.builder.add("appli", String.valueOf(appli));
    }

}
