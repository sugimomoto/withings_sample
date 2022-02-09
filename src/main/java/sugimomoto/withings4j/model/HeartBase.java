package sugimomoto.withings4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HeartBase extends ResponseBaseAbstract {
    private HeartBody body;

    @JsonProperty("body")
    public HeartBody getBody() { return body; }
    @JsonProperty("body")
    public void setBody(HeartBody value) { this.body = value; }
}
