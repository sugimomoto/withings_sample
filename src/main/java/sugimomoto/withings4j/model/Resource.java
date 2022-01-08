package sugimomoto.withings4j.model;

public enum Resource {
    /*
    https://wbsapi.withings.net/v2/oauth2
    https://wbsapi.withings.net/v2/dropshipment
    https://wbsapi.withings.net/v2/user 
    https://wbsapi.withings.net/measure
    https://wbsapi.withings.net/v2/measure
    https://wbsapi.withings.net/v2/heart 
    https://wbsapi.withings.net/v2/sleep
    https://wbsapi.withings.net/notify 
    https://wbsapi.withings.net/v2/signature
    */

    V2_OAUTH2("/v2/oauth2"),
    V2_DROPSHIPMENT("/v2/dropshipment"),
    V2_USER("/v2/user"),
    V1_MEASURE("/measure"),
    V2_MEASURE("/v2/measure"),
    V2_HEART("/v2/heart"),
    V2_SLEEP("/v2/sleep"),
    V1_NOTIFY("/notify"),
    V2_SIGNATURE("/v2/signature");

    private final String value;

    private Resource(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
