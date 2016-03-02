package by.it.daylidovich.JD01_12.C.task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public static LinkedList<String> createBracketArray(String string){
        LinkedList<String> list = new LinkedList<>();
        Matcher matcher = Pattern.compile("[\\]\\[\\)\\(\\}\\{]").matcher(string);
        while (matcher.find())
            list.add(matcher.group());
        return list;
    }

    public static boolean validExpression(LinkedList<String> list){
        boolean is = true;
        while (is){
            int startSize = list.size();
            for (int i = 0; i < list.size() - 1; i++) {
                if ((list.get(i).equals("(") && list.get(i+1).equals(")")) || (list.get(i).equals("[") && list.get(i+1).equals("]")) || (list.get(i).equals("{") && list.get(i+1).equals("}")))
                {
                    list.remove(i);
                    list.remove(i);
                }
            }
            if (startSize == list.size())
                is = false;
        }

        if (list.size() == 0)
            return true;
        else return false;
    }

    public static String readExpression() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String rLine = bufferedReader.readLine();
        return rLine;
    }
}
