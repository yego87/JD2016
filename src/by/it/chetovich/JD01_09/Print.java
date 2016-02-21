package by.it.chetovich.JD01_09;


import java.util.Arrays;

/**
 * Created by Yultos_ on 21.02.2016.
 */
public class Print {

    public static void print (Var var) {

        if (var instanceof FloatVar) {

            try {
                System.out.println(" = "+((FloatVar) var).getVal());
            } catch (NullPointerException e) {
                System.out.println("Вычисление невыполнимо.");
            }
        }

        if (var instanceof VectorVar) {

            try {
                System.out.println(" = "+Arrays.toString(((VectorVar) var).getVector()));
            } catch (NullPointerException e) {
                System.out.println("Вычисление невыполнимо.");
            }
        }

        if (var instanceof MatrixVar) {

            try {
                System.out.println(" = "+Arrays.deepToString(((MatrixVar) var).getArray()));
            } catch (NullPointerException e) {
                System.out.println("Вычисление невыполнимо.");
            }
        }

    }
}
