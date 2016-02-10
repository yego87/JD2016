package by.it.novik.JD01_work;

public class work10 {
    public static void main(String[] args) {
        int num = 7;
        boolean isSimple = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isSimple = false;
                break;
            }
        }

        if (isSimple) {
            System.out.println("Is a simple number!");
        } else {
            System.out.println("Not a simple number!");
        }



    }
}
