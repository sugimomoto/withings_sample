package sugimomoto;

import java.util.List;

public class ActivityBase {
    
    private Integer status;

    private List<Activity> body;

    private String error;

    public List<Activity> getBody(){
        return body;
    }

    public void setBody(List<Activity> body){
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
