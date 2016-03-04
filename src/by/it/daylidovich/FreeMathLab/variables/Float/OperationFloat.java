package by.it.daylidovich.FreeMathLab.variables.Float;

import by.it.daylidovich.FreeMathLab.interfaces.*;
import by.it.daylidovich.FreeMathLab.variables.Variable;

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
    public Variable div(Variable variable){
        if (variable instanceof VariableFloat) {
            if (0 != ((VariableFloat) variable).getValue())
                return new VariableFloat(((VariableFloat) this).getValue() / ((VariableFloat) variable).getValue());
            else
                throw new ArithmeticException("Деление невозможно.\nДеление на ноль.");
        }
        return super.div(variable);
    }
}
