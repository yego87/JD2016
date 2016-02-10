package by.it.novik.JD01_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class A2_main {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        //String rLine = bufferedReader.readLine();
        String rLine ="5 15 896";
        bufferedReader.close();

        String[] val = rLine.split(" ");
        int averageLength = A2.averageLength(val);
        System.out.println("The average is " + averageLength);
        for (String s:val){
            if (s.length()>averageLength) {
            System.out.println("Longer: " + s);
            System.out.println("Its length: " + s.length());
            }
        }
    }
}
