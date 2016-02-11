package by.it.telushko.jd01_02;

/**
 * Created by Владимир on 09.02.2016.
 */
public class MathLib {

    public static int maxElement(int[][] matrix,int sizeI,int sizeJ){
        int max=matrix[0][0];

        for (int i = 0; i <sizeI; i++) {
            for (int j = 0; j <sizeJ ; j++) {
                if (max<matrix[i][i]) max=matrix[i][j];
            }
        }
        return max;
    }
    public static int minElement(int[][] matrix,int sizeI,int sizeJ){
        int min=matrix[0][0];
        for (int i = 0; i <sizeI; i++) {
            for (int j = 0; j <sizeJ ; j++) {
                if (min>matrix[i][j]) min=matrix[i][j];
            }
        }
        return min;
    }
}
