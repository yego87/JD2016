package by.it.daylidovich.JD01_06.C.task01;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Format {
    public static int maxLength(String[] array){
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i].length())
                max = array[i].length();
        }
        return max;
    }

    public static int countSpace(String string){
        Matcher matcher = Pattern.compile("[ ]").matcher(string);
        int count = 0;
        while (matcher.find())
            count++;
        return count;
    }

    public static String[] createArrayOfLines(String st){
        Matcher matcher = Pattern.compile(".*[\n]").matcher(st);
        ArrayList<String> arrayList = new ArrayList<>();
        while (matcher.find()){
            arrayList.add(matcher.group());
        }

        String[] array = new String[arrayList.size()];
        for (int i = 0; i < array.length; i++)
            array[i] = arrayList.get(i).trim();
        return array;
    }

    public static String alignLines(String[] arrayLines){
        int max = maxLength(arrayLines);
        String stOut = new String();
        for (int i = 0; i < arrayLines.length; i++) {
            String stInsert = new String();
            int countSpace = (max - arrayLines[i].length()) % countSpace(arrayLines[i]);
            for (int j = 0; j < (max - arrayLines[i].length()) / countSpace(arrayLines[i]); j++) {
                stInsert+=" ";
            }

            StringBuilder st = new StringBuilder(arrayLines[i]);

            Matcher matcher = Pattern.compile("[ ]").matcher(st);
            ArrayList<Integer> arrayList = new ArrayList<>();
            while (matcher.find())
                arrayList.add(matcher.start());
            int dop = 0;
            for (int j = 0; j < arrayList.size(); j++) {
                st.insert(arrayList.get(j) + dop, stInsert);
                dop +=stInsert.length();
                if (countSpace > 0){
                    st.insert(arrayList.get(j) + dop , ' ');
                    dop++;
                }
                countSpace--;
            }

            stOut+=st+"\n";
        }
        return stOut;
    }
}
