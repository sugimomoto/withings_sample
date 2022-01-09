package sugimomoto.withings4j.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class NotifyBody {
    private List<Profile> profiles;

    @JsonProperty("profiles")
    public List<Profile> getProfiles() { return profiles; }
    @JsonProperty("profiles")
    public void setProfiles(List<Profile> value) { this.profiles = value; }
}
