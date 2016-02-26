package by.it.daylidovich.JD01_09.varables.Vector;

import by.it.daylidovich.JD01_09.interfaces.IOperation;
import by.it.daylidovich.JD01_09.varables.Float.VariableFloat;
import by.it.daylidovich.JD01_09.varables.Variable;

public class OperationVector extends Variable implements IOperation {
    @Override
    public Variable add(Variable variable) {
        if (variable instanceof VariableFloat){
            VariableVector firstTerm = new VariableVector(((VariableVector)this).getVector());
            double secondTerm = ((VariableFloat) variable).getValue();
            for (int i = 0; i < firstTerm.getVector().length; i++) {
                firstTerm.getVector()[i] += secondTerm;
            }
            return firstTerm;
        }

        if (variable instanceof VariableVector){
            VariableVector firstTerm = new VariableVector(((VariableVector)this).getVector());
            VariableVector secondTerm = (VariableVector) variable;
            if (firstTerm.getVector().length == secondTerm.getVector().length){
                for (int i = 0; i < firstTerm.getVector().length; i++) {
                    firstTerm.getVector()[i] += secondTerm.getVector()[i];
                }
                return firstTerm;
            }
        }
        return super.add(variable);
    }

    @Override
    public Variable sub(Variable variable) {
        if (variable instanceof VariableFloat){
            VariableVector firstTerm = new VariableVector(((VariableVector)this).getVector());
            double secondTerm = ((VariableFloat) variable).getValue();
            for (int i = 0; i < firstTerm.getVector().length; i++) {
                firstTerm.getVector()[i] -= secondTerm;
            }
            return firstTerm;
        }

        if (variable instanceof VariableVector){
            VariableVector firstTerm = new VariableVector(((VariableVector)this).getVector());
            VariableVector secondTerm = (VariableVector) variable;
            if (firstTerm.getVector().length == secondTerm.getVector().length){
                for (int i = 0; i < firstTerm.getVector().length; i++) {
                    firstTerm.getVector()[i] -= secondTerm.getVector()[i];
                }
                return firstTerm;
            }
        }
        return super.sub(variable);
    }

    @Override
    public Variable mult(Variable variable) {
        if (variable instanceof VariableFloat){
            VariableVector firstTerm = new VariableVector(((VariableVector)this).getVector());
            double secondTerm = ((VariableFloat) variable).getValue();
            for (int i = 0; i < firstTerm.getVector().length; i++) {
                firstTerm.getVector()[i] *= secondTerm;
            }
            return firstTerm;
        }

        if (variable instanceof VariableVector){
            double sum = 0;
            VariableVector firstTerm = new VariableVector(((VariableVector)this).getVector());
            VariableVector secondTerm = (VariableVector) variable;
            if (firstTerm.getVector().length == secondTerm.getVector().length){
                for (int i = 0; i < firstTerm.getVector().length; i++) {
                    sum += firstTerm.getVector()[i] * secondTerm.getVector()[i];
                }
                return new VariableFloat(sum);
            }
        }
        return super.mult(variable);
    }

    @Override
    public Variable div(Variable variable) {
        if (variable instanceof VariableFloat){
            VariableVector firstTerm = new VariableVector(((VariableVector)this).getVector());
            double secondTerm = ((VariableFloat) variable).getValue();
            for (int i = 0; i < firstTerm.getVector().length; i++) {
                firstTerm.getVector()[i] /= secondTerm;
            }
            return firstTerm;
        }

        return super.div(variable);
    }
}
