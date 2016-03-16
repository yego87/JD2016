package by.it.knyazev.JD02.less_01.A;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

/**
 * Created by Mac on 16.03.16.
 */
public class Utility {
    public static Map<String, Integer> FromFileToMap(){
        Map<String,Integer> map = new TreeMap<>();
        String src = System.getProperty("user.dir") + "/src/by/it/knyazev/JD02/less_01/A/a.txt";
        File file = new File(src);
        try(BufferedReader r = new BufferedReader(new FileReader(file))){
        String line;
        while ((line = r.readLine())!=null){
            String[] array = convertLineToArray(line);
            String a = array[0].trim();// имя товара
            Integer b = Integer.parseInt(array[1].trim()); //цена
            map.put(a, b);
        }
    }
    catch (IOException e){
        System.out.println(file+" file not read.");
    }
    return map;
}


    public static String[] convertLineToArray(String s){

        Pattern pat = Pattern.compile("\\;"); //разбиваем на 2 переменных и  заносим их в массив
        String[] array = pat.split(s);
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].trim();
        }
        return array;
    }
}
