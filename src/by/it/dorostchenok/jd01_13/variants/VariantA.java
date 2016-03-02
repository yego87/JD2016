package by.it.dorostchenok.jd01_13.variants;

import by.it.dorostchenok.jd01_13.ConsoleReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VariantA {

    public void execute() throws IOException {
        ConsoleReader reader = new ConsoleReader();
        List<Double> sqrtList = new ArrayList<>();

        String line;

        do {
            line = reader.readLine();
            Double d = Double.parseDouble(line);
            sqrtList.add(Math.sqrt(d));
            double sum = 0;
            for (double d1 : sqrtList){
                sum += d1;
            }
            System.out.println(d);
            System.out.println(sum);


        } while (!"end".equals(line.toLowerCase()));


    }
}
