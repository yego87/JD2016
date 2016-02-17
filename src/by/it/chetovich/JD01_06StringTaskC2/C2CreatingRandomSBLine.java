package by.it.chetovich.JD01_06StringTaskC2;

import by.it.chetovich.JD01_06StringTaskC2.C2ChoosingWordByLength;

import java.util.Random;

/**
 * @author Yultos_
 * Created creates a StringBuilder line containing random words, the last of them has predefined length
 */
public class C2CreatingRandomSBLine {
    /**
     *
     * @param array array containing words from the text
     * @param lastWordLength the length of the last word, that was defined using random
     */
    static void createRandomSBLine (String[] array, int lastWordLength){

        Random rand = new Random();
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < 999; i++) { //delaem stroku pomen6e, million sli6kom dolgo zhadat))
            String word = array[rand.nextInt(array.length)];
            line.append(word);
            line.append(" ");
        }
        line.append(C2ChoosingWordByLength.wordByLength(array, lastWordLength));
        //System.out.println(line);

    }
}
