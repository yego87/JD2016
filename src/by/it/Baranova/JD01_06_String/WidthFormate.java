package by.it.Baranova.JD01_06_String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ekaterina on 2/15/16.
 */
public class WidthFormate {

    public static String[] StringLinesToArray(String sb){
        Pattern p1=Pattern.compile("\\n");
        String [] lines=p1.split(sb);
        int n=lines.length;
        for (int i=0;i<n;i++){
            lines[i].trim();
        }
        return lines;
    }

    public static StringBuilder [] FormateLineArray (String [] lines){

        int n=lines.length;
        StringBuilder [] newLines=new StringBuilder[n];
        for (int i=0;i<n;i++){
            newLines[i]=new StringBuilder(lines[i]);
        }

        int maxlength=newLines[1].length();
        for (int i = 1; i <n ; i++) {
            if (newLines[i].length()>maxlength){
                maxlength=newLines[i].length();
            }
        }

        for (int i=0;i<n;i++) {
            newLines[i]=WidthFormate.FormateLine(newLines[i],maxlength);
        }
        System.out.println("\t\t Форматирование по обоим краям");
        for (int i=0;i<n;i++){
            System.out.println(newLines[i]);
        }

        return newLines;
    }

    public static StringBuilder FormateLine (StringBuilder line,int maxlength){
        int n=line.length();
        String regex="[А-Яа-яё]+";

        while (line.length()<=maxlength){
            Pattern p1=Pattern.compile(regex);
            Matcher m1=p1.matcher(line);

            while (m1.find()&&line.length()<=maxlength){
                int pos=m1.end();
                if (line.charAt(pos)==' '){ line.insert(pos," ");}
            }
        }
        return line;
    }
}
