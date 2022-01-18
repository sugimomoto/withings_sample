package sugimomoto.withings4j.query;

import sugimomoto.withings4j.model.WithingsActionType;

public class UserUnlinkQueryParameters extends QueryParameters {

    public UserUnlinkQueryParameters() {
        this.builder.add("action", WithingsActionType.USER_V2_UNLINK_UNLINK.getValue());
    }
    
    public void setMacAddresses(String macAddresses) {
        this.builder.add("mac_addresses", macAddresses);
    }

}
