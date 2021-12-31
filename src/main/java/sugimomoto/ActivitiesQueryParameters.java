package sugimomoto;

public class ActivitiesQueryParameters {

    private String startDateYMD;

    private String endDateYMD;

    private Integer lastUpdate;

    private Integer offset;

    private String dataFileds;

    public String getStartDateYMD() {
        return startDateYMD;
    }

    public void setStartDateYMD(String startDateYMD) {
        this.startDateYMD = startDateYMD;
    }

    public String getEndDateYMD() {
        return endDateYMD;
    }

    public void setEndDateYMD(String endDateYMD) {
        this.endDateYMD = endDateYMD;
    }

    public Integer getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Integer lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public String getDataFileds() {
        return dataFileds;
    }

    public void setDataFileds(String dataFileds) {
        this.dataFileds = dataFileds;
    }
}
