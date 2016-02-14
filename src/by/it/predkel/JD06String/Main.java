package by.it.predkel.JD06String;


import by.it.predkel.JD06String.LevelA.SameWords;
import by.it.predkel.JD06String.LevelB.Consonant5Len;
import by.it.predkel.JD06String.LevelB.Sentences;
import by.it.predkel.JD06String.LevelB.SortWords;

/**
 * Created by user_2 on 12.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        String fraze="Почти ни один человек неюю думает о смерти, пока она не подошла к нему вплотную." ;
            //    "Трагизм и вместе с тем ирония заключается в том, что все люди на земле, начиная от диктатора и кончая последним нищим, " +
             //   "ведут себя так, будто они будут жить вечно. " +
             //   "Если бы мы постоянно жили с сознанием неизбежности смерти, мы были бы более человечными и милосердными.";
        //  String changed= insert5th7thLetter(fraze);
       // System.out.print(changed);
       //SameWords.sameWords(fraze);
       // VowelsBeginEnd.vowelsBeginEnd(fraze);
       // Consonant5Len.сonsonant5Len(fraze);
        //Sentences.sentences(fraze);
        SortWords.sortWords(fraze,'ю');
    }


}
