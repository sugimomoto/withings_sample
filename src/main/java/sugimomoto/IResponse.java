package sugimomoto;

public interface IResponse {
    public Integer getStatus();
    
    public void setStatus(Integer value);

    public String getError();

    public void setError(String error);
}
