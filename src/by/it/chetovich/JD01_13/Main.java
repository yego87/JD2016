package by.it.chetovich.JD01_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yultos_ on 29.02.2016.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        //создаём список введенных строк
        List<String> listString = EnterStringIntoList.enterStrings();
        List<Integer> listInt = new ArrayList<>();

        double sum = 0;
        for (String s : listString) {
            try {
                int num = StringToInt.parseToInt(s);
                System.out.print(num+" ");
                double root = SqrtFromInt.calcSqrt(num);
                sum+=root;
                System.out.println(", sqrt sum: "+sum);

            }
            catch (NumberFormatException e){
                System.out.println(s+" is impossible to parse to integer.");
            }
            /*catch (Exception e) {
                System.out.println("Impossible operation taking sqrt from negative number ");
            }*/
        }


    }
}
