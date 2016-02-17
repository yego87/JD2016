package by.it.podelstchikova.jd06.TaskB;


import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2B {
    public static StringBuffer deleteWr(StringBuffer str)
    {    int k=str.indexOf("\n");
        while (k!=-1){
        str.deleteCharAt(k);
            k=str.indexOf("\n");
        }
            return str;
    }

    public static int count(String str)
    {int countWord=0;
        Matcher match = Pattern.compile("\\b[А-я]+\\b").matcher(str);
        while (match.find())
            countWord++;
        return countWord;
    }
    public static String[] sortArrayString(String[] arrayString)
    {
        for (int i = arrayString.length-1; i >0; i++) {
            for (int j = i; j < i; j++) {
                if (count(arrayString[j]) > count(arrayString[j+1])){
                    String s = arrayString[j];
                    arrayString[j] = arrayString[j+1];
                    arrayString[j+1] = s;
                }
            }
        }
        return arrayString;
    }
    public static String[] createArrayString(StringBuffer str)
    {
        Matcher m = Pattern.compile("[^!?;.]*[!?;.]+").matcher(str);
        ArrayList<String> aList = new ArrayList<>();
        while (m.find()){aList.add(m.group());}

            String[] arrayString=new String[aList.size()];
        for (int i = 0; i < arrayString.length; i++)
            arrayString[i] = aList.get(i).trim();

        return arrayString;
    }

}
