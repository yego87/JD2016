package by.it.daylidovich.JD01_09.varables.Float;

import by.it.daylidovich.JD01_09.interfaces.IAddation;
import by.it.daylidovich.JD01_09.interfaces.IDivision;
import by.it.daylidovich.JD01_09.interfaces.IMultiplication;
import by.it.daylidovich.JD01_09.interfaces.ISubtraction;
import by.it.daylidovich.JD01_09.varables.Varable;

public class OperationFloat extends Varable implements IAddation, ISubtraction, IMultiplication, IDivision {
    private double value = 0;

    @Override
    public Varable add(Varable varable) {
        if (varable instanceof VarableFloat)
            return new VarableFloat(this.value + ((VarableFloat) varable).getValue());
        return varable.add(this);
    }

    @Override
    public Varable sub(Varable varable) {
        return super.sub(varable);
    }

    @Override
    public Varable mult(Varable varable) {
        return super.mult(varable);
    }

    @Override
    public Varable div(Varable varable) {
        return super.div(varable);
    }
}
