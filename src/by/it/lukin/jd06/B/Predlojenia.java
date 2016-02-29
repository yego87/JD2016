package by.it.lukin.jd06.B;

/**
 * Created by алексей on 21.02.2016.
 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Predlojenia implements Comparable<Predlojenia> {
    public static final String SENTENCE_ENDS = ".!?;";
    public static final String WORD_DELIMITERS = " \t\n\\,-_+*/@%#";

    private String text;
    private int words;

    public Predlojenia(String t) {
        text = t;
        words = ( t.split("[" + WORD_DELIMITERS + SENTENCE_ENDS + "]") ).length;
    }

    @Override
    public String toString() {
        return text;
    }

    @Override
    public int compareTo(Predlojenia another) {
        return another.words - words;
    }

    public static Predlojenia[] toSentencesArray(String input) {
        StringBuilder buf = new StringBuilder();
        List<Predlojenia> list = new LinkedList<Predlojenia>();

        for ( char c : input.toCharArray() ) {
            if ( c == '\n' )
                c = ' ';
            buf.append(c);
            if ( SENTENCE_ENDS.indexOf(c) > -1 ) {
                list.add(new Predlojenia(buf.toString().trim()));
                buf = new StringBuilder();
            }
        }

        return list.toArray(new Predlojenia[list.size()]);
    }

    public static void main(String[] args) {
        String text = "У лукоморья дуб зелёный;\n" +
                "Златая цепь на дубе том:\n" +
                "И днём и ночью кот учёный\n" +
                "Всё ходит по цепи кругом;\n" +
                "Идёт направо - песнь заводит,\n" +
                "Налево - сказку говорит.\n" +
                "Там чудеса: там леший бродит,\n" +
                "Русалка на ветвях сидит;\n" +
                "Там на неведомых дорожках\n" +
                "Следы невиданных зверей;\n" +
                "Избушка там на курьих ножках\n" +
                "Стоит без окон, без дверей;\n" +
                "Там лес и дол видений полны;\n" +
                "Там о заре прихлынут волны\n" +
                "На брег песчаный и пустой,\n" +
                "И тридцать витязей прекрасных\n" +
                "Чредой из вод выходят ясных,\n" +
                "И с ними дядька их морской;\n" +
                "Там королевич мимоходом\n" +
                "Пленяет грозного царя;\n" +
                "Там в облаках перед народом\n" +
                "Через леса, через моря\n" +
                "Колдун несёт богатыря;\n" +
                "В темнице там царевна тужит,\n" +
                "А бурый волк ей верно служит;\n" +
                "Там ступа с Бабою Ягой\n" +
                "Идёт, бредёт сама собой,\n" +
                "Там царь Кащей над златом чахнет;\n" +
                "Там русский дух... там Русью пахнет!\n" +
                "И там я был, и мёд я пил;\n" +
                "У моря видел дуб зелёный;\n" +
                "Под ним сидел, и кот учёный\n" +
                "Свои мне сказки говорил.";

        System.out.println("Unsorted:\n" + text);

        Predlojenia[] sentences = Predlojenia.toSentencesArray(text);
        Arrays.sort(sentences);
        System.out.println("Sorted:");
        for ( Predlojenia s : sentences )
            System.out.println(s);
    }
}
