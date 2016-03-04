package by.it.daylidovich.JD01_13.A;

import static by.it.daylidovich.JD01_13.A.Utils.*;

public class Main {
    public static void main(String[] args) {
        String st = "";
        while (!st.equals("end")){
            System.out.println("Введите число или \"end\" для выхода.");
            st = readNumber();
            try {
                if (!st.equals("end")) {
                    int x = parseNumber(st);
                    System.out.println("Вы ввели " + x);
                    System.out.printf("Сумма корней всех введенных чисел %5.2f\n", sumRadical(x));
                }
            }
            catch (NumberFormatException e){
                System.out.println("Некоректный ввод.");
            }
            catch(ArithmeticException e)
            {
                System.out.println("Невозможно извлечь корень.");
            }
        }
    }
}
