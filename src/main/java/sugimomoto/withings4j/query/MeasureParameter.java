package sugimomoto.withings4j.query;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MeasureParameter {
    private long value;
    private long unit;
    private long type;

    @JsonProperty("value")
    public long getValue() { return value; }
    @JsonProperty("value")
    public void setValue(long value) { this.value = value; }

    @JsonProperty("unit")
    public long getUnit() { return unit; }
    @JsonProperty("unit")
    public void setUnit(long value) { this.unit = value; }

    @JsonProperty("type")
    public long getType() { return type; }
    @JsonProperty("type")
    public void setType(long value) { this.type = value; }

}
