package sugimomoto.withings4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WorkoutsBase extends ResponseBaseAbstract {
    private WorkoutsBody body;    

    @JsonProperty("body")
    public WorkoutsBody getBody() { return body; }

    @JsonProperty("body")
    public void setBody(WorkoutsBody value) { this.body = value; }
}
