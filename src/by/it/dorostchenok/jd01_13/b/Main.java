package by.it.dorostchenok.jd01_13.b;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Start main");
        VariantB b = new VariantB();

        try {
            b.start();
        } catch (ParseException e){
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Stop main");

    }
}
