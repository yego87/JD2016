package by.it.predkel.JD06String.LevelA;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Найти неповторяющиеся слова
 *
 */
public class SameWords {
    public static void sameWords(String str) {
        String regex = "[а-яА-ЯЁё]+";
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(str);
        ArrayList<String> list1 = new ArrayList<String>();
        boolean check = true;
        ArrayList<Integer> index = new ArrayList<Integer>();
        while (mat.find()) {
            if (list1.isEmpty()) {
                list1.add(mat.group());
                index.add(1);
            } else {
                for (int i=0;i<list1.size();i++) {
                    if (list1.get(i).equals(mat.group())) {
                        int k=index.get(i);
                        index.set(i,k+1);
                        check = false;
                    }
                }
                if (check) {
                    list1.add(mat.group());
                    index.add(1);
                }
            }
        }
        for (int i=0;i<list1.size();i++) {
            System.out.print(list1.get(i) +index.get(i)+ " ");

        }
    }
}
