package by.it.predkel.JD13Exceptions.LevelA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by user_2 on 29.02.2016.
 */
public class LevelA {
    public static void levelA() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String rLine = " ";
        ArrayList<Double> number = new ArrayList<>();
      //  String entry;
//        number.add(Math.sqrt(Double.valueOf(rLine)));
        while (!rLine.equals("END")) {
            try {
                rLine = bufferedReader.readLine();
                // entry = rLine;
                number.add(Math.sqrt(Double.valueOf(rLine)));
                Double k = 0.0;
                for (int i = 0; i < number.size(); i++) {
                    k += number.get(i);
                }
                System.out.println(k);
            } catch (NumberFormatException e) {
                System.out.println("Ну что ж, бывает...");
                break;
            } catch (ArithmeticException e) {
                System.out.println("Ну что ж, бывает...");
                break;
            }
        }
            bufferedReader.close();
     }
}
