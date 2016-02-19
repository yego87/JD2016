package by.it.chetovich.JD01_09;

/**
 * Created by user_2 on 19.02.2016.
 */
public class MatrixVar extends Var{

    float [][] array;

    public MatrixVar (float[][]array){
        this.array = array;
    }

    @Override
    public Var addMatrix(MatrixVar value) {
        float[][] arr1 = this.array;
        float [][] arr2 = value.array;
        float [][] result = new float[arr1.length][arr1.length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result [i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        this.array = result;
        return this;
    }
}
