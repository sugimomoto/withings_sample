package sugimomoto.withings4j.model;

public enum MeasCategory {
    RealMeasures(1),
    UserObjectives(2);

    private final Integer value;

    private MeasCategory(Integer value){
        this.value = value;
    }

    public Integer getValue(){
        return value;
    }
}
