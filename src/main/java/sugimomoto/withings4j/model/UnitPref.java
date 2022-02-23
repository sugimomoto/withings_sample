package sugimomoto.withings4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UnitPref {
    private long weight;
    private long height;
    private long temperature;
    private long distance;

    @JsonProperty("weight")
    public long getWeight() { return weight; }
    @JsonProperty("weight")
    public void setWeight(long value) { this.weight = value; }

    @JsonProperty("height")
    public long getHeight() { return height; }
    @JsonProperty("height")
    public void setHeight(long value) { this.height = value; }

    @JsonProperty("temperature")
    public long getTemperature() { return temperature; }
    @JsonProperty("temperature")
    public void setTemperature(long value) { this.temperature = value; }

    @JsonProperty("distance")
    public long getDistance() { return distance; }
    @JsonProperty("distance")
    public void setDistance(long value) { this.distance = value; }

}
