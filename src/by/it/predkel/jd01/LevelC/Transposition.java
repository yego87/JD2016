package by.it.predkel.jd01.LevelC;

/**
 * Необходимо транспонировать матрицу
 */
public class Transposition {
    public static void transposition(int[][] mass1){
        System.out.println("Транспонирование");
        int[][] mass2 = new int[mass1.length][mass1.length];
        for (int i = 0; i < (mass1.length); i++) {
            for (int j = 0; j < (mass1.length); j++) {
                mass2[i][j] = mass1[j][i];
                System.out.printf("%3d ", mass2[i][j]);
            }
            System.out.print('\n');
        }
        System.out.println();
    }
}
