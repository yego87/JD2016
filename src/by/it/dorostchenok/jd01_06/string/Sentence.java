package by.it.dorostchenok.jd01_06.string;

public class Sentence implements Comparable<Sentence>{

    private String sentence;

    private int length = 0;

    public int getLength() {
        return length;
    }

    public Sentence(String str){
        this.sentence = str;
        this.length = sentence.split(" ").length;
    }

    @Override
    public int compareTo(Sentence o) {
        return Integer.compare(this.length, o.getLength());
    }

    @Override
    public String toString(){
        return this.sentence;
    }
}
