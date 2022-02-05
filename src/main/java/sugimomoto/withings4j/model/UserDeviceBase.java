package sugimomoto.withings4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDeviceBase extends ResponseBase {
    private UserDeviceBody body;

    @JsonProperty("body")
    public UserDeviceBody getBody() { return body; }
    @JsonProperty("body")
    public void setBody(UserDeviceBody value) { this.body = value; }
}
