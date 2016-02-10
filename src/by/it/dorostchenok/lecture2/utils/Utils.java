package by.it.dorostchenok.lecture2.utils;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utils {

    public static String readLine() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String rLine = bufferedReader.readLine();
        bufferedReader.close();

        return rLine;
    }

    public static int[] parseStringToIntArray(String str){
        String[] strArray = str.split(" ");
        int[] intArray = new int[strArray.length];

        for(int j = 0; j < strArray.length; j++){
            try {
                intArray[j] = Integer.parseInt(strArray[j]);
            } catch (NumberFormatException e){
                System.out.println("Seems like not a number was entered.. " +
                        "Will be forced to int to prevent program fail");
                char[] cArr = strArray[j].toCharArray();
                for(char c : cArr){
                    intArray[j] += (int)c;
                }
            }
        }
        return intArray;
    }
}
