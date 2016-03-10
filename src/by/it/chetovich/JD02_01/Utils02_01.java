package by.it.chetovich.JD02_01;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

/**
 * utils JD02_01
 */
public class Utils02_01 {

    public static Map<String, Integer> putGoodsFromFileIntoMap(){

        Map<String,Integer> map = new TreeMap<>();
        String src = System.getProperty("user.dir") + "/src/by/it/chetovich/JD02_01/goods.txt";
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

        Pattern pat = Pattern.compile("\\:"); //разбиваем на 2 переменных и  заносим их в массив
        String[] array = pat.split(s);
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].trim();
        }
        return array;
    }
}
