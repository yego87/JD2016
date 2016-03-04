package by.it.knyazev.MathLab;

import java.util.Scanner;

/**
 * Created by Mac on 03.03.16.
 */
public class Main {
    public static void main(String[] args) {

        //String line = new Scanner(System.in).nextLine(); //Input String
        String line = "2.3 + 4 * 4 / 4 + 2"; //Input String
        System.out.println("Input line: "+line);

        Equally equallycheck = new Equally(); // Подключяем проверку на =

        TaskManager mid = new TaskManager(line); // Подключаем менеджер задач

        try {
            if (equallycheck.equally(line)){ // если !=
                mid.requiredOperations(); // менеджер операций
            } else { // если =
                System.out.println("=");
            }
        }catch (NumberFormatException e) {
        }
    }
}
