package sugimomoto;

public class MeasQueryParameters extends QueryParameters {
    public MeasQueryParameters() {
        this.builder.add("action", "getmeas");
    }

    public void setStartDate(String startDate) {
        this.builder.add("startdate", startDate);
    }

    public void setEndDate(String endDate) {
        this.builder.add("enddate", endDate);
    }

    public void setLastUpdate(Integer lastUpdate) {
        this.builder.add("lastupdate", lastUpdate.toString());
    }

    public void setOffset(Integer offset) {
        this.builder.add("offset", offset.toString());
    }

    public void setMeasType(MeasType weight) {
    }

    public void setMeasTypes(MeasType[] measTypes) {
    }

    public void setCategory(MeasCategory realmeasures) {
    }

}
