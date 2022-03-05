package sugimomoto.withings4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IntradayActivityBase extends ResponseBaseAbstract {
    private IntradayActivityBody body;

    @JsonProperty("body")
    public IntradayActivityBody getBody() { return body; }

    @JsonProperty("body")
    public void setBody(IntradayActivityBody value) { this.body = value; }
}
