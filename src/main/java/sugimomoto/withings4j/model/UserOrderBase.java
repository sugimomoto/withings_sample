package sugimomoto.withings4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserOrderBase extends ResponseBaseAbstract {
    private UserOrderBody body;

    @JsonProperty("body")
    public UserOrderBody getBody() { return body; }
    @JsonProperty("body")
    public void setBody(UserOrderBody value) { this.body = value; }
}
