package by.it.chetovich.JD01_09;

/**
 * counts depending on the operation type and send the results to class Print
 */
public class Counting {

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
