package sugimomoto.withings4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserBase extends ResponseBase {
    private UserBody body;

    @JsonProperty("body")
    public UserBody getBody() { return body; }
    @JsonProperty("body")
    public void setBody(UserBody value) { this.body = value; }
}
