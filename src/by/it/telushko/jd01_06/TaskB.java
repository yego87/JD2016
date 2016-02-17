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
            if('\n'==sbText.charAt(i))sbText.deleteCharAt(i);
        }
        int sentenseStart=0;
        int sentenseEnd=0;
        int sentenseLength=0;
        int wordCounter;
        Pattern sentence= Pattern.compile("(\\.{3})|[\\.?!]");
        wordCounter=0;
        Matcher okSentence=sentence.matcher(sbText);
        while(okSentence.find()) sentenceCounter++;//Считаем количество предложений
        StringBuilder[] sentenceStore =new StringBuilder[sentenceCounter];//создаем массив для хранения предложений
        sentenceCounter=0;
        okSentence=sentence.matcher(sbText); //разбиваем массив на предложения
        while(okSentence.find()){
            sentenseStart=sentenseEnd;//получаем начало и конец предложения
            sentenseEnd=okSentence.end();
            System.out.println(sentenseStart+" "+sentenseEnd);
            System.out.println(sbText.charAt(okSentence.end()));
            sentenceStore[sentenceCounter]=new StringBuilder(sbText.substring(sentenseStart,sentenseEnd));
            System.out.println(sentenceStore[sentenceCounter]);
            sentenceCounter++;
        }

    }
}
