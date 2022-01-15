package sugimomoto.withings4j.query;

public class MeasurevGetactivityQueryParameters extends QueryParameters {

    public MeasurevGetactivityQueryParameters() {
        this.builder.add("action", "getactivity");
    }

    public void setStartDateYMD(String startDateYMD) {
        this.builder.add("startdateymd", startDateYMD);
    }

    public void setEndDateYMD(String endDateYMD) {
        this.builder.add("enddateymd", endDateYMD);
    }

    public void setLastUpdate(Integer lastUpdate) {
        this.builder.add("lastupdate", lastUpdate.toString());
    }

    public void setOffset(Integer offset) {
        this.builder.add("offset", offset.toString());
    }

    public void setDataFileds(String dataFileds) {
        this.builder.add("data_fields", dataFileds);
    }
}
