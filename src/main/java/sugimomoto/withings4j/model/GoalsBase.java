package sugimomoto.withings4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GoalsBase extends ResponseBaseAbstract {
    private GoalsBody body;

    @JsonProperty("body")
    public GoalsBody getBody() { return body; }
    @JsonProperty("body")
    public void setBody(GoalsBody value) { this.body = value; }
}
