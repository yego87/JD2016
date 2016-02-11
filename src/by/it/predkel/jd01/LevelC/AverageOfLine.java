package by.it.predkel.jd01.LevelC;

/**
 * Необходимо отнять от всех чисел строки матрицы среднее арифметическое этой строки
 */
public class AverageOfLine {
    public static void averageOfLine(int[][] mass1){
        int[] average = new int[mass1.length];
        for (int i = 0; i < (mass1.length); i++) {
            for (int j = 0; j < (mass1.length); j++) {
                average[i] += mass1[i][j];
            }
            average[i] /=mass1.length;
        }
        for (int i = 0; i < (mass1.length); i++) {
            for (int j = 0; j < (mass1.length); j++) {
                mass1[i][j]-=average[i];
                System.out.printf("%4d",mass1[i][j]);
            }
            System.out.println();
        }
    }
}
