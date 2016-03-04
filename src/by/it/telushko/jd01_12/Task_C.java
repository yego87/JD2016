package by.it.telushko.jd01_12;

import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_C {
    public static void taskC1 (String names){
        TreeMap<Integer,String> nameList = new TreeMap<>(); // для сортировки по возрастанию ключей используем TreeMap

        Pattern word= Pattern.compile("[а-яА-ЯёЁ]+");       // разбивае стоку на слова
        Matcher okWord=word.matcher(names);

        while (okWord.find()){
            int key=0;
            while (nameList.containsKey(key)){              //генерируем ключ до тех пор, пока он не окажется уникальным
                key=(int)(Math.random()*200);                                   //Ключ
            }
            String name=names.substring(okWord.start(),okWord.end());           //Значение
            nameList.put(key,name);
        }

        TreeMap<Integer,String> uniqNameList = new TreeMap<Integer, String>();

        for (Map.Entry entry : nameList.entrySet()) {
            String value = (String)entry.getValue();
            if (!(uniqNameList.containsValue(value))){
                int key = (int) entry.getKey();
                uniqNameList.put(key,value);
            }
        }

        System.out.println("Исходный список:\n"
                +names+"\n" +
                "Список с уникальными ключами, отсортированными по возрастанию:\n"+
                nameList+"\nУдалены повторы:\n"+uniqNameList);
    }
}
