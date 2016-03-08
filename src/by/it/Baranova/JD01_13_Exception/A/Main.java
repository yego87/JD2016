package by.it.Baranova.JD01_13_Exception.A;

import by.it.Baranova.JD01_13_Exception.Utils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ekaterina on 2/29/16.
 */
public class Main {
    public static void main(String[] args) throws IOException, NegativeNumberException {
        System.out.println("Введите число, для выхода введите End");
        String rLine = Utils.ReadLine();

        List<Double> numbers=new ArrayList<>();
        while (!rLine.equals("End")){
            numbers= TryCatch.parseFromConsole(rLine,numbers);
            System.out.println("Введите число");
            rLine = Utils.ReadLine();
        }
    }

}
