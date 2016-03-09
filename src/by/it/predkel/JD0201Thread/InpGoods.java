package by.it.predkel.JD0201Thread;

import java.io.*;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user_2 on 09.03.2016.
 */
public class InpGoods {
    public static HashMap<String,Double> lGoods() {
        String src = System.getProperty("user.dir") + "/src/by/it/predkel/";
        String fin = src + "JD14Flows/text1.txt";
        File fl = new File(fin);
        HashMap<String,Double> listOfGoods=new HashMap<>();
        try (BufferedReader data = new BufferedReader(new FileReader(fl))) {
            String line;
            Pattern pat1 = Pattern.compile("[а-яА-я]+(\\s[а-яА-Я]+)?");
            Pattern pat = Pattern.compile("[0-9]+");
            String name ="";
            Double cost=0.0;
            while ((line = data.readLine()) != null) {
                Matcher mat = pat.matcher(line);
                if (mat.matches()) {
                    name=mat.group();
                }
                Matcher mat1 = pat1.matcher(line);
                if (mat1.matches()) {
                    cost=Double.valueOf(mat1.group());
                }
            }
            listOfGoods.put(name,cost);
            System.out.println(name + " / " + cost);
        }catch (FileNotFoundException e) {
            System.out.println("Файла нет: " + fin);
        }catch (IOException e){
            System.out.println("Ошибка файла: " + fin);
        }
        return listOfGoods;
    }
}
