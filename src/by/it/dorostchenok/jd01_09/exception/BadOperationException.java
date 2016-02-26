package by.it.dorostchenok.jd01_09.exception;

public class BadOperationException extends Exception{

    public BadOperationException(){
        super("Operation not found");
    }
    public BadOperationException(String message){
        super(message);
    }

}
