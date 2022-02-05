package sugimomoto.withings4j.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserBody {
    
    private User user;

    @JsonProperty("user")
    public User getUser() { return user; }
    @JsonProperty("user")
    public void setUser(User value) { this.user = value; }
}
