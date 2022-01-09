package sugimomoto.withings4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Hr {
    private long timestamp;

    @JsonProperty("$timestamp")
    public long getTimestamp() { return timestamp; }
    @JsonProperty("$timestamp")
    public void setTimestamp(long value) { this.timestamp = value; }
}
