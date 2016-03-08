package by.it.Baranova.JD01_09_MathLab.Exceptions;

/**
 * Created by Ekaterina on 3/5/16.
 */
public class DifferentSizesException extends Exception {
    public DifferentSizesException() {}
    public DifferentSizesException (String message, Throwable exception) {
        super(message, exception);
    }
    public DifferentSizesException (String message) {
        System.out.println("ERR:"+message);
    }
    public DifferentSizesException (Throwable exception) {
        super(exception);
    }
}
