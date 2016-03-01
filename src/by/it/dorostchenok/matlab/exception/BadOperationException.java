package by.it.dorostchenok.matlab.exception;

public class BadOperationException extends Exception{

    public BadOperationException(){
        super("Operation not found");
    }
    public BadOperationException(String message){
        super(message);
    }

}
