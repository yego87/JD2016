package by.it.novik.JD01_work;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class work6 {
    public static void main(String[] args) {
        int num = 22;

        String output = "" + num + " рубл";

        String GENITIVE_PL = "ей";
        String GENITIVE = "я";
        String NOMINATIVE = "ь";

        int lastPair = getLastPair(num);
        if (lastPair < 20 && lastPair > 10) {
            output += GENITIVE_PL;
        } else {
            switch (getLastNumber(num)) {
                case 1 :
                    output += NOMINATIVE;
                    break;
                case 2 :
                case 3 :
                case 4 :
                    output += GENITIVE;
                    break;
                default:
                    output += GENITIVE_PL;
            }
        }

        System.out.println(output);
    }

    public static int getLastNumber(int num) {
        String s_num = String.valueOf(num);
        return Integer.valueOf(s_num.substring(s_num.length() - 1, s_num.length()));
    }

    public static int getLastPair(int num) {
        String s_num = String.valueOf(num);
        return Integer.valueOf(s_num.substring(s_num.length() - 2, s_num.length()));
    }
}
