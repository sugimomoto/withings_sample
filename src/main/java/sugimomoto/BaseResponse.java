package sugimomoto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class BaseResponse {

    private Integer status;

    private AccessTokenResponse body;

    private String error;

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

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
