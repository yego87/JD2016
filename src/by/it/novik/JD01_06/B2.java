package by.it.novik.JD01_06;

import java.util.Arrays;

public class B2 {
    public static void main(String[] args) {
        String[] text = TextA.example.split("[.!?]");
        Sentence[] sentences = new Sentence[text.length];

        for (int i = 0; i < text.length; i++) {
            sentences[i] = new Sentence(text[i]);
        }

        Arrays.sort(sentences);

        for (int i = 0; i < sentences.length; i++) {
            System.out.println("Quantity is: " + sentences[i].wordsCount);
            System.out.println(sentences[i].text);
        }
    }
}

