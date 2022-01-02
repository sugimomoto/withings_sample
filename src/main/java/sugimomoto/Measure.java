package sugimomoto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Measure {
    private long value;
    private long type;
    private long unit;
    private long algo;
    private long fm;
    private long fw;

    @JsonProperty("value")
    public long getValue() { return value; }
    @JsonProperty("value")
    public void setValue(long value) { this.value = value; }

    @JsonProperty("type")
    public long getType() { return type; }
    @JsonProperty("type")
    public void setType(long value) { this.type = value; }

    @JsonProperty("unit")
    public long getUnit() { return unit; }
    @JsonProperty("unit")
    public void setUnit(long value) { this.unit = value; }

    @JsonProperty("algo")
    public long getAlgo() { return algo; }
    @JsonProperty("algo")
    public void setAlgo(long value) { this.algo = value; }

    @JsonProperty("fm")
    public long getFm() { return fm; }
    @JsonProperty("fm")
    public void setFm(long value) { this.fm = value; }

    @JsonProperty("fw")
    public long getFw() { return fw; }
    @JsonProperty("fw")
    public void setFw(long value) { this.fw = value; }
}
