package sugimomoto;

public class BaseResponse<E> {

    private Integer status;

    private E body;

    public E getBody(){
        return body;
    }

    public void setBody(E body){
        this.body = body;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
