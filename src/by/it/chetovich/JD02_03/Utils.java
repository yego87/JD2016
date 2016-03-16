package by.it.chetovich.JD02_03;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;

/**
 * utils JD02_01
 */
public class Utils {

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


    public static void sleep (long ms){

        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static long howlongToSleep (){
        //получаем текущее время
        Calendar c = Calendar.getInstance();
        int currentSecond = c.get(Calendar.SECOND);
        //если сейчас конец минуты, каждую секунду заходят от 0 до 2 покупателей
        if (currentSecond>30) return 1000;
            //если начало минуты - каждые три секунды (то есть реже)
        else return 3000;
    }

    public static int createNewBuyer (int countBuyers){

        final Lock countLock = new ReentrantLock();

        int count = Rnd.fromTo(0,2);
        for (int i = 0; i < count; i++) {
            countBuyers++;
            //каждый 4 покупатель пенсионер
            if (countBuyers%4==0){
                new Buyer(countBuyers,true);
            }
            else{
                new Buyer(countBuyers, false);
            }

            if (countBuyers== ShopDispatcher.planBuyers) break;

        }
        return countBuyers;
    }


    public static  void printCashierTable (Cashier c){

        synchronized (c) {
            String s = "           ";
            String cashierData = c.getNum() + ": " + c.getBill();
            String queue = "queue:" + QueueToPay.queueToPay.size();
            String profit = "shop profit:" + Profit.getTotalProfit();
            switch (c.getNum()) {
                case 1:
                    System.out.printf("%11s%s%s%s%s%9s%21s", cashierData, s, s, s, s, queue, profit+'\n'); break;
                case 2:
                    System.out.printf("%s%11s%s%s%s%9s%21s", s, cashierData, s, s, s, queue, profit+'\n'); break;
                case 3:
                    System.out.printf("%s%s%11s%s%s%9s%21s", s, s, cashierData, s, s, queue, profit+'\n'); break;
                case 4:
                    System.out.printf("%s%s%s%11s%s%9s%21s", s, s, s, cashierData, s, queue, profit+'\n'); break;
                case 5:
                    System.out.printf("%s%s%s%s%11s%9s%21s", s, s, s, s, cashierData, queue, profit+'\n'); break;
                default:
                    break;
            }
        }
    }
}
