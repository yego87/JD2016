package by.it.veselov.JD01_02.Task_1_A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by yegorveselov on 16.02.16.
 */
public class Task_A_4 {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String rLine = bufferedReader.readLine();
        bufferedReader.close();

        String[] val = rLine.split(" ");
        boolean b = false;
        for (int i=0; i<val.length; i++){
        char[] str = val[i].toCharArray();
            int j;
            int k = 0;
        for ( j = 0; j < str.length / 2; k = str.length - 1, j++, k--){
                if (str[i]==str[k]){b=true; break;}
            if (b) break;}
            if (!b) System.out.println(val[i]);


    }
}}
