package sugimomoto;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class ResponseBase implements IResponse {
    private Integer status;
    private String error;

    @JsonProperty("status")
    public Integer getStatus() { return status; }
    
    @JsonProperty("status")
    public void setStatus(Integer value) { this.status = value; }

    @JsonProperty("error")
    public String getError() { return error; }

    @JsonProperty("error")
    public void setError(String error) { this.error = error; }
}
