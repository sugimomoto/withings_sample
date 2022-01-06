package sugimomoto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MeasBase extends ResponseBase{
    
    private MeasBody body;

    @JsonProperty("body")
    public MeasBody getBody() { return body; }
    @JsonProperty("body")
    public void setBody(MeasBody value) { this.body = value; }
}
