package sugimomoto.withings4j.query;

import java.util.List;

import sugimomoto.withings4j.model.WithingsActionType;

public class SleepGetsummaryQueryParameters extends QueryParameters {

    public SleepGetsummaryQueryParameters() {
        this.parameters.put("action", WithingsActionType.SLEEP_V2_GETSUMMARY_GETSUMMARY.getValue());
    }
    
    public void setStartDateYMD(String startDateYMD) {
        this.parameters.put("startdateymd", startDateYMD);
    }

    public void setEndDateYMD(String endDateYMD) {
        this.parameters.put("enddateymd", endDateYMD);
    }

    public void setLastUpdate(Integer lastUpdate) {
        this.parameters.put("lastupdate", lastUpdate.toString());
    }

    public void setDataFileds(String dataFileds) {
        this.parameters.put("data_fields", dataFileds);
    }
}
