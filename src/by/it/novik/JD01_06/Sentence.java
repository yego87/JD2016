package by.it.novik.JD01_06;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sentence implements Comparable {
    public String text;
    public int wordsCount;

    public Sentence(String text) {
        this.text = text;
        this.wordsCount = getWordsCount(this.text);
    }

    public int compareTo(Object obj) {
        Sentence tmp = (Sentence)obj;

        if (this.wordsCount < tmp.wordsCount) {
            return -1;
        } else if (this.wordsCount > tmp.wordsCount) {
            return 1;
        }

        return 0;
    }

    private int getWordsCount(String text) {
        return text.split(" ").length;

        /*String[] b = text.split(" ");
        int count = 0;

        Pattern p = Pattern.compile("(\\b(\\w+)\\b)");

        for (String word : b) {
            Matcher matcher = p.matcher(word);

            if (matcher.find()) {
                count++;
            }
        }

        return count;*/

    }
}
