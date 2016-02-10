package by.it.novik.JD01_02;


public class A2 {

    public static int averageLength(String[] m) {

        int average = 0;

        if (m.length > 0) {

            int sum = 0;

            for (int i = 0; i < m.length; i++) {
                sum = sum + m[i].length();
            }
            average = sum / m.length;
        }
        return average;
    }
}
