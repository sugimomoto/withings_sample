package sugimomoto.withings4j.query;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.FormBody;
import sugimomoto.withings4j.model.WithingsActionType;

public class UserUnlinkQueryParameters extends QueryParameters {

    public UserUnlinkQueryParameters() {
        this.builder.add("action", WithingsActionType.USER_V2_UNLINK_UNLINK.getValue());
    }
    
}
