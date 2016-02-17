package by.it.chetovich.JD01_06StringTaskC2;

/**
 * @author Yultos_
 * calculates program time
 */
public class C2CodingTime {
    /**
     *
     * @param array array containing words from the text
     * @param length the length of the last word, that was defined using random
     * @return processing time in ms if we use String
     */
    static long calculateStringCodeTime (String[] array, int length){

        long begin = System.currentTimeMillis();
        C2CreatingRandomStringLine.createRandomStringLine(array, length);
        long end = System.currentTimeMillis();
        return end - begin;
    }

    /**
     *
     * @param array array containing words from the text
     * @param length the length of the last word, that was defined using random
     * @return processing time in ms if we use StringBuilder
     */
    static long calculateSBCodeTime (String[] array, int length){

        long begin = System.currentTimeMillis();
        C2CreatingRandomSBLine.createRandomSBLine(array, length);
        long end = System.currentTimeMillis();
        return end - begin;
    }
}
