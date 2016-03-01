package by.it.dorostchenok.matlab.exception;

public class BadValueException extends Exception{
    public BadValueException(){
        super("Bad Value");
    }

    public BadValueException(String message){
        super(message);
    }
}
