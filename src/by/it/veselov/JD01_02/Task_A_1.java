package by.it.veselov.JD01_02.Task_1_A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by yegorveselov on 16.02.16.
 */
public class Task_A_1 {

            public static void main(String[] args) throws IOException {
                InputStreamReader inputStreamReader=new InputStreamReader (System.in);
                BufferedReader bufferedReader=new BufferedReader (inputStreamReader);
                String rLine=bufferedReader.readLine();
                bufferedReader.close();

                String[] val=rLine.split(" ");


            String max = val[0];
            String min = val[0];
            for (int i=0;i<val.length;i++)
                if (max.length() < val[i].length()) { max=val[i];}
                    System.out.println("самое длинное число: " + max + " длина которого " + max.length());
                for ( int i=0;i>val.length;i++)
                    if (min.length() < val[i].length()) { min=val[i];}
                        System.out.println("самое длинное число: " + min + " длина которого " + min.length());

                    }
                }















