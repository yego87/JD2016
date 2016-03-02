package by.it.predkel.JD07OOP;

/**
 * Created by Admin on 29.02.2016.
 */
public class MyException extends Exception {
    public MyException(){
    }
    public MyException(String message, Throwable exception){
        super(message,exception);
    }
    public MyException(String message){
        super(message);
    }
    public MyException(Throwable exception){
        super(exception);
    }
}
