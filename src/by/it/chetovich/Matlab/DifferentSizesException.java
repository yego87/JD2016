package by.it.chetovich.Matlab;

/**
 * Exception if vectors and arrays have incompatibile sizes for multiplication
 */
public class DifferentSizesException extends Exception {

    String message;

    public DifferentSizesException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
