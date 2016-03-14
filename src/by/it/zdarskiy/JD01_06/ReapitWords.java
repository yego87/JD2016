package by.it.zdarskiy.JD01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by sleig_000 on 15.02.2016.
 */
public class ReapitWords {
    public static void main (StringBuilder sF){
        Matcher m = Pattern.compile("[А-яЁё]+").matcher(sF);

         while (m.find()){
             String st1="";
             String st2="";
             int sum = 0;
             Matcher mWord = Pattern.compile("[А-яЁё]+").matcher(sF);
              while (mWord.find()) {
                  st1 = sF.substring(m.start(), m.end());
                  st2 = sF.substring(mWord.start(), mWord.end());
                  if (0 == st1.compareToIgnoreCase(st2)) sum++;
              }
                  System.out.println("Слово: " + st1 + " повторяется " + sum + " раз");
              }
         }

    }
//gf
