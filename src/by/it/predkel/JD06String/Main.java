package by.it.predkel.JD06String;


import by.it.predkel.JD06String.LevelA.Insert5th7thLetter;
import by.it.predkel.JD06String.LevelA.SameWords;
import by.it.predkel.JD06String.LevelA.VowelsBeginEnd;
import by.it.predkel.JD06String.LevelB.Consonant5Len;
import by.it.predkel.JD06String.LevelB.SortSentences;
import by.it.predkel.JD06String.LevelB.SortWords;
import by.it.predkel.JD06String.LevelC.FormatSentence;
import by.it.predkel.JD06String.LevelC.MillionRandSymbols;
import by.it.predkel.JD06String.LevelC.UltimateSortWords;

/**
 * Вывести все слова длины 5 начинающиеся на согласную букву
 */
public class Main {
    public static void main(String[] args) {
        String sentence="Почти ни один человек неюю думает о смерти, пока она не подошла вплотную к нему вплотную.";
        String fraze="Почти ни один человек неюю думает о смерти, пока она не подошла вплотную к нему вплотную." +
                "Трагизм и вместе с тем ирония заключается в том, что все люди на земле, начиная от диктатора и кончая последним нищим, " +
               "ведут себя так, будто они будут жить вечно. " +
              "Если бы мы постоянно жили с сознанием неизбежности смерти, мы были бы более человечными и милосердными.";
        String changed= Insert5th7thLetter.insert5th7thLetter(fraze);
        System.out.print(changed);
        SameWords.sameWords(sentence);
        VowelsBeginEnd.vowelsBeginEnd(fraze);
        Consonant5Len.сonsonant5Len(fraze);
        SortSentences.sentences(fraze);
        SortWords.sortWords(sentence,'ю');
        UltimateSortWords.Sortinglenght(sentence);
        String[] s=MillionRandSymbols.findMass(sentence);
        int max=MillionRandSymbols.findMax(s);
        long time=MillionRandSymbols.printWords(s,max)-MillionRandSymbols.printWordsB(s,max);
        System.out.println("Разница во времени:"+time);
        FormatSentence.formatSentence(fraze);
    }


}
