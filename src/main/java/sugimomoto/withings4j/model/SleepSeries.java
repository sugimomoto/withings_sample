package sugimomoto.withings4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SleepSeries {
    private long startdate;
    private long enddate;
    private long state;
    private Hr hr;
    private Hr rr;
    private Hr snoring;

    @JsonProperty("startdate")
    public long getStartdate() { return startdate; }
    @JsonProperty("startdate")
    public void setStartdate(long value) { this.startdate = value; }

    @JsonProperty("enddate")
    public long getEnddate() { return enddate; }
    @JsonProperty("enddate")
    public void setEnddate(long value) { this.enddate = value; }

    @JsonProperty("state")
    public long getState() { return state; }
    @JsonProperty("state")
    public void setState(long value) { this.state = value; }

    @JsonProperty("hr")
    public Hr getHr() { return hr; }
    @JsonProperty("hr")
    public void setHr(Hr value) { this.hr = value; }

    @JsonProperty("rr")
    public Hr getRr() { return rr; }
    @JsonProperty("rr")
    public void setRr(Hr value) { this.rr = value; }

    @JsonProperty("snoring")
    public Hr getSnoring() { return snoring; }
    @JsonProperty("snoring")
    public void setSnoring(Hr value) { this.snoring = value; }
}
