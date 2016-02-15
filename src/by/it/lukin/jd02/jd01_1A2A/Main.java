package by.it.lukin.jd02.jd01_1A2A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Найти самое короткое и самое длинное число. Вывести найденые числа и их длину.
 *
 * Вывести на консоль те числа, длина которых меньше(больше) средней, а так же их длину.
 */

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String rLine = bufferedReader.readLine();
        bufferedReader.close();

        String[] val = rLine.split(" ");
        int[] v = new int[val.length];
        int i = 0;
        for (String s: val){
            v[i] = Integer.valueOf(s);
            System.out.println(v[i]);
            i++;
        }

        //Поиск мин и макс длины
        String max = val[0], min = val[0];
        for (int j = 1;j < val.length;j++){
            if (max.length() < val[j].length()){
                max = val[j];
            }
            if (min.length() > val[j].length()){
                min = val[j];
            }
        }
        System.out.println("max =" + max + "," + "length = " + max.length());
        System.out.println("min =" + min + "," + "length = " + min.length());

        //Поиск мин и макс среднего
        int count = 0;
        String max1 = val[0],min1 = val[0];

        for (int k = 0;k < val.length;k++){
            count = count + val[k].length();
        }
        count = count / val.length;
        for (int j = 0; j < val.length; j++) {
            if (val[j].length() < count){
                System.out.println("number min: " + val[j]+ "," +"length: "+val[j].length());
            }
            if (val[j].length() > count ) {
                System.out.println("number max: " + val[j] + "," + "length: " + val[j].length());
            }
        }

    }

}
