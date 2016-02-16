package by.it.telushko.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Владимир on 16.02.2016.
 */
public class TaskB {
    public static void taskB1(String text){

        StringBuilder sbText=new StringBuilder(text);
        Pattern word= Pattern.compile("[;,.: \\s][йцкнгшщзхъфвпрлджчсмтьб][а-яА-Я]{4}[;,: .\\s]");
        Matcher okWord=word.matcher(sbText);
        int count=0;
        while(okWord.find()) {
            count++;
        }
        System.out.println(count);
        int[] delIndex=new int[count];
        count=0;
        okWord=word.matcher(sbText);
        while(okWord.find()){
            delIndex[count]=okWord.start();
            count++;
        }
        for (int i = delIndex.length-1; i>=0 ; i--) {
            sbText.delete(delIndex[i],delIndex[i]+6);
        }
        System.out.println(sbText);
    }
    public static void taskB2(String text2){
        StringBuilder sbText=new StringBuilder(text2);
        //найдем количество предложений в тексте, заодно удалим переносы
        int sentenceCounter=0;
        for (int i = 0; i <sbText.length() ; i++) {
            if('.'==sbText.charAt(i))sentenceCounter++;
            if('\n'==sbText.charAt(i))sbText.deleteCharAt(i);
        }
        int sentenseStart=0;
        int sentenseEnd=0;
        int sentenseLength=0;
        int wordCounter;

        Pattern word= Pattern.compile("[а-яА-я0-9]+");
        for (int i = 0; i <sentenceCounter ; i++) {
            wordCounter=0;
            Matcher okWord=word.matcher(sbText);
            while(okWord.find()) {
                wordCounter++;
                if('.'==sbText.charAt(okWord.end())){
                    if (wordCounter>sentenseLength){
                        sentenseLength=wordCounter;
                        sentenseStart=sentenseEnd;
                        sentenseEnd=okWord.end();
                    }
                    wordCounter=0;
                }

            }
        }
    }
}
