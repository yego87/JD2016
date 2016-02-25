package by.it.chetovich.JD01_09;

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

    public static void count (Var a, Var b, String line){

            if (line.contains("+")) {
                System.out.print(a + " + " + b + " ");
                Print.print(a.add(b));
            }

            if (line.contains("-")) {
                System.out.print(a + " - " + b + " ");
                Print.print(a.sub(b));
            }

            if (line.contains("*")) {
                System.out.print(a + " * " + b + " ");
                Print.print(a.multi(b));
            }

            if (line.contains("/")) {
                System.out.print(a + " / " + b + " ");
                Print.print(a.divide(b));
            }

    }
}
