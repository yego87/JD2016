package by.it.chetovich.JD01_06String;

import java.io.IOException;
import java.util.Random;

/**
 * JD01_06 String
 */
public class Main {
    public static void main (String [] args) throws IOException {
        String text = "У лукоморья дуб зелёный.\nЗлатая цепь на дубе том:\nИ днём и ночью кот учёный\nВсё ходит по цепи кругом.\nИдёт направо - песнь заводит,\nНалево - сказку говорит.";
        StringBuilder textB = new StringBuilder(text);
        String s = "Я больше не могу. У лукоморья дуб? Мы знакомы - много лет. Сколько можно: это должно прекратиться! Мама!";


        //TaskA1
        //A1ChangingLetters taskA1 = new A1ChangingLetters();
        //taskA1.changeLiterals(textB);

        //TaskA2
        //A2CountingWords taskA2 = new A2CountingWords();
        //taskA2.CalculateWords(textB);

        //Task A3
        //A3ConsonantWords taskA3 = new A3ConsonantWords();
        //taskA3.calcWordsWithConsonant(textB);

        //Task B1
        //B1DeletingConsonantWords taskB1 = new B1DeletingConsonantWords();
        //taskB1.deleteWordsStartConsonant(textB);

        //Task B2
        B2SortingSentences.sortTextBySentences(s);

        //Task B3
        //B3SortingWords taskB3 = new B3SortingWords();
        //taskB3.sortWordsByLetter(textB, "м");

        //Task C1
        //C1BothSidesFormat taskC1 = new C1BothSidesFormat();
        //taskC1.formatText(textB);

        //Task C2


        //Task C3



    }
}
