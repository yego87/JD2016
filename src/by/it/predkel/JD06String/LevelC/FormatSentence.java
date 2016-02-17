package by.it.predkel.JD06String.LevelC;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Formatter;
import java.lang.String;
import java.io.PrintWriter;
import java.io.PrintStream;
/**
 * форматирование с выравниванием по обоим краям
 */
public class FormatSentence {
    public static void formatSentence(String str){
        StringBuilder str1=new StringBuilder(str.trim());
        StringBuilder[] s=new StringBuilder[str.trim().split("[.!?]\\s*").length];
        str=str.trim();
        int o=0;
        Pattern pat = Pattern.compile("([А-ЯA-Z]((т.п.|т.д.|пр.)|[^?!.\\(]|\\([^\\)]*\\))*[.?!])");
        Matcher mat = pat.matcher(str1);
        while (mat.find()){
            s[o]=new StringBuilder(mat.group());
            o++;
        }
        int max=s[0].length();
        int theLargestSentence=0;
        for (int i=1;i<s.length;i++){
            if (max<s[i].length()){
                max=s[i].length();
                theLargestSentence=i;
            }
        }
        Integer ma=0;
        for (StringBuilder sentence:s){
            Pattern pat1 = Pattern.compile(" ");
            Matcher mat1 = pat1.matcher(sentence);
            while (mat1.find()){
                if (mat1.group().length()>ma){
                    ma=mat1.group().length();
                }
            }
        }
        int theLargestLenght=s[theLargestSentence].length();
        for (int i=0;i<s.length;i++){
            Integer k=theLargestLenght-s[i].length();
            int n=0;
            while (s[i].length()<=max){
                for (int j=0;j<s[i].length();j++) {
                    if (k >= n) {
                        if (s[i].charAt(j) == ' ') {
                            s[i].insert(j, ' ');
                            n++;
                            j++;
                        }
                    }
                }
            }System.out.println(s[i]);
        }
    }
}
