package sugimomoto.withings4j.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeviceBody {
    
    private List<Device> devices;

    @JsonProperty("devices")
    public List<Device> getDevices() { return devices; }
    @JsonProperty("devices")
    public void setDevices(List<Device> value) { this.devices = value; }
}
