package by.it.predkel.jd01.LevelA;

/**
 * Найти числа длина которых больше\меньше средней
 */
public class AverageLenght {
    public static void averageLenght(String[] str){
        int average=0;
        for (int i = 0; i < str.length; i++) {
            average += str[i].length();
        }
        average/=str.length;
        for (int i = 0; i < str.length; i++) {
            if (average<str[i].length())
                System.out.println(str[i]+"\t(больше)");
            if (average>str[i].length())
                System.out.println(str[i]+"\t(меньше)");
        }
    }
}
