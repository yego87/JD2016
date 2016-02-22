package by.it.daylidovich.JD01_09.varables.Float;

import by.it.daylidovich.JD01_09.interfaces.IVarable;
import by.it.daylidovich.JD01_09.varables.Varable;

public class VarableFloat extends Varable implements IVarable{
    private double value = 0;

    public VarableFloat(double value){this.value = value;}

    public VarableFloat(String string){this.value = Double.parseDouble(string);}

    public double getValue() {return value;}

    @Override
    public String toString() {
        return ((Double)value).toString();
    }
}
