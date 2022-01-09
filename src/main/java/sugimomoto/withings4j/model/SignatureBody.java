package sugimomoto.withings4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SignatureBody {
    private String nonce;

    @JsonProperty("nonce")
    public String getNonce() { return nonce; }
    @JsonProperty("nonce")
    public void setNonce(String value) { this.nonce = value; }

}
