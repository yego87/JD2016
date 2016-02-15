package by.it.dorostchenok.jd01_06.string;

public class Word {

    private String word;
    int matchesCount = 0;


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
