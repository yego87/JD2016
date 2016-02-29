package by.it.dorostchenok.jd01_09.values;

public class Variable extends Value {

    private Value variableValue;

    public Value getVariableValue() {
        return variableValue;
    }

    public void setVariableValue(Value variableValue) {
        this.variableValue = variableValue;
    }

    public Variable(String variableName) {
        super(variableName);
    }

    @Override
    public String toString(){
        return "Type: " + this.getClass().getSimpleName() +
                "; Name " + value + "; Value: " + variableValue.toString();
    }
}
