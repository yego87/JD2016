package by.it.daylidovich.JD01_13.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utils {
    private static double sum = 0;
    public static String readNumber(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String rLine = bufferedReader.readLine();
            return rLine;
        } catch (IOException e) {
            System.out.println("Ошибка чтения данных.");
            return null;
        }
    }

    public static int parseNumber(String string) throws NumberFormatException{
            int x = Integer.parseInt(string);
            return x;
    }

    public static double sumRadical(int x) throws ArithmeticException{
        if (x > 0){
            sum+=Math.sqrt((double)x);
            return sum;
        }
        else return 1/0;
    }
}
