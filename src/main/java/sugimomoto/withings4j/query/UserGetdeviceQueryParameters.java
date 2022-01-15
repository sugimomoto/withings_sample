package sugimomoto.withings4j.query;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.FormBody;
import sugimomoto.withings4j.model.WithingsActionType;

public class UserGetdeviceQueryParameters extends QueryParameters {

    public UserGetdeviceQueryParameters() {
        this.builder.add("action", WithingsActionType.USER_V2_GETDEVICE_GETDEVICE.getValue());
    }
    
}
