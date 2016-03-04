package by.it.daylidovich.FreeMathLab.variables.Float;

import by.it.daylidovich.FreeMathLab.interfaces.IVarable;

public class VariableFloat extends OperationFloat implements IVarable{
    private double value = 0;

    public VariableFloat(double value){this.value = value;}

    public VariableFloat(String string){this.value = Double.parseDouble(string);}

    public double getValue() {return value;}

    @Override
    public String toString() {
        return ((Double)value).toString();
    }
}
