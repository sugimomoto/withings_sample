package sugimomoto.withings4j.query;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.FormBody;
import sugimomoto.withings4j.model.WithingsActionType;

public class MeasureGetintradayactivityQueryParameters extends QueryParameters {

    public MeasureGetintradayactivityQueryParameters() {
        this.builder.add("action", WithingsActionType.MEASURE_V2_GETINTRADAYACTIVITY_GETINTRADAYACTIVITY.getValue());
    }
    
}
