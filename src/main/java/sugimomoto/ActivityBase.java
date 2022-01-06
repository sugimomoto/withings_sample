package sugimomoto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ActivityBase extends ResponseBase {
    private ActivityBody body;    

    @JsonProperty("body")
    public ActivityBody getBody() { return body; }

    @JsonProperty("body")
    public void setBody(ActivityBody value) { this.body = value; }
}
