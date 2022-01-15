package sugimomoto.withings4j.query;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.FormBody;
import sugimomoto.withings4j.model.WithingsActionType;

public class HeartGetQueryParameters extends QueryParameters {

    public HeartGetQueryParameters() {
        this.builder.add("action", WithingsActionType.HEART_V2_GET_GET.getValue());
    }
    
}
