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
        String regex = "[а-яА-ЯЁё]{2,}";
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(str);
        ArrayList<String> list1 = new ArrayList<String>();
        boolean check = true;
        while (mat.find()) {
            if (list1.isEmpty()) {
                list1.add(mat.group());
            } else {
                for (String s : list1) {
                    if (s.equals(mat.group())) {
                        check = false;

                    }
                }
                if (check) list1.add(mat.group());
            }

        }
        for (String s : list1) {
            System.out.print(s + " ");

        }
    }
}
