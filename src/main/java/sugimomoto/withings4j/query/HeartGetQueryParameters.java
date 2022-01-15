package sugimomoto.withings4j.query;

import sugimomoto.withings4j.model.WithingsActionType;

public class HeartGetQueryParameters extends QueryParameters {

    public HeartGetQueryParameters() {
        this.builder.add("action", WithingsActionType.HEART_V2_GET_GET.getValue());
    }
    
    public void setSignalId(String signalId) {
        this.builder.add("signalid", signalId);
    }

}
