package by.it.dorostchenok.jd01_09.exception;

public class OperationNotFoundException extends Exception{

    public OperationNotFoundException(){
        super("Operation not found");
    }
    public OperationNotFoundException(String message){
        super(message);
    }

}
