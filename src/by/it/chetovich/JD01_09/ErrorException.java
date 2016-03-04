package by.it.chetovich.JD01_09;

/**
 * class to print error text for unacceptable operation
 */
public class ErrorException extends Exception {

    String message;

    public ErrorException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
