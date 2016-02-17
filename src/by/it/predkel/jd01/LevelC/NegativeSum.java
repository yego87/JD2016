package by.it.predkel.jd01.LevelC;

/**
 * Найти сумму элементов строки между первым и вторым положительными элементами этой строки
 */
public class NegativeSum {
    public static void negativeSum(int[][] mass1){
        System.out.println("Сумма между положительными");
        for (int i = 0; i < mass1.length; i++) {
            boolean check = false;
            int sum = 0;
            for (int j = 0; j < mass1.length; j++) {
                if ((!check) && (mass1[i][j] > 0)) {
                    check = true;
                } else if ((check && (mass1[i][j] > 0))) {
                    break;
                } else if ((check) && (mass1[i][j] < 0))
                    sum += mass1[i][j];
            }
            System.out.println(sum);
        }
    }
}
