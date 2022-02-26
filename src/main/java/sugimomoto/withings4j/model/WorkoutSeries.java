package sugimomoto.withings4j.model;

import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonProperty;

public class WorkoutSeries {
    private long category;
    private String timezone;
    private long model;
    private long attrib;
    private long startdate;
    private long enddate;
    private LocalDate date;
    private long modified;
    private String deviceid;
    private WorkoutsData data;

    @JsonProperty("category")
    public long getCategory() { return category; }
    @JsonProperty("category")
    public void setCategory(long value) { this.category = value; }

    @JsonProperty("timezone")
    public String getTimezone() { return timezone; }
    @JsonProperty("timezone")
    public void setTimezone(String value) { this.timezone = value; }

    @JsonProperty("model")
    public long getModel() { return model; }
    @JsonProperty("model")
    public void setModel(long value) { this.model = value; }

    @JsonProperty("attrib")
    public long getAttrib() { return attrib; }
    @JsonProperty("attrib")
    public void setAttrib(long value) { this.attrib = value; }

    @JsonProperty("startdate")
    public long getStartdate() { return startdate; }
    @JsonProperty("startdate")
    public void setStartdate(long value) { this.startdate = value; }

    @JsonProperty("enddate")
    public long getEnddate() { return enddate; }
    @JsonProperty("enddate")
    public void setEnddate(long value) { this.enddate = value; }

    @JsonProperty("date")
    public LocalDate getDate() { return date; }
    @JsonProperty("date")
    public void setDate(LocalDate value) { this.date = value; }

    @JsonProperty("modified")
    public long getModified() { return modified; }
    @JsonProperty("modified")
    public void setModified(long value) { this.modified = value; }

    @JsonProperty("deviceid")
    public String getDeviceid() { return deviceid; }
    @JsonProperty("deviceid")
    public void setDeviceid(String value) { this.deviceid = value; }

    @JsonProperty("data")
    public WorkoutsData getData() { return data; }
    @JsonProperty("data")
    public void setData(WorkoutsData value) { this.data = value; }

}
