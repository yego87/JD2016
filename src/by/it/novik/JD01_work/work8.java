package by.it.novik.JD01_work;

public class work8 {
    public static void main(String[] args) {
        long product = 1;
        int count = 10;

        while (count-- != 0) {
            product *= ((long)(Math.random() * 5)) + 1;
        }

        System.out.println("Product is " + product);
    }
}
