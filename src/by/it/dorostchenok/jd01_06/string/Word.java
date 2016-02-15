package by.it.dorostchenok.jd01_06.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Word {

    private String word;
    private int matchesCount = 0;
    private String matchesPattern = "";

    public int getMatchesCount() {
        return matchesCount;
    }

    public String getMatchesPattern() {
        return matchesPattern;
    }

    public void setMatchesPattern(String matchesPattern) {
        this.matchesCount = 0;
        Pattern pattern = Pattern.compile(matchesPattern);
        Matcher matcher = pattern.matcher(this.word);
        while (matcher.find()){
            this.matchesCount++;
        }
        this.matchesPattern = matchesPattern;
    }

    public Word(String word){
        this.word = word;
    }

    @Override
    public String toString(){
        return word;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Word word1 = (Word) o;

        return word != null ? word.equals(word1.word) : word1.word == null;

    }

    @Override
    public int hashCode() {

        return word != null ? word.hashCode() : 0;
    }
}
