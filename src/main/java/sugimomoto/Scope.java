package sugimomoto;

public enum Scope {
    USER_ACTIVITY("user.activity"),
    USER_METRICS("user.metrics");

    private final String value;

    private Scope(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
