package sugimomoto.withings4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Ecg {
    private long signalid;
    private long afib;

    @JsonProperty("signalid")
    public long getSignalid() { return signalid; }
    @JsonProperty("signalid")
    public void setSignalid(long value) { this.signalid = value; }

    @JsonProperty("afib")
    public long getAfib() { return afib; }
    @JsonProperty("afib")
    public void setAfib(long value) { this.afib = value; }
}
