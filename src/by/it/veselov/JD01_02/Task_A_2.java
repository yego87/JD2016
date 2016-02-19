package by.it.veselov.JD01_02.Task_1_A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by yegorveselov on 16.02.16.
 */
public class Task_A_2 {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader=new InputStreamReader (System.in);
        BufferedReader bufferedReader=new BufferedReader (inputStreamReader);
        String rLine=bufferedReader.readLine();
        bufferedReader.close();

        String[] val=rLine.split(" ");
        String max = val[0];
        String min = val[0];
        int sred = 0;
        for (int i=0; i<val.length; i++)
            sred = sred + val[i].length();
            sred = sred / val.length;
        System.out.println(sred);
        for (int i=0; i<val.length; i++){
            if (val[i].length() > sred)
                System.out.println("Больше среднего" + val[i]);
                if (val[i].length() < sred)
                    System.out.println("Меньше среднего"+ val[i]);


    }
}}

