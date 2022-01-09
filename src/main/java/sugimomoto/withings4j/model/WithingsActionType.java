package sugimomoto.withings4j.model;

public enum WithingsActionType {
    /*
    OAuth 2.0 - Get your access token : requesttoken
    OAuth 2.0 - Refresh your access token : requesttoken
    OAuth 2.0 - Retrieve a new authorization code : recoverauthorizationcode
    Dropshipment v2 - Createorder : createorder
    Dropshipment v2 - Createuserorder : createuserorder
    Dropshipment v2 - Delete : delete
    Dropshipment v2 - Getorderstatus : getorderstatus
    Dropshipment v2 - Update : update
    User v2 - Activate : activate
    User v2 - Get : get
    User v2 - Getdevice : getdevice
    User v2 - Getgoals : getgoals
    User v2 - Link : link
    User v2 - Unlink : unlink
    Measure - Getmeas : getmeas
    Measure v2 - Getactivity : getactivity
    Measure v2 - Getintradayactivity : getintradayactivity
    Measure v2 - Getworkouts : getworkouts
    Heart v2 - Get : get
    Heart v2 - List : list
    Sleep v2 - Get : get
    Sleep v2 - Getsummary : getsummary
    Notify - Get : get
    Notify - List : list
    Notify - Revoke : revoke
    Notify - Subscribe : subscribe
    Notify - Update : update
    Signature v2 - Getnonce : getnonce
    */

    OAUTH_20_GET_YOUR_ACCESS_TOKEN_REQUESTTOKEN("requesttoken"),
    OAUTH_20_REFRESH_YOUR_ACCESS_TOKEN_REQUESTTOKEN("requesttoken"),
    OAUTH_20_RETRIEVE_A_NEW_AUTHORIZATION_CODE_RECOVERAUTHORIZATIONCODE("recoverauthorizationcode"),
    DROPSHIPMENT_V2_CREATEORDER_CREATEORDER("createorder"),
    DROPSHIPMENT_V2_CREATEUSERORDER_CREATEUSERORDER("createuserorder"),
    DROPSHIPMENT_V2_DELETE_DELETE("delete"),
    DROPSHIPMENT_V2_GETORDERSTATUS_GETORDERSTATUS("getorderstatus"),
    DROPSHIPMENT_V2_UPDATE_UPDATE("update"),
    USER_V2_ACTIVATE_ACTIVATE("activate"),
    USER_V2_GET_GET("get"),
    USER_V2_GETDEVICE_GETDEVICE("getdevice"),
    USER_V2_GETGOALS_GETGOALS("getgoals"),
    USER_V2_LINK_LINK("link"),
    USER_V2_UNLINK_UNLINK("unlink"),
    MEASURE_GETMEAS_GETMEAS("getmeas"),
    MEASURE_V2_GETACTIVITY_GETACTIVITY("getactivity"),
    MEASURE_V2_GETINTRADAYACTIVITY_GETINTRADAYACTIVITY("getintradayactivity"),
    MEASURE_V2_GETWORKOUTS_GETWORKOUTS("getworkouts"),
    HEART_V2_GET_GET("get"),
    HEART_V2_LIST_LIST("list"),
    SLEEP_V2_GET_GET("get"),
    SLEEP_V2_GETSUMMARY_GETSUMMARY("getsummary"),
    NOTIFY_GET_GET("get"),
    NOTIFY_LIST_LIST("list"),
    NOTIFY_REVOKE_REVOKE("revoke"),
    NOTIFY_SUBSCRIBE_SUBSCRIBE("subscribe"),
    NOTIFY_UPDATE_UPDATE("update"),
    SIGNATURE_V2_GETNONCE_GETNONCE("getnonce"); 
    private final String value;

    private WithingsActionType(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
