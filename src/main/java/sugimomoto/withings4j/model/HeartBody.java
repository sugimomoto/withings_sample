package sugimomoto.withings4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HeartBody {
    private String signal;
    private long samplingFrequency;
    private long wearposition;

    @JsonProperty("signal")
    public String getSignal() { return signal; }
    @JsonProperty("signal")
    public void setSignal(String value) { this.signal = value; }

    @JsonProperty("sampling_frequency")
    public long getSamplingFrequency() { return samplingFrequency; }
    @JsonProperty("sampling_frequency")
    public void setSamplingFrequency(long value) { this.samplingFrequency = value; }

    @JsonProperty("wearposition")
    public long getWearposition() { return wearposition; }
    @JsonProperty("wearposition")
    public void setWearposition(long value) { this.wearposition = value; }
}
