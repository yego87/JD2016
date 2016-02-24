package by.it.dorostchenok.jd01_09;

import java.util.Arrays;

public class Main {
    public static void main(String[] arg){

        Value val1 = new FloatValue(new Double(3.4));
        Value val2 = new FloatValue(5.2);
        System.out.println(val1.getClass().getSimpleName());
        double[][] m = {{1,2},{3,4}};
        Value matrix = new MatrixValue(m);
        System.out.println(((FloatValue)val1).add(val1, val2).getValue());

    }
}
