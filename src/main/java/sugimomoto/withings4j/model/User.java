package sugimomoto.withings4j.model;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    private String code;
    private UUID externalID;

    @JsonProperty("code")
    public String getCode() { return code; }
    @JsonProperty("code")
    public void setCode(String value) { this.code = value; }

    @JsonProperty("external_id")
    public UUID getExternalID() { return externalID; }
    @JsonProperty("external_id")
    public void setExternalID(UUID value) { this.externalID = value; }

}
