package by.it.lukin.jd02.jd01_2C;

/**
 * Транспонировать матрицу(квадратную)
 */

public class Main {

    public static void main(String[] args) {
	    int [][]matr = new int[3][];
        int [][]tmatr = new int[3][];

        System.out.println("Matrix:");
        for(int i = 0; i < matr.length; i++){
            matr[i] = new int[3];
            tmatr[i] = new int[3];
            for (int j = 0; j < matr[i].length; j++){
                matr[i][j] = (int)Math.round(Math.random()*100);
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }


        for(int i = 0; i < tmatr.length; i++){
            for (int j = 0; j < tmatr[i].length; j++) {
                tmatr[i][j] = matr[j][i];
            }
        }

        System.out.println("Result:");
        for(int i = 0; i < tmatr.length; i++){
            for (int j = 0; j < tmatr[i].length; j++){
                System.out.print(tmatr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
