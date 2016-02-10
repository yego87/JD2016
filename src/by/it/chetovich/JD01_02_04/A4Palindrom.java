package by.it.chetovich.JD01_02_04;

/**
 * Created by user_2 on 03.02.2016.
 */
public class A4Palindrom {
    public void palindrom(String[] array) {
        System.out.print("Palindrom numbers are ");
        for (String s : array) {
            if (check(s) == true) System.out.print(s+" ");
        }
    }


    private boolean check(String s) {
        char[] arrChar = s.toCharArray();
        for (int i = 0; i < arrChar.length / 2; i++) {
            if (arrChar[i] != arrChar[arrChar.length - 1 - i]) return false;
        }
        return true;
    }
}
