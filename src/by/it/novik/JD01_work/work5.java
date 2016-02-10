package by.it.novik.JD01_work;

public class work5 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int r = 2;

        int d = (int)(Math.sqrt(a*a + b*b));

        if (r>=d/2) {
            System.out.println("Yes");
        }
        else {
            System.out.println("Nope");
        }
    }
}
