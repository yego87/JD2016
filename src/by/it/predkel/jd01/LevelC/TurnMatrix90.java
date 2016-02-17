package by.it.predkel.jd01.LevelC;

/**
 * Необходимо повернуть матрицу на 90 градусов против часовой стрелки
 */
public class TurnMatrix90 {
    public static void turnMatrix90(int[][] mass1){
        int[][] mass=new int[mass1.length][mass1.length];
        for (int i = 0,k=mass1.length-1; i < mass1.length; i++,k--){
            for (int j = 0; j < mass1.length; j++) {
                mass[i][j] = mass1[j][k];
                System.out.printf("%4d"+mass[i][j]);
            }
        System.out.println();
        }
    }
}
