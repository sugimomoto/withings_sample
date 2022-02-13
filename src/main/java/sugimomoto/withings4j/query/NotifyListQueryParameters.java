package sugimomoto.withings4j.query;

import sugimomoto.withings4j.model.WithingsActionType;

public class NotifyListQueryParameters extends QueryParameters {

    public NotifyListQueryParameters() {
        this.parameters.put("action", WithingsActionType.NOTIFY_LIST_LIST.getValue());
    }
    
    public void setAppli(int appli) {
        this.parameters.put("appli", String.valueOf(appli));
    }
}
