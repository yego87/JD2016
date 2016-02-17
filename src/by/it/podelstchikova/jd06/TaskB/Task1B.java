package by.it.podelstchikova.jd06.TaskB;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1B {
 public static void print(String str)
 {
     String regex="\\b[^аяиеэюуёыАЯЁУЕОЭЮИЫ]{1}[а-я]{4}\\b";
     Pattern p = Pattern.compile(regex);

     int k=0;



         Matcher m = p.matcher(str);
         StringBuilder stringBuffer = new StringBuilder(str);

         while (m.find()) {
        k++;

         }
         int [] start = new int[k];
         int l=0;
         m = p.matcher(str);
         while (m.find()) {
           start[l]=m.start();
             l++;
         }
     for (int i = 0; i < start.length; i++) {
         stringBuffer.delete(start[i] - i*5,start[i] - i*5 + 5);
     }

         System.out.println(stringBuffer.toString());
     }
 }

