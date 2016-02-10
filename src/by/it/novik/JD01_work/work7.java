package by.it.novik.JD01_work;

public class work7 {
    public static void main(String[] args) {
        int d = 31;
        int m = 12;
        int y = 2011;

        int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (d < months[m - 1]) {
            d++;
        } else {
            if (m < 12) {
                if (m == 2 && isBissextile(y)) {
                    d++;
                } else {
                    m++;
                    d = 1;
                }
            } else {
                y++;
                m = 1;
                d = 1;
            }
        }

        System.out.println("Day: " + d + " Month: " + m + " Year: " + y);
    }

    public static boolean isBissextile(int y) {
        return y % 4 == 0;
    }

}


