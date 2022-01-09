package sugimomoto.withings4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Bloodpressure {
    private long diastole;
    private long systole;

    @JsonProperty("diastole")
    public long getDiastole() { return diastole; }
    @JsonProperty("diastole")
    public void setDiastole(long value) { this.diastole = value; }

    @JsonProperty("systole")
    public long getSystole() { return systole; }
    @JsonProperty("systole")
    public void setSystole(long value) { this.systole = value; }
}
