package sugimomoto.withings4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NotifyBase extends ResponseBaseAbstract {
    private Profile body;

    @JsonProperty("body")
    public Profile getBody() { return body; }
    @JsonProperty("body")
    public void setBody(Profile value) { this.body = value; }
}
