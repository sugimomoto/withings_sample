package sugimomoto.withings4j.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MeasBody {
    private String updatetime;
    private String timezone;
    private List<Measuregrp> measuregrps;
    private long more;
    private long offset;

    @JsonProperty("updatetime")
    public String getUpdatetime() { return updatetime; }
    @JsonProperty("updatetime")
    public void setUpdatetime(String value) { this.updatetime = value; }

    @JsonProperty("timezone")
    public String getTimezone() { return timezone; }
    @JsonProperty("timezone")
    public void setTimezone(String value) { this.timezone = value; }

    @JsonProperty("measuregrps")
    public List<Measuregrp> getMeasuregrps() { return measuregrps; }
    @JsonProperty("measuregrps")
    public void setMeasuregrps(List<Measuregrp> value) { this.measuregrps = value; }

    @JsonProperty("more")
    public long getMore() { return more; }
    @JsonProperty("more")
    public void setMore(long value) { this.more = value; }

    @JsonProperty("offset")
    public long getOffset() { return offset; }
    @JsonProperty("offset")
    public void setOffset(long value) { this.offset = value; }
    
}
