package by.it.chetovich.JD01_09;


import java.util.Arrays;

/**
 * prints the variable
 */
public class Print {
    /**
     *
     * @param var instance which field should be printed
     */

    public static void print (Var var) {

        if (var instanceof FloatVar) System.out.println(" = "+((FloatVar) var).getVal());

        if (var instanceof VectorVar) System.out.println(" = "+Arrays.toString(((VectorVar) var).getVector()));

        if (var instanceof MatrixVar) System.out.println(" = "+Arrays.deepToString(((MatrixVar) var).getArray()));

    }
}
