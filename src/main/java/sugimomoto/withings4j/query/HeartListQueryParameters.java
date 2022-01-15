package sugimomoto.withings4j.query;

import sugimomoto.withings4j.model.WithingsActionType;

public class HeartListQueryParameters extends QueryParameters {

    public HeartListQueryParameters() {
        this.builder.add("action", WithingsActionType.HEART_V2_LIST_LIST.getValue());
    }

    public void setStartDate(int startDate) {
        this.builder.add("startdate", String.valueOf(startDate));
    }

    public void setEndDate(int endDate) {
        this.builder.add("enddate", String.valueOf(endDate));
    }

    public void setOffset(int offset) {
        this.builder.add("offset", String.valueOf(offset));
    }
}
