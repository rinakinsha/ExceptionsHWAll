package ExceptionsHW3;

public class WrongLoginException extends Exception {
    private String detail;

    public WrongLoginException() {
        detail = "Неверный формат ввода логина";
    }

    public WrongLoginException(String message) {
        super(message);
        detail = message;
    }

    public String toString() {
        return "WrongLoginException: " + detail;
    }
}
