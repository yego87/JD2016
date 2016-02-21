package by.it.predkel.JD06String.LevelC;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * вывести рандомные слова в 100000000 символов
 */
public class MillionRandSymbols {
    public static String[] findMass(String str) {
        String[] sa = str.trim().split(" ");
        String[] s = new String[sa.length];
        int k = 0;
        //int dimension = 0;
        Pattern pat = Pattern.compile("[а-яА-яёЁ]+");
        Matcher mat = pat.matcher(str);
        while (mat.find()) {
            //  dimension++;//kolichestvo slov
            s[k] = mat.group();
            k++;
        }
        return s;
    }
    public static int findMax(String[] s) {
        int max = 0;
        for (String word : s) {
            if (max < word.length()) {
                max = word.length();//maksimalnaya dlina slova
            }
        }
        return max;
    }
       /* for (String word : s) {
            System.out.print(word);
        }
        System.out.print(max);*/
    public static long printWords(String[] s,int max) {
        int mil = 0;
        while (mil < (1000000000 - max)) {
            String buf=s[(int) (Math.random() * (s.length))]+" ";
            mil += buf.length()+1;
            //System.out.print(buf);
        }
        //System.out.println(mil);
        boolean checker = false;
        for (String word : s) {
            if (word.length() == 1000000000 - mil) {
                checker = true;
                mil +=word.length();
               // System.out.print(word);
                break;
            }
        }
        while (!checker) {
            for (int i = 0; i < s.length; i++) {
                for (int j = i + 1; j < s.length; j++) {
                    if (s[i].length() + s[j].length() + 1 == 1000000000 - mil) {
                        mil = mil + s[i].length()+ s[j].length()+1;
                        //System.out.print(s[i]+" "+s[j]);
                        checker = true;
                    }
                }
            }
        }
     /*   char[] ch = mil.toCharArray();
        for (int i=0;i<ch.length;i++) {
            System.out.print(ch[i]);
            if (i%200==0){
                System.out.println();
            }
        }*/
        long time1=System.currentTimeMillis();
    System.out.println(time1);
        return time1;
    }
    public static long printWordsB(String[] s,int max) {
        StringBuilder[] s1=new StringBuilder[s.length];
        for (int i=0;i<s.length;i++) {
            s1[i] = new StringBuilder(s[i]);
        }
        int mil = 0;StringBuilder buf = new StringBuilder();
        while (mil < (1000000000 - max)) {
            buf.append(s1[(int) (Math.random() * (s.length))]+" ");
            mil += buf.length()+1;
        }
        //System.out.println(mil);
        boolean checker = false;
        for (String word : s) {
            if (word.length() == 1000000000 - mil) {
                checker = true;
                mil +=word.length();
                buf.append(word);
                break;
            }
        }
        while (!checker) {
            for (int i = 0; i < s.length; i++) {
                for (int j = i + 1; j < s.length; j++) {
                    if (s[i].length() + s[j].length() + 1 == 1000000000 - mil) {
                        mil = mil + s[i].length()+ s[j].length()+1;
                        buf.append(s[i]+" "+s[j]);
                        checker = true;
                    }
                }
            }
        }
       // System.out.print(buf);
        long time2=System.currentTimeMillis();
        System.out.println(time2);
        return time2;
    }
}