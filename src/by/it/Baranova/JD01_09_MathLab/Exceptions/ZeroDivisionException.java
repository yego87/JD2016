package by.it.Baranova.JD01_09_MathLab.Exceptions;

/**
 * Created by Ekaterina on 3/4/16.
 */
public class ZeroDivisionException extends Exception {
    public ZeroDivisionException() {}
    public ZeroDivisionException (String message, Throwable exception) {
        super(message, exception);
    }
    public ZeroDivisionException (String message) {
        System.out.println("ERR:"+message);
    }
    public ZeroDivisionException (Throwable exception) {
        super(exception);
    }
}

