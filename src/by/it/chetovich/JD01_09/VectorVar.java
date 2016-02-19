package by.it.chetovich.JD01_09;

/**
 * Created by user_2 on 19.02.2016.
 */
public class VectorVar extends Var {

    float[] vector;

    public VectorVar(float[] vector){
        this.vector = vector;
    }

    @Override
    public Var addVector(VectorVar value) {
        float [] arr1 = this.vector;
        float [] arr2 = value.vector;
        float [] result = new float[arr1.length];
        for (int i = 0; i < result.length; i++) {
            result [i] = arr1[i] + arr2[i];
        }
        this.vector = result;
        return this;
    }
}
