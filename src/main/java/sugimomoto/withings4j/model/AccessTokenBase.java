package sugimomoto.withings4j.model;

public class AccessTokenBase extends ResponseBase {

    private AccessToken body;

    public AccessToken getBody(){
        return body;
    }

    public void setBody(AccessToken body){
        this.body = body;
    }
}
