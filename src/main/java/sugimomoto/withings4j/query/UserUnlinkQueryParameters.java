package sugimomoto.withings4j.query;

import sugimomoto.withings4j.model.WithingsActionType;

public class UserUnlinkQueryParameters extends QueryParameters {

    public UserUnlinkQueryParameters() {
        this.parameters.put("action", WithingsActionType.USER_V2_UNLINK_UNLINK.getValue());
    }
    
    public void setMacAddresses(String macAddresses) {
        this.parameters.put("mac_addresses", macAddresses);
    }

}
