package sugimomoto.withings4j.model;

import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SleepSummarySeries {
    
    private String timezone;
    private long model;
    private long modelID;
    private long startdate;
    private long enddate;
    private LocalDate date;
    private long created;
    private long modified;
    private SleepSummaryData data;

    @JsonProperty("timezone")
    public String getTimezone() { return timezone; }
    @JsonProperty("timezone")
    public void setTimezone(String value) { this.timezone = value; }

    @JsonProperty("model")
    public long getModel() { return model; }
    @JsonProperty("model")
    public void setModel(long value) { this.model = value; }

    @JsonProperty("model_id")
    public long getModelID() { return modelID; }
    @JsonProperty("model_id")
    public void setModelID(long value) { this.modelID = value; }

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

    @JsonProperty("created")
    public long getCreated() { return created; }
    @JsonProperty("created")
    public void setCreated(long value) { this.created = value; }

    @JsonProperty("modified")
    public long getModified() { return modified; }
    @JsonProperty("modified")
    public void setModified(long value) { this.modified = value; }

    @JsonProperty("data")
    public SleepSummaryData getData() { return data; }
    @JsonProperty("data")
    public void setData(SleepSummaryData value) { this.data = value; }
}
