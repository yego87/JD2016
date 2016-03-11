package by.it.daylidovich.JD02_01.Goods;

import by.it.daylidovich.JD02_01.Utils.RandomFromInterval;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Goods {

    static HashMap<String, Integer> goods = new HashMap<>();

    public Goods(String name, int prise){
        goods.put(name, prise);
    }

    public static void readGoods(){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("src\\by\\it\\daylidovich\\JD02_01\\Goods\\Goods.txt"));
            String line;
            while (null != (line = reader.readLine())){
                new Goods(readNameGoods(line), readPriseGoods(line));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        } catch (IOException e) {
            System.out.println("Ошибка чтения.");
        }
    }

    private static String readNameGoods(String line){
        Matcher matcher = Pattern.compile("[А-яёЁ ]+").matcher(line);
        if (matcher.find())
            return matcher.group();
        else
            return "Ошибка чтения.";
    }

    private static int readPriseGoods(String line){
        Matcher matcher = Pattern.compile("[0-9]+").matcher(line);
        if (matcher.find())
            return Integer.parseInt(matcher.group());
        else
            return 0;
    }

    public static String randomGoods(){
        Set<String> set = goods.keySet();
        int number = RandomFromInterval.randomInterval(0, set.size() - 1);
        String goods = "";
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext() && 0 < number){
            goods = iterator.next();
            number--;
        }
        return goods.trim();
    }

}
