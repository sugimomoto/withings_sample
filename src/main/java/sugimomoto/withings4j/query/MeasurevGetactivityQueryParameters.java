package sugimomoto.withings4j.query;

public class MeasurevGetactivityQueryParameters extends QueryParameters {

    public MeasurevGetactivityQueryParameters() {
        this.parameters.put("action", "getactivity");
    }

    public void setStartDateYMD(String startDateYMD) {
        this.parameters.put("startdateymd", startDateYMD);
    }

    public void setEndDateYMD(String endDateYMD) {
        this.parameters.put("enddateymd", endDateYMD);
    }

    public void setLastUpdate(Integer lastUpdate) {
        this.parameters.put("lastupdate", lastUpdate.toString());
    }

    public void setOffset(Integer offset) {
        this.parameters.put("offset", offset.toString());
    }

    public void setDataFileds(String dataFileds) {
        this.parameters.put("data_fields", dataFileds);
    }
}
