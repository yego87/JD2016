package by.it.daylidovich.JD01_09.varables.Float;

import by.it.daylidovich.JD01_09.interfaces.IAddation;
import by.it.daylidovich.JD01_09.interfaces.IDivision;
import by.it.daylidovich.JD01_09.interfaces.IMultiplication;
import by.it.daylidovich.JD01_09.interfaces.ISubtraction;
import by.it.daylidovich.JD01_09.varables.Varable;

public class OperationFloat extends Varable implements IAddation, ISubtraction, IMultiplication, IDivision {

    @Override
    public Varable add(Varable varable) {
        if (varable instanceof VarableFloat)
            return new VarableFloat(((VarableFloat)this).getValue() + ((VarableFloat) varable).getValue());
        return varable.add(this);
    }

    @Override
    public Varable sub(Varable varable) {
        if (varable instanceof Varable)
            return new VarableFloat(((VarableFloat)this).getValue() - ((VarableFloat)varable).getValue());
        VarableFloat minus = new VarableFloat(-1);
        return minus.mult(varable.sub(this));
    }

    @Override
    public Varable mult(Varable varable) {
        if (varable instanceof VarableFloat)
            return new VarableFloat(((VarableFloat)this).getValue() * ((VarableFloat)varable).getValue());
        return varable.mult(this);
    }

    @Override
    public Varable div(Varable varable) {
        if (varable instanceof VarableFloat)
            return new VarableFloat(((VarableFloat)this).getValue() / ((VarableFloat)varable).getValue());
        return super.div(varable);
    }
}
