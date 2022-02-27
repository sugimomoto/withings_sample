package sugimomoto.withings4j.model;


import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SleepSeries {
    private long startdate;
    private long enddate;
    private long state;
    private String model;
    private Map<String, Integer> hr;
    private Map<String, Integer> rr;
    private Map<String, Integer> snoring;
    private Map<String, Integer> sdnn1;
    private Map<String, Integer> rmssd;
    private String hashDeviceId;
    private long modelId;

    @JsonProperty("startdate")
    public long getStartdate() { return startdate; }
    @JsonProperty("startdate")
    public void setStartdate(long value) { this.startdate = value; }

    @JsonProperty("enddate")
    public long getEnddate() { return enddate; }
    @JsonProperty("enddate")
    public void setEnddate(long value) { this.enddate = value; }

    @JsonProperty("state")
    public long getState() { return state; }
    @JsonProperty("state")
    public void setState(long value) { this.state = value; }

    @JsonProperty("model")
    public String getModel() { return model; }
    @JsonProperty("model")
    public void setModel(String value) { this.model = value; }

    @JsonProperty("hr")
    public Map<String, Integer> getHr() { return hr; }
    @JsonProperty("hr")
    public void setHr(Map<String, Integer> value) { this.hr = value; }

    @JsonProperty("rr")
    public Map<String, Integer> getRr() { return rr; }
    @JsonProperty("rr")
    public void setRr(Map<String, Integer> value) { this.rr = value; }

    @JsonProperty("snoring")
    public Map<String, Integer> getSnoring() { return snoring; }
    @JsonProperty("snoring")
    public void setSnoring(Map<String, Integer> value) { this.snoring = value; }

    @JsonProperty("sdnn_1")
    public Map<String, Integer> getSdnn1() { return sdnn1; }
    @JsonProperty("sdnn_1")
    public void setSdnn1(Map<String, Integer> value) { this.sdnn1 = value; }

    @JsonProperty("rmssd")
    public Map<String, Integer> getRmssd() { return rmssd; }
    @JsonProperty("rmssd")
    public void setRmssd(Map<String, Integer> value) { this.rmssd = value; }

    @JsonProperty("hash_deviceid")
    public String getHashDeviceId() { return hashDeviceId; }
    @JsonProperty("hash_deviceid")
    public void setHashDeviceid(String value) { this.hashDeviceId = value; }

    @JsonProperty("model_id")
    public long getModelId() { return modelId; }
    @JsonProperty("model_id")
    public void setModelId(long value) { this.modelId = value; }

}
