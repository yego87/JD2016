package by.it.chetovich.JD01_09;

/**
 * Created by Yultos_ on 19.02.2016.
 */
public class Calculations {

    /**
     *
     * @param a float number, Class FloatVar field
     * @param b float number, Class FloatVar field
     * @return the sum of a and b
     */
    public static float addFloats (float a, float b){
        return a+b;
    }

    /**
     *
     * @param a float number, Class FloatVar field
     * @param b float number, Class FloatVar field
     * @return the subtraction of a and b
     */
    public static float subFloats (float a, float b){
        return a-b;
    }

    /**
     *
     * @param a float [] array, Class VectorVar field
     * @param b float [] array, Class VectorVar field
     * @return the sum of a and b
     */
    public static float [] addVectors (float [] a, float [] b){
        float [] result = new float[a.length];
        for (int i = 0; i < result.length; i++) {
            result [i] = a[i] + b[i];
        }
        return result;
    }

    /**
     *
     * @param a float [] array, Class VectorVar field
     * @param b float [] array, Class VectorVar field
     * @return the subtraction of a and b
     */
    public static float [] subVectors (float [] a, float [] b){
        float [] result = new float[a.length];
        for (int i = 0; i < result.length; i++) {
            result [i] = a[i] - b[i];
        }
        return result;
    }

    /**
     *
     * @param a float [][] array, Class MatrixVar field
     * @param b float [][] array, Class MatrixVar field
     * @return the sum of a and b
     */
    public static float [][] addMatrici (float [][] a, float [][] b){
        float [][] result = new float[a.length][a[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result [i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    /**
     *
     * @param a float [][] array, Class MatrixVar field
     * @param b float [][] array, Class MatrixVar field
     * @return the subtraction of a and b
     */
    public static float [][] subMatrici (float [][] a, float [][] b){
        float [][] result = new float[a.length][a[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result [i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

    /**
     *
     * @param a float number, Class FloatVar field
     * @param b float number, Class FloatVar field
     * @return the multiplication of a and b
     */
    public static float multiFloats(float a, float b){
        return a*b;
    }

    /**
     *
     * @param a float number, Class FloatVar field
     * @param b float [] array, Class VectorVar field
     * @return the multiplication of a and b
     */
    public static float [] multiFloatAndVector (float a, float [] b){
        float [] result = new float[b.length];
        for (int i = 0; i < result.length; i++) {
            result [i] = a*b[i];
        }
        return result;
    }

    /**
     *
     * @param a float number, Class FloatVar field
     * @param b float [][] array, Class MatrixVar field
     * @return the multiplication of a and b
     */
    public static float [][] multiFloatAndMatrix (float a, float [][] b){
        float [][] result = new float[b.length][b[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result [i][j] = a*b[i][j];
            }
        }
        return result;
    }

    /**
     *
     * @param a float [] array, Class VectorVar field
     * @param b float [] array, Class VectorVar field
     * @return the multiplication of a and b
     */
    public static float [] multiVectors (float [] a, float [] b) {
        float[] result = new float[a.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = a[i] * b[i];
        }
        return result;
    }

    /**
     *
     * @param a float [] array, Class VectorVar field
     * @param b float [][] array, Class MatrixVar field
     * @return the multiplication of a and b - float [] result
     */
    public static float [] multiVectorAndMatrix (float [] a, float [][] b){
        if (a.length == b[0].length) {
            float [] result = new float[a.length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    result[i] += b[i][j]*a[j];
                }
            }
            return result;
        }
        else{
            System.out.println("Размеры матрицы и вектора не соответствуют условию для их перемножения " +
                    "(количество столбцов матрицы должно совпадать с количеством строк вектора).");
            return null;
        }
    }

    public static float [][] multiMatrici (float[][] a, float[][] b) {
        if (a.length == b[0].length) {
            float[][] result = new float[a.length][b[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    for (int k = 0; k < b.length; k++) {
                        result[i][j] += a[i][k]+b[k][j];
                    }
                }
            }
            return result;
        }
        else {
            System.out.println("Размеры матриц не соответствуют условию для их перемножения " +
                    "(количество строк одной матрицы должно совпадать с количеством столбцов другой матрицы).");
            return null;
        }
    }
}
