package by.it.chetovich.Matlab;

/**
 * counts depending on the operation type and send the results to class Print
 */
public class Counting {

    /**
     *
     * @param a первый операнд
     * @param b второй операнд
     * @param line первоначально введенная строка, нужна для определения типа операции (+ / * -)
     */

    public static void count (Var a, Var b, String line) throws ErrorException {

            if (line.contains("+")) {
                System.out.print(a +a.getType()+ " + " + b+b.getType() + " ");
                UtilsMatlab.print(a.add(b));
            }

            if (line.contains("-")) {
                System.out.print(a + " - " + b + " ");
                UtilsMatlab.print(a.sub(b));
            }

            if (line.contains("*")) {
                System.out.print(a + " * " + b + " ");
                UtilsMatlab.print(a.multi(b));
            }

            if (line.contains("/")) {
                System.out.print(a + " / " + b + " ");
                    UtilsMatlab.print(a.divide(b));
            }

    }
}
