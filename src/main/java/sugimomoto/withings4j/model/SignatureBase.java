package sugimomoto.withings4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SignatureBase extends ResponseBase {
    private SignatureBody body;

    @JsonProperty("body")
    public SignatureBody getBody() { return body; }
    @JsonProperty("body")
    public void setBody(SignatureBody value) { this.body = value; }
}
