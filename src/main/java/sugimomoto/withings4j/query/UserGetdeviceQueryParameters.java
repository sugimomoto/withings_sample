package sugimomoto.withings4j.query;

import sugimomoto.withings4j.model.WithingsActionType;

public class UserGetdeviceQueryParameters extends QueryParameters {

    public UserGetdeviceQueryParameters() {
        this.builder.add("action", WithingsActionType.USER_V2_GETDEVICE_GETDEVICE.getValue());
    }
    
}
