package by.it.chetovich.JD01_06String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * JD01_06 String
 */
public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        StringBuilder textB = new StringBuilder(text);

        //TaskA1
        //TaskA1String taskA1 = new TaskA1String();
        //taskA1.changeLiterals(textB);

        //TaskA2
        //TaskA2String taskA2 = new TaskA2String();
        //taskA2.CalculateWords(textB);

        //Task A3
        //TaskA3String taskA3 = new TaskA3String();
        //taskA3.calcWordsWithConsonant(textB);

        //Task B1
        //TaskB1String taskB1 = new TaskB1String();
        //taskB1.deleteWordsStartConsonant(textB);

        //Task B2
        //TaskB2String taskB2 = new TaskB2String();
        //taskB2.sortTextBySentences(textB);

        TaskB3String taskB3 = new TaskB3String();
        taskB3.sortWordsByLetter(textB, "ì");


    }
}
