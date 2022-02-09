package sugimomoto.withings4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SleepSummaryBase extends ResponseBaseAbstract {
    private SleepSummaryBody body;

    @JsonProperty("body")
    public SleepSummaryBody getBody() { return body; }
    @JsonProperty("body")
    public void setBody(SleepSummaryBody value) { this.body = value; }
}
