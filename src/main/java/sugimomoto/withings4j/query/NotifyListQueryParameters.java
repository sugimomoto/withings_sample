package sugimomoto.withings4j.query;

import sugimomoto.withings4j.model.WithingsActionType;

public class NotifyListQueryParameters extends QueryParameters {

    public NotifyListQueryParameters() {
        this.builder.add("action", WithingsActionType.NOTIFY_LIST_LIST.getValue());
    }
    
    public void setAppli(int appli) {
        this.builder.add("appli", String.valueOf(appli));
    }

}
