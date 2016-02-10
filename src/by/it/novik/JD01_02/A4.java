package by.it.novik.JD01_02;


public class A4 {

    public static boolean checkNum(String d) {
        char[] l = d.toCharArray();

        boolean g = false;
        for (int i = 0, j = l.length - 1; (i < j); i++, j--) {
            if (l[i] != l[j]) {
                return false;
            }
        }
        return true;
    }
}

