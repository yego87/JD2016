package by.it.Baranova.JD01_04_Gauss;

/**
 * Created by Ekaterina on 2/8/16.
 */
public class InOut {
    public static void arrayPrint2D(double [][]m, String name){
        for (int i = 0; i < m.length; i++) {
            for (int j=0;j<m[0].length;j++){
                System.out.printf (name+"[%1d,%1d]=%-6.1f ",i,j,m[i][j]);
            }
         System.out.println();
        }
    System.out.println();
    }

    public static void arrayPrint2D(double [][]m){
        for (int i = 0; i < m.length; i++) {
            for (int j=0;j<m[0].length;j++){
                System.out.printf ("%8.2f",m[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void arrayPrint(double []mas, String name,int cols) {
        int col = 0;
        for (int i = 0; i < mas.length; i++) {
            System.out.print(name);
            System.out.printf("[%-3d]=%-9.4f ", i, mas[i]);
            col++;
            if ((0 == col % cols) || (mas.length - 1 == i)) {
                System.out.println();
            }
            System.out.println();
        }

    }

}
