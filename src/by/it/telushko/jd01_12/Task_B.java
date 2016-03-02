package by.it.telushko.jd01_12;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_B {
    public static void task_B1(String text){
        System.out.println("Задание В-1");
        StringBuilder sbText=new StringBuilder(text);
        HashMap<String,Integer> myHashMap = new HashMap<String, Integer>();
        Pattern word= Pattern.compile("[a-zA-Z]+");
        Matcher okWord=word.matcher(sbText);
        while (okWord.find()){
            String key = sbText.substring(okWord.start(),okWord.end());
            if(myHashMap.containsKey(key)){
                int value=myHashMap.get(key);
                value++;
                myHashMap.put(key,value);
            }
            else myHashMap.put(key,1);
        }
        for (Map.Entry entry : myHashMap.entrySet()) {
            System.out.println("Слово: \"" + entry.getKey() +"\" встретилось "+entry.getValue()+" раз" );
        }

    }

    public static void task_B2(int n){
        long delta=0;
        long start=0;
        ArrayList<Integer> arrayRound = new ArrayList<>();                      //Cоздаем ArrayList
        for (int i = 0; i <n ; i++) arrayRound.add(i+1);                        //Заполняем
        LinkedList <Integer> linkedRound = new LinkedList<>(arrayRound);        //Скопируем Array в Linked
        System.out.println(linkedRound);

        //замер скорости для ArrayList

        start =System.nanoTime();                                               //запускается таймер
        myCollect.processArray(arrayRound);                                     //выполняется метод
        delta=System.nanoTime()-start;                                          //останавливаем таймер

        System.out.println(arrayRound);
        System.out.println("Время выполнения для Array: "+delta/1000 +"мкс");

        //замер скорости для LinkedList

        start =System.nanoTime();                                               //запускается таймер
        myCollect.processLinked(linkedRound);                                   //выполняется метод
        delta=System.nanoTime()-start;                                          //останавливаем таймер

        System.out.println(linkedRound);
        System.out.println("Время выполнения для Linked: "+delta/1000 +"мкс\n");
        System.out.println("Для Linked время работы оказалось больше, не смотря на то,\n" +
                "что удаление из середины листа в Linked должно быть быстрее. \n" +
                "Думаю, это связано с тем, что доступ к элементу по индексу\n" +
                "осуществляетя за время пропорциональное номеру элемента");
    }
}
