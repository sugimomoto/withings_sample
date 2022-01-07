package sugimomoto.withings4j.model;

public enum ResponseType {
    AUTHORIZATION_CODE("code");

    private final String value;

    private ResponseType(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }

}
