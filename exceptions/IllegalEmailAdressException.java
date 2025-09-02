package exceptions;

public class IllegalEmailAdressException extends RuntimeException {
    public IllegalEmailAdressException () {

    }
    public IllegalEmailAdressException(String message) {
        super(message);
    }
}