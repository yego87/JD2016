package by.it.knyazev.MathLab;

/**
 * Created by Mac on 03.03.16.
 */
public class Main {
    public static void main(String[] args) {
        String line = "2.3 + 2 + {2,3,4}";
        System.out.println("Input line: "+line);
        Equally equallycheck = new Equally();

        TaskManager mid = new TaskManager(line);

        try {
            if (equallycheck.equally(line)){
                mid.requiredOperations();
            } else {
                System.out.println("=");
            }
        }catch (NumberFormatException e) {
        }
    }
}
