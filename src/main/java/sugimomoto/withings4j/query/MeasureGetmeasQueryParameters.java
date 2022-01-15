package sugimomoto.withings4j.query;

import java.util.Arrays;
import java.util.stream.Collectors;

import sugimomoto.withings4j.model.*;

public class MeasureGetmeasQueryParameters extends QueryParameters {
    public MeasureGetmeasQueryParameters() {
        this.builder.add("action", WithingsActionType.MEASURE_GETMEAS_GETMEAS.getValue());
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

    public void setMeasType(MeasType measType) {
        this.builder.add("meastype",measType.getValue().toString());
    }

    public void setMeasTypes(MeasType[] measTypes) {
        this.builder.add("meastypes", Arrays.asList(measTypes).stream().map(x -> x.getValue().toString()).collect(Collectors.joining(",")));
    }

    public void setCategory(MeasCategory measCategory) {
        this.builder.add("category", measCategory.getValue().toString());
    }
}
