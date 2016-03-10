package by.it.veselov.JD01_12;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.lang.NumberFormatException;

/**
 * Created by yegorveselov on 10.03.16.
 */
public class A_3 {

        public static void main(String[] args) {
            ArrayList<Integer> arrlst = new ArrayList<Integer>();
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);

            System.out
                    .println("Введите комбинацию ЧИСЕЛ от -бесконечности до +бесконечности:");
            String[] line = sc.nextLine().split(" ");
            int i = 0;
            try {
                for (i = 0; i < line.length; ++i)
                    arrlst.add(Integer.parseInt(line[i]));
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат данных: " + line[i]);
                return;
            }
            System.out.println("Исходный массив: " + arrlst);
            Collections.sort(arrlst, Collections.reverseOrder());

            System.out.println("Результат: " + arrlst);
        }
    }

