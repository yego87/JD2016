package by.it.dorostchenok.jd01_13.b;

import by.it.dorostchenok.jd01_13.a.ConsoleReader;

import java.io.IOException;

public class VariantB {

    private ConsoleReader reader = new ConsoleReader();
    private Double x;
    private Double y;
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
        try {
            System.out.println("Результат: " + x / y);
        }

        System.out.println("Stop execution");

    }

    private void parseDouble(String line) throws ParseException{
        System.out.println("Start parsing");

        try{
            if (x == null){
                x = Double.parseDouble(line);
            } else {
                y = Double.parseDouble(line);
            }
        } catch (NumberFormatException e) {
            throw new ParseException();
        }

        System.out.println("Stop parsing");
    }
}
