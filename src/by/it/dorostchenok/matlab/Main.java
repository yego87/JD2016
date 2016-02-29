package by.it.dorostchenok.matlab;

import by.it.dorostchenok.matlab.exception.BadOperationException;
import by.it.dorostchenok.matlab.exception.BadValueException;
import by.it.dorostchenok.matlab.interfaces.Calc;
import by.it.dorostchenok.matlab.services.Calculator;
import by.it.dorostchenok.matlab.values.FloatValue;
import by.it.dorostchenok.matlab.values.MatrixValue;
import by.it.dorostchenok.matlab.values.Value;
import by.it.dorostchenok.matlab.values.VectorValue;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;


public class Main {
    public static void main(String[] arg) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, BadOperationException, BadValueException {

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
        double[] d = {1,2,3};
        double[][] m = {{1,2},{3,4}};
        Value vector = new VectorValue(d);
        System.out.println(vector);
        Value matrix = new MatrixValue(m);
        System.out.println(matrix);
        System.out.println(val1);
        ConsoleRunner runner = new ConsoleRunner();
        runner.execute();



    }
}
