package sugimomoto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ActivityBase {
    private Integer status;
    private ActivityBody body;    
    private String error;

    @JsonProperty("status")
    public Integer getStatus() { return status; }
    
    @JsonProperty("status")
    public void setStatus(Integer value) { this.status = value; }

    @JsonProperty("body")
    public ActivityBody getBody() { return body; }

    @JsonProperty("body")
    public void setBody(ActivityBody value) { this.body = value; }

    @JsonProperty("error")
    public String getError() { return error; }

    @JsonProperty("error")
    public void setError(String error) { this.error = error; }
}
