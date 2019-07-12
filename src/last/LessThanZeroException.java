package last;

public class LessThanZeroException extends RuntimeException {
    public LessThanZeroException() {

    }

    public LessThanZeroException(String message) {
        super(message);
    }
}