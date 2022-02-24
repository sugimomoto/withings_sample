package sugimomoto.withings4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Device {
    
    private String macAddress;
    private String type;
    private String model;
    private long modelID;
    private String battery;
    private String deviceid;
    private String hashDeviceid;
    private String timezone;
    private long lastSessionDate;

    @JsonProperty("mac_address")
    public String getMACAddress() { return macAddress; }
    @JsonProperty("mac_address")
    public void setMACAddress(String value) { this.macAddress = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("model")
    public String getModel() { return model; }
    @JsonProperty("model")
    public void setModel(String value) { this.model = value; }

    @JsonProperty("model_id")
    public long getModelID() { return modelID; }
    @JsonProperty("model_id")
    public void setModelID(long value) { this.modelID = value; }

    @JsonProperty("battery")
    public String getBattery() { return battery; }
    @JsonProperty("battery")
    public void setBattery(String value) { this.battery = value; }

    @JsonProperty("deviceid")
    public String getDeviceid() { return deviceid; }
    @JsonProperty("deviceid")
    public void setDeviceid(String value) { this.deviceid = value; }

    @JsonProperty("hash_deviceid")
    public String getHashDeviceid() { return hashDeviceid; }
    @JsonProperty("hash_deviceid")
    public void setHashDeviceid(String value) { this.hashDeviceid = value; }


    @JsonProperty("timezone")
    public String getTimezone() { return timezone; }
    @JsonProperty("timezone")
    public void setTimezone(String value) { this.timezone = value; }

    @JsonProperty("last_session_date")
    public long getLastSessionDate() { return lastSessionDate; }
    @JsonProperty("last_session_date")
    public void setLastSessionDate(long value) { this.lastSessionDate = value; }
}
