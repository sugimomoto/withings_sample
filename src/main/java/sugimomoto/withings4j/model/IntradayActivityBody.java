package sugimomoto.withings4j.model;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IntradayActivityBody {
    private Map<String, IntradayActivitySeries> series;

    @JsonProperty("series")
    public Map<String, IntradayActivitySeries> getSeries() { return series; }

    @JsonProperty("series")
    public void setBody(Map<String, IntradayActivitySeries> value) { this.series = value; }
}
