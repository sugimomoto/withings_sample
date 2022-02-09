package sugimomoto.withings4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SleepBase extends ResponseBaseAbstract {
    private SleepSeriesBody body;

    @JsonProperty("body")
    public SleepSeriesBody getBody() { return body; }
    @JsonProperty("body")
    public void setBody(SleepSeriesBody value) { this.body = value; }
}
