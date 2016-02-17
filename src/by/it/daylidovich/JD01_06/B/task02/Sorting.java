package by.it.daylidovich.JD01_06.B.task02;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sorting {
    public static StringBuilder deleteWrap(StringBuilder st){
        int k = st.indexOf("\n");
        while (-1 != k) {
            st.deleteCharAt(k);
            st.insert(k, ' ');
            k = st.indexOf("\n");
        }
        return st;
    }

    public static int countWord(String st){
        Matcher matcher = Pattern.compile("\\b[А-яЁё]+\\b").matcher(st);
        int count = 0;
        while (matcher.find())
            count++;

        return count;
    }

    public static String[] createArrayOfSentence(StringBuilder st){
        Matcher matcher = Pattern.compile("[^!?;.]*[!?;.]+").matcher(st);
        ArrayList<String> arrayList = new ArrayList<>();
        while (matcher.find()){
            arrayList.add(matcher.group());
        }

        String[] array = new String[arrayList.size()];
        for (int i = 0; i < array.length; i++)
            array[i] = arrayList.get(i).trim();
        return array;
    }
    public static String[] sortText(String[] array){

        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if (countWord(array[j]) > countWord(array[j+1])){
                    String s = array[j];
                    array[j] = array[j+1];
                    array[j+1] = s;
                }
            }
        }
        return array;
    }
}
