package sugimomoto.withings4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseBase extends ResponseBaseAbstract {
    private Object body;

    @JsonProperty("body")
    public Object getBody() { return body; }
    @JsonProperty("body")
    public void setBody(Object value) { this.body = value; }
}
