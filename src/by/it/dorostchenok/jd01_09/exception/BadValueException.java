package by.it.dorostchenok.jd01_09.exception;

import by.it.dorostchenok.jd01_09.services.Expression;

public class BadValueException extends Exception{
    public BadValueException(){
        super("Bad Value");
    }

    public BadValueException(String message){
        super(message);
    }
}
