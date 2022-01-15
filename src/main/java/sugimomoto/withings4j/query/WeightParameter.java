package sugimomoto.withings4j.query;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeightParameter {
    private int value;
    private int unit;

    @JsonProperty("value")
    public int getValue() { return value; }
    @JsonProperty("value")
    public void setValue(int value) { this.value = value; }

    @JsonProperty("unit")
    public int getUnit() { return unit; }
    @JsonProperty("unit")
    public void setUnit(int value) { this.unit = value; }

}
