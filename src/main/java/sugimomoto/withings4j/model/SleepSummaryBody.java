package sugimomoto.withings4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class SleepSummaryBody {
    
    private List<SleepSummarySeries> series;
    private boolean more;
    private long offset;

    @JsonProperty("series")
    public List<SleepSummarySeries> getSeries() { return series; }
    @JsonProperty("series")
    public void setSeries(List<SleepSummarySeries> value) { this.series = value; }

    @JsonProperty("more")
    public boolean getMore() { return more; }
    @JsonProperty("more")
    public void setMore(boolean value) { this.more = value; }

    @JsonProperty("offset")
    public long getOffset() { return offset; }
    @JsonProperty("offset")
    public void setOffset(long value) { this.offset = value; }
}
