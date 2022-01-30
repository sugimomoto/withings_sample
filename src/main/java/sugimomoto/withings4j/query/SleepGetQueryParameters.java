package sugimomoto.withings4j.query;

import java.util.List;

import sugimomoto.withings4j.model.WithingsActionType;

public class SleepGetQueryParameters extends QueryParameters {

    public SleepGetQueryParameters() {
        this.parameters.put("action", WithingsActionType.SLEEP_V2_GET_GET.getValue());
    }

    public void setStartDate(int startDate) {
        this.parameters.put("startdate", String.valueOf(startDate));
    }

    public void setEndDate(int endDate) {
        this.parameters.put("enddate", String.valueOf(endDate));
    }

    public void setDataFileds(String dataFileds) {
        this.parameters.put("data_fields", dataFileds);
    }
}
