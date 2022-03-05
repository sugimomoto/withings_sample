package sugimomoto.withings4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IntradayActivitySeries {
    private String deviceid;
    private String model;
    private long modelID;
    private long steps;
    private long elevation;
    private long calories;
    private long distance;
    private long stroke;
    private long poolLap;
    private long duration;
    private long heartRate;
    private long spo2Auto;

    @JsonProperty("deviceid")
    public String getDeviceid() { return deviceid; }
    @JsonProperty("deviceid")
    public void setDeviceid(String value) { this.deviceid = value; }

    @JsonProperty("model")
    public String getModel() { return model; }
    @JsonProperty("model")
    public void setModel(String value) { this.model = value; }

    @JsonProperty("model_id")
    public long getModelID() { return modelID; }
    @JsonProperty("model_id")
    public void setModelID(long value) { this.modelID = value; }

    @JsonProperty("steps")
    public long getSteps() { return steps; }
    @JsonProperty("steps")
    public void setSteps(long value) { this.steps = value; }

    @JsonProperty("elevation")
    public long getElevation() { return elevation; }
    @JsonProperty("elevation")
    public void setElevation(long value) { this.elevation = value; }

    @JsonProperty("calories")
    public long getCalories() { return calories; }
    @JsonProperty("calories")
    public void setCalories(long value) { this.calories = value; }

    @JsonProperty("distance")
    public long getDistance() { return distance; }
    @JsonProperty("distance")
    public void setDistance(long value) { this.distance = value; }

    @JsonProperty("stroke")
    public long getStroke() { return stroke; }
    @JsonProperty("stroke")
    public void setStroke(long value) { this.stroke = value; }

    @JsonProperty("pool_lap")
    public long getPoolLap() { return poolLap; }
    @JsonProperty("pool_lap")
    public void setPoolLap(long value) { this.poolLap = value; }

    @JsonProperty("duration")
    public long getDuration() { return duration; }
    @JsonProperty("duration")
    public void setDuration(long value) { this.duration = value; }

    @JsonProperty("heart_rate")
    public long getHeartRate() { return heartRate; }
    @JsonProperty("heart_rate")
    public void setHeartRate(long value) { this.heartRate = value; }

    @JsonProperty("spo2_auto")
    public long getSpo2Auto() { return spo2Auto; }
    @JsonProperty("spo2_auto")
    public void setSpo2Auto(long value) { this.spo2Auto = value; }

}
