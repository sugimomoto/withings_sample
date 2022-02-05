package sugimomoto.withings4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeviceBase extends ResponseBase {
    private DeviceBody body;

    @JsonProperty("body")
    public DeviceBody getBody() { return body; }
    @JsonProperty("body")
    public void setBody(DeviceBody value) { this.body = value; }
}
