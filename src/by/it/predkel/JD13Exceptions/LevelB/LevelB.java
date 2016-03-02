package by.it.predkel.JD13Exceptions.LevelB;

/**
 * Created by user_2 on 29.02.2016.
 */
public class LevelB {

    public static void firstClass(){
        System.out.println("In the begin of first class");
        try {
            secondClass();
        } catch (ArithmeticException e) {
           System.out.println("Exception!/by zero");
        }

        System.out.println("In the end of first class");
    }

    public static void secondClass() throws ArithmeticException {
        System.out.println("In the begin of second class");

            lastClass();

        System.out.println("In the end of second class");
    }

    public static void lastClass() {
        System.out.println("In the begin of third class");
            int a=0,b=5;
            int k=b/a;
        System.out.println("In the end of third class");
    }
}
