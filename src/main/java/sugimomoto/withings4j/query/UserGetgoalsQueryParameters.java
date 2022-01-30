package sugimomoto.withings4j.query;

import sugimomoto.withings4j.model.WithingsActionType;

public class UserGetgoalsQueryParameters extends QueryParameters {

    public UserGetgoalsQueryParameters() {
        this.parameters.put("action", WithingsActionType.USER_V2_GETGOALS_GETGOALS.getValue());
    }
    
}
