package sugimomoto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MeasBase {
    
    private Integer status;
    private MeasBody body;

    @JsonProperty("status")
    public Integer getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(Integer value) { this.status = value; }

    @JsonProperty("body")
    public MeasBody getBody() { return body; }
    @JsonProperty("body")
    public void setBody(MeasBody value) { this.body = value; }
}
