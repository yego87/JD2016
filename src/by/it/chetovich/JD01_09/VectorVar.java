package by.it.chetovich.JD01_09;


import java.util.Arrays;

/**
 * Created by user_2 on 19.02.2016.
 */
public class VectorVar extends Var {

    private float[] vector;

    public VectorVar(float[] vector){
        this.vector = vector;
    }

    public float[] getVector() {
        return vector;
    }

    public void setVector(float[] vector) {
        this.vector = vector;
    }

    @Override
    public String toString (){
        return "Result: "+ Arrays.toString(vector);
    }

    @Override
    public Var addFloat(FloatVar value) {
        System.out.println("Ќевозможно сложить число и вектор.");
        return null;
    }

    @Override
    public Var addVector(VectorVar value) {
        return new VectorVar(Calculations.addVectors(this.vector, value.vector));
    }

    @Override
    public Var addMatrix(MatrixVar value) {
        System.out.println("Ќевозможно сложить вектор и матрицу.");
        return null;
    }

    @Override
    public Var subFloat(FloatVar value) {
        System.out.println("Ќевозможно из вектора вычесть число.");
        return null;
    }

    @Override
    public Var subVector(VectorVar value) {
        return new VectorVar(Calculations.subVectors(this.vector, value.vector));
    }

    @Override
    public Var subMatrix(MatrixVar value) {
        System.out.println("Ќевозможно вычесть из вектора матрицу.");
        return null;
    }

    @Override
    public Var multiFloat(FloatVar value) {
        return new VectorVar(Calculations.multiFloatAndVector(value.getVal(), this.vector));
    }

    @Override
    public Var multiVector(VectorVar value) {
        return new VectorVar(Calculations.multiVectors(value.getVector(), this.vector));
    }

    @Override
    public Var multiMatrix(MatrixVar value) {
        return new VectorVar(Calculations.multiVectorAndMatrix(this.vector, value.getArray()));
    }
}
