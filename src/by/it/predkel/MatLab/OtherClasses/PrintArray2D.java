package by.it.predkel.MatLab.OtherClasses;

/**
 * Вывод двумерного массива
 */
public class PrintArray2D {
    public static void arrayPrint2D(double[][] m){
        for (int i=0; i<m.length; i++){
            for (int j=0; j<m[0].length; j++){
                System.out.printf("$4d "+m[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void arrayPrint2D(int [][] m){
        for (int i=0; i<m.length; i++){
            for (int j=0; j<m[0].length; j++){
                System.out.printf("$4d "+m[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void arrayPrint2D(double[][] m, String name){
        for (int i=0; i<m.length; i++){
            for (int j=0; j<m[0].length; j++){
                System.out.printf(name+"[$1d,%1d]=%-6.1f",i,j,m[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void arrayPrint2D(int [][] m, String name){
        for (int i=0; i<m.length; i++){
            for (int j=0; j<m[0].length; j++){
                System.out.printf(name+"[$1d,%1d]=%-6.1d",i,j,m[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
