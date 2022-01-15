package sugimomoto.withings4j.query;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UnitPreferencesParameter {

    private int weight;
    private int height;
    private int distance;
    private int temperature;

    @JsonProperty("weight")
    public int getWeight() { return weight; }
    @JsonProperty("weight")
    public void setWeight(int value) { this.weight = value; }

    @JsonProperty("height")
    public int getHeight() { return height; }
    @JsonProperty("height")
    public void setHeight(int value) { this.height = value; }

    @JsonProperty("distance")
    public int getDistance() { return distance; }
    @JsonProperty("distance")
    public void setDistance(int value) { this.distance = value; }

    @JsonProperty("temperature")
    public int getTemperature() { return temperature; }
    @JsonProperty("temperature")
    public void setTemperature(int value) { this.temperature = value; }

}
