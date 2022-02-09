package sugimomoto.withings4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IntradayActivityBase extends ResponseBaseAbstract {
    private ActivityBody body;    

    @JsonProperty("body")
    public ActivityBody getBody() { return body; }

    @JsonProperty("body")
    public void setBody(ActivityBody value) { this.body = value; }
}
