package sugimomoto.withings4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NotifyListBase extends ResponseBase {
    private NotifyBody body;

    @JsonProperty("body")
    public NotifyBody getBody() { return body; }
    @JsonProperty("body")
    public void setBody(NotifyBody value) { this.body = value; }
}
