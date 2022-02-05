package sugimomoto.withings4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Weight {
    private long value;
    private long unit;

    @JsonProperty("value")
    public long getValue() { return value; }
    @JsonProperty("value")
    public void setValue(long value) { this.value = value; }

    @JsonProperty("unit")
    public long getUnit() { return unit; }
    @JsonProperty("unit")
    public void setUnit(long value) { this.unit = value; }

}
