package sugimomoto;

public class WithingsAPIException extends WithingsException {
    private Integer status;

    public WithingsAPIException(String message) {
        super(message);
    }

    public WithingsAPIException(String message,Integer status) {
        super(message);
        this.status = status;
    }

    public WithingsAPIException(Throwable cause) {
        super(cause);
    }

    public WithingsAPIException(String message, Throwable cause) {
        super(message, cause);
    }

    public WithingsAPIException(String message, Throwable cause, Integer status) {
        super(message, cause);
        this.status = status;
    }

    @Override
    public Integer getStatus() {
        return status;
    }
}
