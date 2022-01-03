package sugimomoto;

public enum MeasCategory {
    RealMeasures(1),
    UserObjectives(2);

    private final int value;

    private MeasCategory(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
