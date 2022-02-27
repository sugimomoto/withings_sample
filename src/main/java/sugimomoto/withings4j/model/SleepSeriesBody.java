package sugimomoto.withings4j.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SleepSeriesBody {
    private List<SleepSeries> series;
    private long model;

    @JsonProperty("series")
    public List<SleepSeries> getSeries() { return series; }
    @JsonProperty("series")
    public void setSeries(List<SleepSeries> value) { this.series = value; }

    @JsonProperty("model")
    public long getModel() { return model; }
    @JsonProperty("model")
    public void setModel(long value) { this.model = value; }

}
