package sugimomoto.withings4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HeartListBase extends ResponseBase {
    private HeartListBody body;

    @JsonProperty("body")
    public HeartListBody getBody() { return body; }
    @JsonProperty("body")
    public void setBody(HeartListBody value) { this.body = value; }
}
