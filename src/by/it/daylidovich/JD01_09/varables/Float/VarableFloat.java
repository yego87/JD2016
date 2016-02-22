package by.it.daylidovich.JD01_09.varables.Float;

import by.it.daylidovich.JD01_09.interfaces.IVarable;
<<<<<<< 5a42fcc90c96f8fca1ecd21a9d7fecfe6cd95a43

public class VarableFloat extends OperationFloat implements IVarable{
=======
import by.it.daylidovich.JD01_09.varables.Varable;

public class VarableFloat extends Varable implements IVarable{
>>>>>>> JD01_09 start.
    private double value = 0;

    public VarableFloat(double value){this.value = value;}

    public VarableFloat(String string){this.value = Double.parseDouble(string);}

    public double getValue() {return value;}

    @Override
    public String toString() {
        return ((Double)value).toString();
    }
}
