package sugimomoto.withings4j.query;

import sugimomoto.withings4j.model.WithingsActionType;

public class HeartListQueryParameters extends QueryParameters {

    public HeartListQueryParameters() {
        this.parameters.put("action", WithingsActionType.HEART_V2_LIST_LIST.getValue());
    }

    public void setStartDate(int startDate) {
        this.parameters.put("startdate", String.valueOf(startDate));
    }

    public void setEndDate(int endDate) {
        this.parameters.put("enddate", String.valueOf(endDate));
    }

    public void setOffset(int offset) {
        this.parameters.put("offset", String.valueOf(offset));
    }
}
