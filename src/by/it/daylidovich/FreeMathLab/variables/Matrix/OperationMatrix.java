package by.it.daylidovich.FreeMathLab.variables.Matrix;

import by.it.daylidovich.FreeMathLab.interfaces.*;
import by.it.daylidovich.FreeMathLab.variables.Float.VariableFloat;
import by.it.daylidovich.FreeMathLab.variables.Variable;

public class OperationMatrix extends Variable implements IOperation {
    private double[][] copyMatrix(double[][] matrix){
        double[][] matrixOut = new double[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixOut[i][j] = matrix[i][j];
            }
        }
        return matrixOut;
    }

    @Override
    public Variable add(Variable variable) throws ArrayIndexOutOfBoundsException{
        if (variable instanceof VariableFloat){
            double[][] firstTerm = copyMatrix(((VariableMatrix)this).getMatrix());
            double secondTerm = ((VariableFloat) variable).getValue();
            for (int i = 0; i < firstTerm.length; i++) {
                for (int j = 0; j < firstTerm[i].length; j++) {
                    firstTerm[i][j] += secondTerm;
                }
            }
            return new VariableMatrix(firstTerm);
        }
        if (variable instanceof VariableMatrix){
            double[][] firstTerm = copyMatrix(((VariableMatrix) this).getMatrix());
            double[][] secondTerm = copyMatrix(((VariableMatrix) variable).getMatrix());
            if (firstTerm.length == secondTerm.length && firstTerm[0].length == secondTerm[0].length){
                for (int i = 0; i < firstTerm.length; i++) {
                    for (int j = 0; j < firstTerm[i].length; j++) {
                        firstTerm[i][j] += secondTerm[i][j];
                    }
                }
                return new VariableMatrix(firstTerm);
            }
            else throw new ArrayIndexOutOfBoundsException("Сложение невозможно.\nМатрицы различного размера.");
        }
        return super.add(variable);
    }

    @Override
    public Variable sub(Variable variable) throws ArrayIndexOutOfBoundsException{
        if (variable instanceof VariableFloat){
            double[][] firstTerm = copyMatrix(((VariableMatrix) this).getMatrix());
            double secondTerm = ((VariableFloat) variable).getValue();
            for (int i = 0; i < firstTerm.length; i++) {
                for (int j = 0; j < firstTerm[i].length; j++) {
                    firstTerm[i][j] -= secondTerm;
                }
            }
            return new VariableMatrix(firstTerm);
        }
        if (variable instanceof VariableMatrix){
            double[][] firstTerm = copyMatrix(((VariableMatrix) this).getMatrix());
            double[][] secondTerm = copyMatrix(((VariableMatrix) variable).getMatrix());
            if (firstTerm.length == secondTerm.length && firstTerm[0].length == secondTerm[0].length){
                for (int i = 0; i < firstTerm.length; i++) {
                    for (int j = 0; j < firstTerm[i].length; j++) {
                        firstTerm[i][j] -= secondTerm[i][j];
                    }
                }
                return new VariableMatrix(firstTerm);
            }
            else throw new ArrayIndexOutOfBoundsException("Вычитание невозможно.\nМатрицы различного размера.");
        }
        return super.sub(variable);
    }

    @Override
    public Variable mult(Variable variable) throws ArrayIndexOutOfBoundsException{
        if (variable instanceof VariableFloat){
            double[][] firstTerm = copyMatrix(((VariableMatrix) this).getMatrix());
            double secondTerm = ((VariableFloat) variable).getValue();
            for (int i = 0; i < firstTerm.length; i++) {
                for (int j = 0; j < firstTerm[i].length; j++) {
                    firstTerm[i][j] *= secondTerm;
                }
            }
            return new VariableMatrix(firstTerm);
        }
        if (variable instanceof VariableMatrix){
            double[][] firstTerm = copyMatrix(((VariableMatrix) this).getMatrix());
            double[][] secondTerm = copyMatrix(((VariableMatrix) variable).getMatrix());
            if (firstTerm[0].length == secondTerm.length){
                double[][] result = new double[firstTerm.length][secondTerm[0].length];
                for (int i = 0; i < firstTerm.length; i++) {
                    for (int j = 0; j < secondTerm[0].length; j++) {
                        for (int k = 0; k < secondTerm.length; k++) {
                            result[i][j] += firstTerm[i][k] * secondTerm[k][j];
                        }

                    }
                }
                return new VariableMatrix(result);
            }
            else throw new ArrayIndexOutOfBoundsException("Умножение невозможно.\nМатрицы различного размера.");
        }
        return super.mult(variable);
    }

    @Override
    public Variable div(Variable variable) throws ArithmeticException{
        if (variable instanceof VariableFloat){
            double[][] firstTerm = copyMatrix(((VariableMatrix) this).getMatrix());
            double secondTerm = ((VariableFloat) variable).getValue();
            if (0 != secondTerm)
                for (int i = 0; i < firstTerm.length; i++) {
                    for (int j = 0; j < firstTerm[i].length; j++) {
                        firstTerm[i][j] /= secondTerm;
                    }
                }
            else throw new ArithmeticException("Деление невозможно.\nДеление на ноль");
            return new VariableMatrix(firstTerm);
        }
        return super.div(variable);
    }
}
