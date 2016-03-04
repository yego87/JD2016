package by.it.daylidovich.FreeMathLab.variables.Vector;

import by.it.daylidovich.FreeMathLab.interfaces.IOperation;
import by.it.daylidovich.FreeMathLab.variables.Float.VariableFloat;
import by.it.daylidovich.FreeMathLab.variables.Variable;

public class OperationVector extends Variable implements IOperation {
    @Override
    public Variable add(Variable variable) throws ArrayIndexOutOfBoundsException{
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
            else throw new ArrayIndexOutOfBoundsException("Сложение невозможно.\nВекторы различной велечины.");
        }
        return super.add(variable);
    }

    @Override
    public Variable sub(Variable variable) throws ArrayIndexOutOfBoundsException{
        if (variable instanceof VariableFloat){
            VariableVector firstTerm = new VariableVector(((VariableVector)this).getVector());
            double secondTerm = ((VariableFloat) variable).getValue();
            for (int i = 0; i < firstTerm.getVector().length; i++) {
                firstTerm.getVector()[i] -= secondTerm;
            }
            return firstTerm;
        }

        if (variable instanceof VariableVector) {
            VariableVector firstTerm = new VariableVector(((VariableVector)this).getVector());
            VariableVector secondTerm = (VariableVector) variable;
            if (firstTerm.getVector().length == secondTerm.getVector().length){
                for (int i = 0; i < firstTerm.getVector().length; i++) {
                    firstTerm.getVector()[i] -= secondTerm.getVector()[i];
                }
                return firstTerm;
            }
            else throw new ArrayIndexOutOfBoundsException("Вычитание невозможно.\nВекторы различной велечины.");
        }
        return super.sub(variable);
    }

    @Override
    public Variable mult(Variable variable) throws ArrayIndexOutOfBoundsException{
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
            else throw new ArrayIndexOutOfBoundsException("Умножение невозможно.\n" + "Векторы различной велечины.");
        }
        return super.mult(variable);
    }

    @Override
    public Variable div(Variable variable) throws ArithmeticException{
        if (variable instanceof VariableFloat){
            VariableVector firstTerm = new VariableVector(((VariableVector)this).getVector());
            double secondTerm = ((VariableFloat) variable).getValue();
            if (0 != secondTerm)
                for (int i = 0; i < firstTerm.getVector().length; i++) {
                    firstTerm.getVector()[i] /= secondTerm;
                }
            else throw new ArithmeticException("Деление невозможно.\n" + "Деление на ноль.");
            return firstTerm;
        }

        return super.div(variable);
    }
}
