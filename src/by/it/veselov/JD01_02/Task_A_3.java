package by.it.veselov.JD01_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by yegorveselov on 16.02.16.
 */
public class Task_A_3 {
    public static void main(String[] args) throws IOException {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        String rLine = bufferedReader.readLine();
        bufferedReader.close();
        String[] val = rLine.split(" ");
        boolean m=false;
        for (int i=0; i<val.length; i++){
            char[] str = val[i].toCharArray();
            for (int j=0; j<str.length-1;j++) {
                for (int k = j+1; k < str.length; k++)
                { if (str[j] == str[k]) {m=true; break;}
                else {m=false;}
                }
                if (m) break;}
            if (!m) System.out.println(val[i]);
        }
    }

}