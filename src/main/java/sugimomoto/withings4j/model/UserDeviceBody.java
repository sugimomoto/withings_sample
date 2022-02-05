package sugimomoto.withings4j.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDeviceBody {
    
    private User user;
    private List<Device> devices;

    @JsonProperty("user")
    public User getUser() { return user; }
    @JsonProperty("user")
    public void setUser(User value) { this.user = value; }

    @JsonProperty("devices")
    public List<Device> getDevices() { return devices; }
    @JsonProperty("devices")
    public void setDevices(List<Device> value) { this.devices = value; }
}
