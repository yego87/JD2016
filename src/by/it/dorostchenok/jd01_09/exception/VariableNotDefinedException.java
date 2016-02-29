package by.it.dorostchenok.jd01_09.exception;

public class VariableNotDefinedException extends Exception{
    public VariableNotDefinedException(){
        super("Variable is not defined");
    }
}
