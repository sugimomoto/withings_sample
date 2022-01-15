package sugimomoto.withings4j.query;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.FormBody;
import sugimomoto.withings4j.model.WithingsActionType;

public class SleepGetQueryParameters extends QueryParameters {

    public SleepGetQueryParameters() {
        this.builder.add("action", WithingsActionType.SLEEP_V2_GET_GET.getValue());
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
