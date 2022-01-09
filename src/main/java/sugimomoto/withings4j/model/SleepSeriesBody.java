package sugimomoto.withings4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SleepSeriesBody {
    private SleepSeries series;
    private String model;
    private long modelID;

    @JsonProperty("series")
    public SleepSeries getSeries() { return series; }
    @JsonProperty("series")
    public void setSeries(SleepSeries value) { this.series = value; }

    @JsonProperty("model")
    public String getModel() { return model; }
    @JsonProperty("model")
    public void setModel(String value) { this.model = value; }

    @JsonProperty("model_id")
    public long getModelID() { return modelID; }
    @JsonProperty("model_id")
    public void setModelID(long value) { this.modelID = value; }

}
