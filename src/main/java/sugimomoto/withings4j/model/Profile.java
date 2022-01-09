package sugimomoto.withings4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Profile {
    private long appli;
    private String callbackurl;
    private long expires;
    private String comment;

    @JsonProperty("appli")
    public long getAppli() { return appli; }
    @JsonProperty("appli")
    public void setAppli(long value) { this.appli = value; }

    @JsonProperty("callbackurl")
    public String getCallbackurl() { return callbackurl; }
    @JsonProperty("callbackurl")
    public void setCallbackurl(String value) { this.callbackurl = value; }

    @JsonProperty("expires")
    public long getExpires() { return expires; }
    @JsonProperty("expires")
    public void setExpires(long value) { this.expires = value; }

    @JsonProperty("comment")
    public String getComment() { return comment; }
    @JsonProperty("comment")
    public void setComment(String value) { this.comment = value; }

}
