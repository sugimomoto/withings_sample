package sugimomoto.withings4j.query;

import sugimomoto.withings4j.model.WithingsActionType;

public class NotifyUpdateQueryParameters extends QueryParameters {

    public NotifyUpdateQueryParameters() {
        this.parameters.put("action", WithingsActionType.NOTIFY_UPDATE_UPDATE.getValue());
    }

    public void setAppli(int appli) {
        this.parameters.put("appli", String.valueOf(appli));
    }

    public void setNewAppli(int newAppli) {
        this.parameters.put("new_appli", String.valueOf(newAppli));
    }

    public void setNewCallbackurl(String newCallbackurl) {
        this.parameters.put("new_callbackurl", newCallbackurl);
    }

    public void setComment(String comment) {
        this.parameters.put("comment", comment);
    }
}
