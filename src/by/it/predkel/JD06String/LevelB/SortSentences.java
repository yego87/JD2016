package by.it.predkel.JD06String.LevelB;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Вывести предложения в порядке возрастания количества слов
 */
public class SortSentences {
    public static void sentences(String str) {

        String[] sa = str.trim().split("[.!?]\\s*");
        String[] s=new String[sa.length];
        int o=0;
        Pattern pat = Pattern.compile("([А-ЯA-Z]((т.п.|т.д.|пр.)|[^?!.\\(]|\\([^\\)]*\\))*[.?!])");
        Matcher mat = pat.matcher(str);
        while (mat.find()){
            s[o]=mat.group();
            o++;
        }

        int[] arr = new int[s.length];
        int[] k = new int[s.length];

        for (int i = 0; i <= s.length - 1; i++) {
            int t = 0;
            String[] w = s[i].trim().split(" ");
            for (int j = 0; j <= w.length - 1; j++) {
                t++;
            }
            arr[i] = t;
            k[i] = t;
        }

        /*for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] == arr[j]) {
                    System.out
                            .println("Предложения не могут быть одинаковой длинны!");
                    System.exit(0);
                }
            }
        }*/

        int min = 0, tt = 0, index = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            min = arr[i];
            index = i;
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }
            if (index != i) {
                tt = arr[i];
                arr[i] = arr[index];
                arr[index] = tt;
            }
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr.length - 1; j++) {
                if (arr[i] == k[j]) {
                    System.out.print(s[j]+" ");
                }
            }
        }
    }

       /* String[] sentArray = str.split("[.!?]+");
        int k = 0, n = 0;
        for (String sent : sentArray) {//нахождение наибольшего колическа слов в предложении
            String[] l = sent.split("[\\s,:;]+");
            if (k < l[n].length())
                k = l[n].length();
            n++;
        }
        String[][] wordarray = new String[sentArray.length][k];

        Pattern pat = Pattern.compile("");

        Matcher mat = pat.matcher(word);
        if (mat.find()) {
            System.out.println(word);
        }
*/
    /*    String[] len=str.split("([А-ЯA-Z]((т.п.|т.д.|пр.)|[^?!.\\(]|\\([^\\)]*\\))*[.?!])");
        int masslen=len.length;
        String[] mass=new String[masslen];
        int[] massindex=new int[masslen];
        int stroki=0;
        Pattern pat = Pattern.compile("([А-ЯA-Z]((т.п.|т.д.|пр.)|[^?!.\\(]|\\([^\\)]*\\))*[.?!])");
        Pattern pat1 = Pattern.compile("[А-ЯA-Z]+");
        Matcher mat = pat.matcher(str);
        while (mat.find()){
            mass[stroki]=mat.group();
            int slova=0;
            Matcher mat1 = pat1.matcher(mat.group());
            while (mat1.find()){
                massindex[stroki]++;
            }
            stroki++;
        }
        for (int i=0;i<massindex.length;i++){
                System.out.print(massindex[i]+" ");

        }
/*
        for (String word : wordArray) {
            Matcher mat = pat.matcher(word);
            if (mat.find()) {
                strB.delete(mat.start(),mat.end());
            }
        }
        System.out.print(strB);*/
    }

