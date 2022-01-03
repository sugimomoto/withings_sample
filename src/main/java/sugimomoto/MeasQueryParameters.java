package sugimomoto;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
