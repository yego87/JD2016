package by.it.solonovich.JD01_work;

/**
 * Created by Кирилл on 10.02.2016.
 */
public class Zadanie10 {
    public static void main(String[] args) {
        int n = 5;
        int i;
        boolean isComposite = false;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                isComposite = true;
                break;
            }
        }
        if (isComposite) {
            System.out.println("число составное ");
        } else {
            System.out.println("число  простое ");
        }
    }
}








