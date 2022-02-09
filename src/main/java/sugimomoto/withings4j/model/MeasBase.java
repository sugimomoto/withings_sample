package sugimomoto.withings4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MeasBase extends ResponseBaseAbstract{
    
    private MeasBody body;

    @JsonProperty("body")
    public MeasBody getBody() { return body; }
    @JsonProperty("body")
    public void setBody(MeasBody value) { this.body = value; }
}
