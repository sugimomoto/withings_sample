package sugimomoto.withings4j.query;

import sugimomoto.withings4j.model.WithingsActionType;

public class MeasureGetintradayactivityQueryParameters extends QueryParameters {

    public MeasureGetintradayactivityQueryParameters() {
        this.builder.add("action", WithingsActionType.MEASURE_V2_GETINTRADAYACTIVITY_GETINTRADAYACTIVITY.getValue());
    }

    public void setStartDate(int startDate) {
        this.builder.add("startdate", String.valueOf(startDate));
    }

    public void setEndDate(int endDate) {
        this.builder.add("enddate", String.valueOf(endDate));
    }

    public void setDataFileds(String dataFileds) {
        this.builder.add("data_fields", dataFileds);
    }
}
