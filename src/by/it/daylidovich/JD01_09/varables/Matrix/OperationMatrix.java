package by.it.daylidovich.JD01_09.varables.Matrix;

import by.it.daylidovich.JD01_09.interfaces.IAddation;
import by.it.daylidovich.JD01_09.interfaces.IDivision;
import by.it.daylidovich.JD01_09.interfaces.IMultiplication;
import by.it.daylidovich.JD01_09.interfaces.ISubtraction;
import by.it.daylidovich.JD01_09.varables.Float.VarableFloat;
import by.it.daylidovich.JD01_09.varables.Varable;

public class OperationMatrix extends Varable implements IAddation, ISubtraction, IMultiplication, IDivision {
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
    public Varable add(Varable varable) {
        if (varable instanceof VarableFloat){
            double[][] firstTerm = copyMatrix(((VarableMatrix)this).getMatrix());
            double secondTerm = ((VarableFloat)varable).getValue();
            for (int i = 0; i < firstTerm.length; i++) {
                for (int j = 0; j < firstTerm[i].length; j++) {
                    firstTerm[i][j] += secondTerm;
                }
            }
            return new VarableMatrix(firstTerm);
        }
        if (varable instanceof VarableMatrix){
            double[][] firstTerm = copyMatrix(((VarableMatrix) this).getMatrix());
            double[][] secondTerm = copyMatrix(((VarableMatrix) varable).getMatrix());
            if (firstTerm.length == secondTerm.length && firstTerm[0].length == secondTerm[0].length){
                for (int i = 0; i < firstTerm.length; i++) {
                    for (int j = 0; j < firstTerm[i].length; j++) {
                        firstTerm[i][j] += secondTerm[i][j];
                    }
                }
                return new VarableMatrix(firstTerm);
            }
        }
        return super.add(varable);
    }

    @Override
    public Varable sub(Varable varable) {
        if (varable instanceof VarableFloat){
            double[][] firstTerm = copyMatrix(((VarableMatrix) this).getMatrix());
            double secondTerm = ((VarableFloat)varable).getValue();
            for (int i = 0; i < firstTerm.length; i++) {
                for (int j = 0; j < firstTerm[i].length; j++) {
                    firstTerm[i][j] -= secondTerm;
                }
            }
            return new VarableMatrix(firstTerm);
        }
        if (varable instanceof VarableMatrix){
            double[][] firstTerm = copyMatrix(((VarableMatrix) this).getMatrix());
            double[][] secondTerm = copyMatrix(((VarableMatrix) varable).getMatrix());
            if (firstTerm.length == secondTerm.length && firstTerm[0].length == secondTerm[0].length){
                for (int i = 0; i < firstTerm.length; i++) {
                    for (int j = 0; j < firstTerm[i].length; j++) {
                        firstTerm[i][j] -= secondTerm[i][j];
                    }
                }
                return new VarableMatrix(firstTerm);
            }
        }
        return super.sub(varable);
    }

    @Override
    public Varable mult(Varable varable) {
        if (varable instanceof VarableFloat){
            double[][] firstTerm = copyMatrix(((VarableMatrix) this).getMatrix());
            double secondTerm = ((VarableFloat)varable).getValue();
            for (int i = 0; i < firstTerm.length; i++) {
                for (int j = 0; j < firstTerm[i].length; j++) {
                    firstTerm[i][j] *= secondTerm;
                }
            }
            return new VarableMatrix(firstTerm);
        }
        if (varable instanceof VarableMatrix){
            double[][] firstTerm = copyMatrix(((VarableMatrix) this).getMatrix());
            double[][] secondTerm = copyMatrix(((VarableMatrix) varable).getMatrix());
            if (firstTerm[0].length == secondTerm.length){
                double[][] result = new double[firstTerm.length][secondTerm[0].length];
                for (int i = 0; i < firstTerm.length; i++) {
                    for (int j = 0; j < secondTerm[0].length; j++) {
                        for (int k = 0; k < secondTerm.length; k++) {
                            result[i][j] += firstTerm[i][k] * secondTerm[k][j];
                        }

                    }
                }
                return new VarableMatrix(result);
            }
        }
        return super.mult(varable);
    }

    @Override
    public Varable div(Varable varable) {
        if (varable instanceof VarableFloat){
            double[][] firstTerm = copyMatrix(((VarableMatrix) this).getMatrix());
            double secondTerm = ((VarableFloat)varable).getValue();
            for (int i = 0; i < firstTerm.length; i++) {
                for (int j = 0; j < firstTerm[i].length; j++) {
                    firstTerm[i][j] /= secondTerm;
                }
            }
            return new VarableMatrix(firstTerm);
        }
        return super.div(varable);
    }
}
