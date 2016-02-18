package by.it.telushko.jd01_06;


import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskC {
    public static void taskC1(String text){
        String[] formatted=text.split("\n");
        StringBuilder[] sbFormatted =new StringBuilder[formatted.length];
        for (int i = 0; i <formatted.length ; i++) {
            sbFormatted[i]=new StringBuilder(formatted[i]);
        }
        int maxStrLength =0;
        //находим строку максимальной длинны, по которой будет проходить выравнивание
        for (int i = 0; i <sbFormatted.length ; i++)
            if (sbFormatted[i].length()>maxStrLength) maxStrLength=sbFormatted.length;
        //каждую строку дополняем пробелами, пока ее длина не станет равна максимальной
        int j;
        for (int i = 0; i <sbFormatted.length ; i++) {
            j=0;
            while(sbFormatted[i].length()<maxStrLength+3){//3-волшебная
                j++;
                if(j==sbFormatted[i].length())j=0;
                if((sbFormatted[i].charAt(j)==' ')&&
                (sbFormatted[i].charAt(j+1)!=' ')&&
                (sbFormatted[i].charAt(j+1)!='\n')){
                    sbFormatted[i].insert(j,' ');
                    j+=2;
                }
            }
        }
        for (int i = 0; i <sbFormatted.length ; i++)
            System.out.print(sbFormatted[i]+"\n");
    }

    public static void taskC2(String text){
        StringBuilder sbText=new StringBuilder(text);
        //считаем кол-во слов
        Pattern word= Pattern.compile("[а-яА-ЯёЁ]+");
        Matcher okWord=word.matcher(sbText);
        int wordCount=0;
        while(okWord.find())wordCount++;
        //заполняем словами массив
        String[] words=new String[wordCount];
        okWord=word.matcher(sbText);
        wordCount=0;
        while(okWord.find()){
            words[wordCount]=sbText.substring(okWord.start(),okWord.end());
            wordCount++;
        }

        String million ="";

        for (int i = 0; i <words.length ; i++) {
            System.out.println(words[i]);
        }

        while(million.length()<1e6){
            int rnd= (int)Math.random()*words.length-1;

        }
    }
}
