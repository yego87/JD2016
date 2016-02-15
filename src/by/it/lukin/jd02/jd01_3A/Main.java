package by.it.lukin.jd02.jd01_3A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Найти число, состоящее только из различных цифр. Если таких чисел не-
//сколько, найти первое из них.

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String rLine = bufferedReader.readLine();
        bufferedReader.close();

        String[] val = rLine.split(" ");
        boolean repeatedElementFound = false;
        int i = 0;
        int j =0;
        while (repeatedElementFound == false){
            String curStr = val[j];
            i = 0;
            repeatedElementFound = false;
            while (repeatedElementFound == false && i < curStr.length()){
                for (int k = i+1;k < curStr.length();k++){
                    if (curStr.charAt(i) == curStr.charAt(k)){
                        repeatedElementFound = true;
                    }
                }
                i++;
            }
            if (repeatedElementFound) {
                System.out.println(curStr);
            }
            j++;
        }
    }
}