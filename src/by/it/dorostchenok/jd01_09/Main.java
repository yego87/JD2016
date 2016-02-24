package by.it.dorostchenok.jd01_09;

import by.it.dorostchenok.jd01_09.interfaces.Calc;
import by.it.dorostchenok.jd01_09.services.Calculator;
import by.it.dorostchenok.jd01_09.values.FloatValue;
import by.it.dorostchenok.jd01_09.values.Value;


public class Main {
    public static void main(String[] arg){

        Value val1 = new FloatValue(0.2);
        Value val2 = new FloatValue(5.3);
        val1.getValue();
        //System.out.println(val1.getClass().getSimpleName());
        //double[][] m = {{1,2},{3,4}};
        //Value matrix = new MatrixValue(m);

        Calc calc = new Calculator();
        Value result = calc.div(val1, val2);
        System.out.println(result.getValue());
        //System.out.println(new Double(1.2) + new Double(3.2));

    }
}
