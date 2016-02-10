package by.it.novik.JD01_02;


public class B1 {
    public static void main(String[] args) {
        int[] range = {100, 200};
        int k = 199;

        System.out.println("     k : " + k);
        System.out.println("[n, m] : [" + range[0] + ", " + range[1] + "]");
        System.out.println("");

        if (isInRange(k, range)) {
            System.out.println("'k' is in range");
        } else {
            System.out.println("'k' is not in range");
        }
    }

    public static boolean isInRange(int num, int[] range) {
        if (num >= range[0] && num <= range[1]) {
            return true;
        } else {
            return false;
        }
    }
}
