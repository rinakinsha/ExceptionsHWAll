package ExceptionsHW3;

public class WrongPasswordException extends Exception {
    private String detail;

    public WrongPasswordException() {
        detail = "Неверный формат ввода пароля";
    }

    public WrongPasswordException(String message) {
        super(message);
        detail = message;
    }

    public String toString() {
        return "WrongPasswordException: " + detail;
    }
}
