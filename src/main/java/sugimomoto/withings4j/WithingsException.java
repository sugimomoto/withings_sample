package sugimomoto.withings4j;

public abstract class WithingsException extends RuntimeException {

    public WithingsException(String message) {
        super(message);
    }

    public WithingsException(Throwable cause) {
        super(cause);
    }

    public WithingsException(String message, Throwable cause) {
        super(message, cause);
    }

    public abstract Integer getStatus();
    
}
