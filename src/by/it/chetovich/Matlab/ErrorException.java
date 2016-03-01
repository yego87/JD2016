package by.it.chetovich.Matlab;

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
