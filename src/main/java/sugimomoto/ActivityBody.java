package sugimomoto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ActivityBody {
    private List<Activity> activities;

    private boolean more;
    
    private long offset;

    @JsonProperty("activities")
    public List<Activity> getActivities() { return activities; }
    
    @JsonProperty("activities")
    public void setActivities(List<Activity> value) { this.activities = value; }

    @JsonProperty("more")
    public boolean getMore() { return more; }
    
    @JsonProperty("more")
    public void setMore(boolean value) { this.more = value; }

    @JsonProperty("offset")
    public long getOffset() { return offset; }
    
    @JsonProperty("offset")
    public void setOffset(long value) { this.offset = value; }
}
