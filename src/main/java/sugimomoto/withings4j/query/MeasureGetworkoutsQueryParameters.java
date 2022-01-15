package sugimomoto.withings4j.query;

import sugimomoto.withings4j.model.WithingsActionType;

public class MeasureGetworkoutsQueryParameters extends QueryParameters {

    public MeasureGetworkoutsQueryParameters() {
        this.builder.add("action", WithingsActionType.MEASURE_V2_GETWORKOUTS_GETWORKOUTS.getValue());
    }
    
    public void setStartDateYMD(String startDateYMD) {
        this.builder.add("startdateymd", startDateYMD);
    }

    public void setEndDateYMD(String endDateYMD) {
        this.builder.add("enddateymd", endDateYMD);
    }

    public void setLastUpdate(int lastUpdate) {
        this.builder.add("lastupdate", String.valueOf(lastUpdate));
    }

    public void setOffset(int offset) {
        this.builder.add("offset", String.valueOf(offset));
    }

    public void setDataFileds(String dataFileds) {
        this.builder.add("data_fields", dataFileds);
    }
}
