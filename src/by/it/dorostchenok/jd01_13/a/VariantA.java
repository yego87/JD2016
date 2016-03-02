package by.it.dorostchenok.jd01_13.a;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VariantA {

    public void execute() throws IOException {
        ConsoleReader reader = new ConsoleReader();
        List<Double> sqrtList = new ArrayList<>();

        String line;

        while (true){
            line = reader.readLine();
            Double d = 0.0;
            if ("end".equals(line.toLowerCase())){
                break;
            }
            try{
                d = Double.parseDouble(line);

            } catch (NumberFormatException e){
                System.out.println("Ошибка: " + line + " не является числом");
                continue;
            }
            Double sqrt = Math.sqrt(d);
            if (sqrt.isNaN()) {
                System.out.println("Ошибка: невозможно извлечь квадратный корень из " + line);
                continue;
            }
            sqrtList.add(sqrt);
            double sum = 0;
            for (double d1 : sqrtList){
                sum += d1;
            }
            System.out.println("Введённое число: " + d + ". Сумма корней: " + sum);
        }
    }
}
