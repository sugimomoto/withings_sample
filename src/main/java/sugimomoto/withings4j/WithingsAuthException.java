package sugimomoto.withings4j;

public class WithingsAuthException extends WithingsException {

    private Integer status;

    public WithingsAuthException(String message) {
        super(message);
    }

    public WithingsAuthException(String message,Integer status) {
        super(message);
        this.status = status;
    }

    public WithingsAuthException(Throwable cause) {
        super(cause);
    }

    public WithingsAuthException(String message, Throwable cause) {
        super(message, cause);
    }

    public WithingsAuthException(String message, Throwable cause, Integer status) {
        super(message, cause);
        this.status = status;
    }

    @Override
    public Integer getStatus() {
        return status;
    }
}
