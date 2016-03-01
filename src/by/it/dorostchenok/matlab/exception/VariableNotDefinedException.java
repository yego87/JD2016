package by.it.dorostchenok.matlab.exception;

public class VariableNotDefinedException extends Exception{
    public VariableNotDefinedException(){
        super("Variable is not defined");
    }
}
