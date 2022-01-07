package sugimomoto.withings4j.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Measuregrp {
    private long grpid;
    private long attrib;
    private long date;
    private long created;
    private long category;
    private String deviceid;
    private String hashDeviceid;
    private List<Measure> measures;
    private String comment;

    @JsonProperty("grpid")
    public long getGrpid() { return grpid; }
    @JsonProperty("grpid")
    public void setGrpid(long value) { this.grpid = value; }

    @JsonProperty("attrib")
    public long getAttrib() { return attrib; }
    @JsonProperty("attrib")
    public void setAttrib(long value) { this.attrib = value; }

    @JsonProperty("date")
    public long getDate() { return date; }
    @JsonProperty("date")
    public void setDate(long value) { this.date = value; }

    @JsonProperty("created")
    public long getCreated() { return created; }
    @JsonProperty("created")
    public void setCreated(long value) { this.created = value; }

    @JsonProperty("category")
    public long getCategory() { return category; }
    @JsonProperty("category")
    public void setCategory(long value) { this.category = value; }

    @JsonProperty("deviceid")
    public String getDeviceid() { return deviceid; }
    @JsonProperty("deviceid")
    public void setDeviceid(String value) { this.deviceid = value; }

    @JsonProperty("hash_deviceid")
    public String getHashDeviceid() { return hashDeviceid; }
    @JsonProperty("hash_deviceid")
    public void setHashDeviceid(String value) { this.hashDeviceid = value; }

    @JsonProperty("measures")
    public List<Measure> getMeasures() { return measures; }
    @JsonProperty("measures")
    public void setMeasures(List<Measure> value) { this.measures = value; }

    @JsonProperty("comment")
    public String getComment() { return comment; }
    @JsonProperty("comment")
    public void setComment(String value) { this.comment = value; }
}
