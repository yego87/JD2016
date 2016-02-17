package by.it.podelstchikova.jd06.TaskB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3B {
    public static char readLitteral() throws IOException
    {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        String rLine = bufferedReader.readLine();
        bufferedReader.close();
        rLine.trim();
        return rLine.charAt(0);
    }
    public static int countChar(String st, char ch){
        String regex = "[" + ch + "]";
        Matcher m = Pattern.compile(regex).matcher(st);
        int count = 0;
        while (m.find())
            count++;
        return count;
    }
    public static String[] createArrayWord(String st){
        Matcher m = Pattern.compile("[А-я]+").matcher(st);
        ArrayList<String> aList = new ArrayList<>();
        while (m.find()){
            aList.add(m.group());
        }

        String[] arrayString = new String[aList.size()];
        for (int i = 0; i < arrayString.length; i++)
            arrayString[i] = aList.get(i).trim();
        return arrayString;
    }

    public static String[] sortLines(String[]  arrayString, char ch){

        for (int i = 0; i < arrayString.length-1; i++) {
            for (int j = i; j < arrayString.length; j++) {
                if (countChar(arrayString[j], ch) > countChar(arrayString[j+1], ch))
                {
                    String st = arrayString[j];
                    arrayString[j] = arrayString[j+1];
                    arrayString[j+1] = st;
                }
            }
        }

        for (int i = 0; i < arrayString.length-1; i++) {
            for (int j = i; j < arrayString.length; j++) {
                if (countChar(arrayString[j], ch) == countChar(arrayString[j+1], ch) && arrayString[j].compareTo(arrayString[j+1]) > 0)
                {
                    String st = arrayString[j];
                    arrayString[j] = arrayString[j+1];
                    arrayString[j+1] = st;
                }
            }
        }
        return arrayString;
    }
}
