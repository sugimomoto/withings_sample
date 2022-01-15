package sugimomoto.withings4j.query;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.FormBody;
import sugimomoto.withings4j.model.WithingsActionType;

public class SleepGetsummaryQueryParameters extends QueryParameters {

    public SleepGetsummaryQueryParameters() {
        this.builder.add("action", WithingsActionType.SLEEP_V2_GETSUMMARY_GETSUMMARY.getValue());
    }
    
    public void setStartDateYMD(String startDateYMD) {
        this.builder.add("startdateymd", startDateYMD);
    }

    public void setEndDateYMD(String endDateYMD) {
        this.builder.add("enddateymd", endDateYMD);
    }

    public void setLastUpdate(Integer lastUpdate) {
        this.builder.add("lastupdate", lastUpdate.toString());
    }

    public void setDataFileds(String dataFileds) {
        this.builder.add("data_fields", dataFileds);
    }
}
