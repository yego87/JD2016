package by.it.chetovich.JD01_02_04;

/**
 * Created by user_2 on 03.02.2016.
 */
public class A3DifferentNumbers {
    public void differentNums(String[] array) {
        System.out.print("Numbers with different digits are ");
        for (String s : array) {
            if (check(s) == false) System.out.print(s+" ");
            ;
        }

    }

    private boolean check(String s) {
        char[] arrChar = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (arrChar[i] == arrChar[j]) return true;
            }
        }
        return false;
    }
}



