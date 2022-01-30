package sugimomoto.withings4j.query;

import sugimomoto.withings4j.model.WithingsActionType;

public class MeasureGetworkoutsQueryParameters extends QueryParameters {

    public MeasureGetworkoutsQueryParameters() {
        this.parameters.put("action", WithingsActionType.MEASURE_V2_GETWORKOUTS_GETWORKOUTS.getValue());
    }
    
    public void setStartDateYMD(String startDateYMD) {
        this.parameters.put("startdateymd", startDateYMD);
    }

    public void setEndDateYMD(String endDateYMD) {
        this.parameters.put("enddateymd", endDateYMD);
    }

    public void setLastUpdate(int lastUpdate) {
        this.parameters.put("lastupdate", String.valueOf(lastUpdate));
    }

    public void setOffset(int offset) {
        this.parameters.put("offset", String.valueOf(offset));
    }

    public void setDataFileds(String dataFileds) {
        this.parameters.put("data_fields", dataFileds);
    }
}
