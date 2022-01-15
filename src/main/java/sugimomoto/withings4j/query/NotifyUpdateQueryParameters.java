package sugimomoto.withings4j.query;

import sugimomoto.withings4j.model.WithingsActionType;

public class NotifyUpdateQueryParameters extends QueryParameters {

    public NotifyUpdateQueryParameters() {
        this.builder.add("action", WithingsActionType.NOTIFY_UPDATE_UPDATE.getValue());
    }

    public void setAppli(int appli) {
        this.builder.add("appli", String.valueOf(appli));
    }

    public void setNewAppli(int newAppli) {
        this.builder.add("new_appli", String.valueOf(newAppli));
    }

    public void setNewCallbackurl(String newCallbackurl) {
        this.builder.add("new_callbackurl", newCallbackurl);
    }

    public void setComment(String comment) {
        this.builder.add("comment", comment);
    }
}
