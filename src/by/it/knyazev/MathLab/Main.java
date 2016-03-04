package by.it.knyazev.MathLab;

/**
 * Created by Mac on 03.03.16.
 */
public class Main {
    public static void main(String[] args) {
        String line = "2.3 + 2 + {0,2}";

        equally equallycheck = new equally();
        Middle mid = new Middle(line);
        try {
            if (equallycheck.equally(line)){
                mid.requiredOperations();
            } else {
                System.out.println("=");
            }
        }catch (NumberFormatException e) {
            System.out.println("Ошибка...");
        }
    }
}
