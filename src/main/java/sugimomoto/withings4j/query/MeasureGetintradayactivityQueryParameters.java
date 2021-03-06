package sugimomoto.withings4j.query;

import sugimomoto.withings4j.model.WithingsActionType;

public class MeasureGetintradayactivityQueryParameters extends QueryParameters {

    public MeasureGetintradayactivityQueryParameters() {
        this.parameters.put("action", WithingsActionType.MEASURE_V2_GETINTRADAYACTIVITY_GETINTRADAYACTIVITY.getValue());
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
