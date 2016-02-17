package by.it.chetovich.JD01_06StringTaskC2;

import by.it.chetovich.JD01_06StringTaskC2.C2ChoosingWordByLength;

import java.util.Random;

/**
 * @author Yultos_
 * creates a String line containing random words, the last of them has predefined length
 */
public class C2CreatingRandomStringLine {
    /**
     *
     * @param array array containing words from the text
     * @param lastWordLength the length of the last word, that was defined using random
     */
    static void createRandomStringLine (String[] array, int lastWordLength){

        Random rand = new Random();
        String line = "";
        for (int i = 0; i < 999; i++) { //delaem stroku pomen6e, million slov sli6kom dolgo zhadat))
            line += array[rand.nextInt(array.length)] +" ";
        }
        line += C2ChoosingWordByLength.wordByLength(array, lastWordLength);
        System.out.println(line);
    }


}
