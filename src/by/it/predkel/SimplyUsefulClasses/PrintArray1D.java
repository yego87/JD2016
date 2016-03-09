package by.it.predkel.SimplyUsefulClasses;

/**
 * Вывод одномерного массива
 */
public class PrintArray1D {
    public static void arrayPrint1D(double[] m){
        for (int i=0; i<m.length; i++){
            System.out.printf("$4d "+m[i]);
        }
        System.out.println();
    }
    public static void arrayPrint1D(int [] m){
        for (int i=0; i<m.length; i++){
            System.out.printf("$4d "+m[i]);
        }
        System.out.println();
    }
    public static void arrayPrint1D(double[] m, String name){
        for (int i=0; i<m.length; i++){
            System.out.printf(name+"[$1d]=%-6.1f",i,m[i]);
        }
        System.out.println();
    }
    public static void arrayPrint1D(int [] m, String name){
        for (int i=0; i<m.length; i++){
            System.out.printf(name+"[$1d]=%-6.1d",i,m[i]);
        }
        System.out.println();
    }
}
