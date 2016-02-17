package by.it.chetovich.JD01_06StringTaskC2;

import java.util.Random;

/**
 * @author Yultos_
 * returns a random word of predefined length from the array
 */
public class C2ChoosingWordByLength {
    /**
     *
     * @param array array containing words from the text
     * @param length the length of the last word, that was defined using random
     * @return a random word which length is equal to param length
     */
    static String wordByLength (String [] array, int length){
        Random rand = new Random();
        while (true){
            String word = array[rand.nextInt(array.length)];
            if (word.length()== length) return word;
        }
    }
}
