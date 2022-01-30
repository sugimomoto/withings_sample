package sugimomoto.withings4j.query;

import java.util.Arrays;
import java.util.stream.Collectors;

import sugimomoto.withings4j.model.*;

public class MeasureGetmeasQueryParameters extends QueryParameters {
    public MeasureGetmeasQueryParameters() {
        this.parameters.put("action", WithingsActionType.MEASURE_GETMEAS_GETMEAS.getValue());
    }

    public void setStartDate(String startDate) {
        this.parameters.put("startdate", startDate);
    }

    public void setEndDate(String endDate) {
        this.parameters.put("enddate", endDate);
    }

    public void setLastUpdate(Integer lastUpdate) {
        this.parameters.put("lastupdate", lastUpdate.toString());
    }

    public void setOffset(Integer offset) {
        this.parameters.put("offset", offset.toString());
    }

    public void setMeasType(MeasType measType) {
        this.parameters.put("meastype",measType.getValue().toString());
    }

    public void setMeasTypes(MeasType[] measTypes) {
        this.parameters.put("meastypes", Arrays.asList(measTypes).stream().map(x -> x.getValue().toString()).collect(Collectors.joining(",")));
    }

    public void setCategory(MeasCategory measCategory) {
        this.parameters.put("category", measCategory.getValue().toString());
    }
}
