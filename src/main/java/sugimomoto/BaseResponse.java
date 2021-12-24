package sugimomoto;

public class BaseResponse {

    private Integer status;

    private AccessTokenResponse body;

    public AccessTokenResponse getBody(){
        return body;
    }

    public void setBody(AccessTokenResponse body){
        this.body = body;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
