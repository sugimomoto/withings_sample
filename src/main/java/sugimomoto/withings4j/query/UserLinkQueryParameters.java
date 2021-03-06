package sugimomoto.withings4j.query;

import java.util.List;
import java.util.stream.Collectors;

import sugimomoto.withings4j.model.WithingsActionType;

public class UserLinkQueryParameters extends QueryParameters {

    public UserLinkQueryParameters() {
        this.parameters.put("action", WithingsActionType.USER_V2_LINK_LINK.getValue());
    }
    
    public void setMacAddresses(List<String> macAddresses) {
        this.parameters.put("mac_addresses", "[\"" + macAddresses.stream().collect(Collectors.joining("\",\"")) + "\"]");
    }
}