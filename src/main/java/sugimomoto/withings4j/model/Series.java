package sugimomoto.withings4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Series {
    private String deviceid;
    private long model;
    private Ecg ecg;
    private Bloodpressure bloodpressure;
    private long heartRate;
    private long timestamp;

    @JsonProperty("deviceid")
    public String getDeviceid() { return deviceid; }
    @JsonProperty("deviceid")
    public void setDeviceid(String value) { this.deviceid = value; }

    @JsonProperty("model")
    public long getModel() { return model; }
    @JsonProperty("model")
    public void setModel(long value) { this.model = value; }

    @JsonProperty("ecg")
    public Ecg getEcg() { return ecg; }
    @JsonProperty("ecg")
    public void setEcg(Ecg value) { this.ecg = value; }

    @JsonProperty("bloodpressure")
    public Bloodpressure getBloodpressure() { return bloodpressure; }
    @JsonProperty("bloodpressure")
    public void setBloodpressure(Bloodpressure value) { this.bloodpressure = value; }

    @JsonProperty("heart_rate")
    public long getHeartRate() { return heartRate; }
    @JsonProperty("heart_rate")
    public void setHeartRate(long value) { this.heartRate = value; }

    @JsonProperty("timestamp")
    public long getTimestamp() { return timestamp; }
    @JsonProperty("timestamp")
    public void setTimestamp(long value) { this.timestamp = value; }

}
