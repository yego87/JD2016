package by.it.dorostchenok.jd01_13.b;

import by.it.dorostchenok.jd01_13.a.ConsoleReader;

import java.io.IOException;

public class VariantB {

    private ConsoleReader reader = new ConsoleReader();
    private Integer x;
    private Integer y;
    private String line;

    public void start() throws IOException, ParseException {
        System.out.println("Start");
        run();
        System.out.println("Stop");
    }

    private void run() throws IOException, ParseException {
        System.out.println("Start run");

        execute();

        System.out.println("Stop run");
    }

    private void execute() throws IOException, ParseException {
        System.out.println("Start execution");

        System.out.println("Введите делимое");
        line = reader.readLine();
        parseDouble(line);
        System.out.println("Введите делитель");
        line = reader.readLine();
        parseDouble(line);
        //орабатываем деление на 0 непосредственно на месте.
        try {
            double result = x / y;
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e){
            System.out.println("Деление на 0 невозможно!");
        }

        System.out.println("Stop execution");

    }

    private void parseDouble(String line) throws ParseException{
        System.out.println("Start parsing");

        try{
            if (x == null){
                x = Integer.parseInt(line);
            } else {
                y = Integer.parseInt(line);
            }
        } catch (NumberFormatException e) {
            // выбрасываю "самодельное" проверяемое исключение для примера,
            // чтобы компилятор заставил добавить его в сигнатуру метода
            throw new ParseException();
        }

        System.out.println("Stop parsing");
    }
}
