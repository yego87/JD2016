package by.it.telushko.jd01_04;

/**
 * Created by Владимир on 09.02.2016.
 */
public class InOut {

    public static void arrayPrint(double[] x){
        for (int i = 0; i <x.length ; i++) {
            System.out.println(x[i]);
        }
    }
    public static void arrayPrint2D(double[][] matrix){
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j <matrix[0].length; j++)
                System.out.printf("%6.2f ",matrix[i][j]);
            System.out.println("");
        }
        System.out.println("");
    }
    public static void arrayPrint2D(double[][] m,String name){
        for (int i = 0; i <m.length ; i++) {
            for (int j = 0; j <m[0].length ; j++)
                System.out.printf(name+"[%1d,%1d]=%-6.1f",i,j,m[i][j]);
        }
        System.out.print("");

}
}
