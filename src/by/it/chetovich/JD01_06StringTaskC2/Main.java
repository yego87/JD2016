package by.it.chetovich.JD01_06StringTaskC2;

import java.io.IOException;
import java.util.Random;

/**
 *@author Yultos_
 * creates a line using String and StringBuilder and calculates the time for processing each option
 */
public class Main {
    public static void main(String[] args) throws IOException {

        String text = "У лукоморья дуб зелёный.\nЗлатая цепь на дубе том:\nИ днём и ночью кот учёный\nВсё ходит по цепи кругом.\nИдёт направо - песнь заводит,\nНалево - сказку говорит.";

        StringBuilder textB = new StringBuilder(text);
        String[] array = C2TextToWordsArray.createWordsArrayFromText(textB); //sozdaem massiv iz slov v texte
        Random rand = new Random();
        int lastWordLength = rand.nextInt(8) + 1; //randomno opredelaem dlinu dla poslednego slova ot 1 do 8
        System.out.println("The last word length is " + lastWordLength);
        long timeString = C2CodingTime.calculateStringCodeTime(array, lastWordLength); //s4itaem vremya raboti programmi dya String
        System.out.println("Time to create a String line is " + timeString + "ms");
        long timeSB = C2CodingTime.calculateSBCodeTime(array, lastWordLength);// to zhe samoe dla StringBuilder
        System.out.println("Time to create a StringBuilder line is " + timeSB + "ms");
        System.out.println("The advantage of using StringBuilder instead of String is " + (timeString - timeSB) + "ms");
    }
}
