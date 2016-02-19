package by.it.chetovich.JD01_09;


import java.util.Arrays;

/**
 * Created by user_2 on 19.02.2016.
 */
public class MatrixVar extends Var{

    float [][] array;

    public MatrixVar (float[][]array){
        this.array = array;
    }

    public float[][] getArray() {
        return array;
    }

    public void setArray(float[][] array) {
        this.array = array;
    }

    @Override
    public String toString (){
        return "Result: "+ Arrays.deepToString(array);
    }

    @Override
    public Var addFloat(FloatVar value) {
        System.out.println("Ќевозможно сложить число и матрицу.");
        return null;
    }

    @Override
    public Var addVector(VectorVar value) {
        System.out.println("Ќевозможно сложить вектор и матрицу.");
        return null;
    }

    @Override
    public Var addMatrix(MatrixVar value) {
        return new MatrixVar(Calculations.addMatrici(this.array, value.array));
    }

    @Override
    public Var subFloat(FloatVar value) {
        System.out.println("Ќевозможно вычесть из матрицы число.");
        return null;
    }

    @Override
    public Var subVector(VectorVar value) {
        System.out.println("Ќевозможно вычесть из матрицы вектор.");
        return null;
    }

    @Override
    public Var subMatrix(MatrixVar value) {
        return new MatrixVar(Calculations.addMatrici(this.array, value.array));
    }

    @Override
    public Var multiFloat(FloatVar value) {
        return new MatrixVar(Calculations.multiFloatAndMatrix(value.getVal(), this.array));    }

    @Override
    public Var multiVector(VectorVar value) {
        return new VectorVar(Calculations.multiVectorAndMatrix(value.getVector(), this.array));    }

    @Override
    public Var multiMatrix(MatrixVar value) {
        return new MatrixVar(Calculations.multiMatrici(this.array, value.getArray()));
    }
}
