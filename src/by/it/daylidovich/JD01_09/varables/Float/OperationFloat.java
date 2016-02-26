package by.it.daylidovich.JD01_09.varables.Float;

import by.it.daylidovich.JD01_09.interfaces.*;
import by.it.daylidovich.JD01_09.varables.Variable;

public class OperationFloat extends Variable implements IOperation {

    @Override
    public Variable add(Variable variable) {
        if (variable instanceof VariableFloat)
            return new VariableFloat(((VariableFloat)this).getValue() + ((VariableFloat) variable).getValue());
        return variable.add(this);
    }

    @Override
    public Variable sub(Variable variable) {
        if (variable instanceof Variable)
            return new VariableFloat(((VariableFloat)this).getValue() - ((VariableFloat) variable).getValue());
        VariableFloat minus = new VariableFloat(-1);
        return minus.mult(variable.sub(this));
    }

    @Override
    public Variable mult(Variable variable) {
        if (variable instanceof VariableFloat)
            return new VariableFloat(((VariableFloat)this).getValue() * ((VariableFloat) variable).getValue());
        return variable.mult(this);
    }

    @Override
    public Variable div(Variable variable) {
        if (variable instanceof VariableFloat)
            return new VariableFloat(((VariableFloat)this).getValue() / ((VariableFloat) variable).getValue());
        return super.div(variable);
    }
}
