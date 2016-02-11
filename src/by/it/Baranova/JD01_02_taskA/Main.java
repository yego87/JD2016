package by.it.Baranova.JD01_02_taskA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ekaterina on 2/10/16.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // ReadingFromConsole readingFromConsole = new ReadingFromConsole();
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String rLine = bufferedReader.readLine();
        bufferedReader.close();


        String[] val = rLine.split(" ");
        int[] v = new int[val.length];
        int i = 0;
        for (String s : val) {
            v[i] = Integer.valueOf(s);
            System.out.print(v[i] + " ");
            i++;
        }
        System.out.println("");
        int minlength = val[0].length();
        int minposition = 0;
        int commonlength = 0;
        for (int j = 1; j < v.length; j++) {
            if (val[j].length() < minlength) {
                minlength = val[j].length();
                minposition = j;
            }
            commonlength = commonlength + val[j].length();
        }
        System.out.println("Самое короткое число " + v[minposition]);

        int maxlength = val[0].length();
        int maxposition = 0;
        for (int j = 1; j < v.length; j++) {
            if (val[j].length() > maxlength) {
                maxlength = val[j].length();
                maxposition = j;
            }
        }
        System.out.println("Самое длинное число " + v[maxposition]);

        System.out.println("Числа с длиной меньше средней");
        int averagelength = commonlength / val.length;
        for (int j = 0; j < v.length; j++) {
            if (val[j].length()<averagelength || val[j].length()==averagelength) System.out.print(val[j] + " ");
        }

        System.out.println("");
        System.out.println("Число, в котором числа не повторяются ");
        //Find the first number with different digits
        int counter=0;int z=0;
        while (z<v.length && counter==0) {

            int p = 0;
            int numberlength = val[z].length();

            for (int j = 0; j < numberlength; j++)
                for (int k = 0; k < numberlength; k++) {
                    char mainposition = val[z].charAt(j);
                    char compareposition = val[z].charAt(k);
                    if (mainposition == compareposition & j != k) {
                        p = p + 1;
                    }
                }
            if (p == 0) {
                System.out.println(val[z] + " ");
                counter = counter + 1;}

            z++;
        }
        //Find all numbers that are palendroms
        System.out.println("Числа палендромы");
        for (int j=0;j<v.length;j++){
            int counterofpolindrom=0;
            for (int k=0;k<val[j].length()/2;k++){
                char mainposition=val[j].charAt(k);
                char oppositeposittion=val[j].charAt(val[j].length()-k-1);
                if (mainposition!=oppositeposittion) counterofpolindrom=counterofpolindrom+1;
            }
            if (counterofpolindrom==0) System.out.print(val[j]+" ");
        }



    }
}
