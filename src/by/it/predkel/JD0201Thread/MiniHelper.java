package by.it.predkel.JD0201Thread;

import by.it.predkel.SimplyUsefulClasses.Rnd;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Admin on 10.03.2016.
 */
public class MiniHelper {

    public static HashMap<String, Double> chooseGoods() {
        HashMap<String, Double> listOfChosenGoods=new HashMap<>();
        ArrayList<String> listNames=new ArrayList<>();
        HashMap<String,Double> listOfAllGoods=ReadListOfGoods();

        int iter = Rnd.fromTo(1, 5);//kolicestvo tovarov
        for (int i = 0; i < iter; i++) {
            Set set = listOfAllGoods.entrySet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                Map.Entry me = (Map.Entry) it.next();
                listNames.add(me.getKey().toString());
            }
            int k=Rnd.fromTo(0, listNames.size()-1);
            listOfChosenGoods.put(listNames.get(k), listOfAllGoods.get(listNames.get(k)));
        }
        return listOfChosenGoods;
    }

    private static HashMap<String,Double> ReadListOfGoods() {//считываем все товары из файла
        String src = System.getProperty("user.dir") + "/src/by/it/predkel/";
        String fin = src + "JD0201Thread/123.txt";
        File fl = new File(fin);
        HashMap<String,Double> listOfGoods=new HashMap<>();
        try (BufferedReader data = new BufferedReader(new FileReader(fl))) {
            String line;
            Pattern pat1 = Pattern.compile("[0-9]+");
            Pattern pat = Pattern.compile("[а-яА-я]+((\\s[а-яА-Я]+)+)?");
            String name ="";Double cost=0.0;
            while ((line = data.readLine()) != null) {
                Matcher mat = pat.matcher(line);
                if (mat.find()) {
                    name=mat.group();
                }
                Matcher mat1 = pat1.matcher(line);
                if (mat1.find()) {
                    cost=Double.valueOf(mat1.group());
                }
                listOfGoods.put(name,cost);
            }
        }catch (FileNotFoundException e) {
            System.out.println("Файла нет: " + fin);
        }catch (IOException e){
            System.out.println("Ошибка файла: " + fin);
        }
        return listOfGoods;
    }
}
