package by.it.telushko.jd01_12;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Владимир on 01.03.2016.
 */
public class Task_B {
    public static void task_B(String text){
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
}
