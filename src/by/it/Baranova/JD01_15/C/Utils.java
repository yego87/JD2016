package by.it.Baranova.JD01_15.C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

/**
 * Created by Ekaterina on 3/6/16.
 */
public class Utils {

    public static String ReadLine()throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String rLine = bufferedReader.readLine();
        //bufferedReader.close();
        return rLine;

    }
    /**
     * Вывод в консоль HashMap
     * @param hashMap
     */
    public static void printHashmap (Map<String,String> hashMap){
        if (!hashMap.isEmpty()) {
            for (Map.Entry<String,String> pair: hashMap.entrySet())
                System.out.println(pair.getKey()+"  "+pair.getValue());
        }
        else System.out.println("Список пуст.");
    }
}
