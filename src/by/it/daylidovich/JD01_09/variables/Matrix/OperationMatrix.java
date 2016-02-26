package by.it.daylidovich.JD01_09.variables.Matrix;

import by.it.daylidovich.JD01_09.interfaces.*;
import by.it.daylidovich.JD01_09.variables.Float.VariableFloat;
import by.it.daylidovich.JD01_09.variables.Variable;

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
    public Variable add(Variable variable) {
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
        }
        return super.add(variable);
    }

    @Override
    public Variable sub(Variable variable) {
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
        }
        return super.sub(variable);
    }

    @Override
    public Variable mult(Variable variable) {
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
        }
        return super.mult(variable);
    }

    @Override
    public Variable div(Variable variable) {
        if (variable instanceof VariableFloat){
            double[][] firstTerm = copyMatrix(((VariableMatrix) this).getMatrix());
            double secondTerm = ((VariableFloat) variable).getValue();
            for (int i = 0; i < firstTerm.length; i++) {
                for (int j = 0; j < firstTerm[i].length; j++) {
                    firstTerm[i][j] /= secondTerm;
                }
            }
            return new VariableMatrix(firstTerm);
        }
        return super.div(variable);
    }
}
