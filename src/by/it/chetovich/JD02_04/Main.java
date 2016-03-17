package by.it.chetovich.JD02_04;

import java.util.List;

/**
 * Main hexadecimal number
 */
public class Main {

    public static void main(String[] args) {

        String s = Utils.enterLine();
        List<String> list = Utils.findHexadecimal(s);
        if (!list.isEmpty())
            Utils.printHexadecimal(list);
        else
            System.out.println("В строке не найдено шестнадцатиричных чисел. ");
    }

}
