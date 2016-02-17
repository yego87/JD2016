package by.it.chetovich.JD01_06StringTaskC3;
import by.it.chetovich.JD01_06StringTaskC2.*;

/**
 * @author Yultos_
 */
public class Main {
    public static void main (String [] args){
        String text = "У сказку лукоморья дуб зелёный.\nЗлатая цепь на дубе том:\nИ днём и дуб ночью кот учёный\nВсё ходит по цепи кругом.\nИдёт направо - песнь заводит,\nНалево сказку - сказку говорит.";
        StringBuilder textB = new StringBuilder(text);
        String[] array = C2TextToWordsArray.createWordsArrayFromText(textB); //sozdaem massiv iz slov v texte
        array = SortWordsByLength.sortWordsByLength(array);
        array = SortByVowelsQuantity.sortByVowelsQuantity(array);
        array = AlphabeticSortIfEqualVowels.alphabeticSort(array);
        System.out.println(FinalSortWithGroupingEqualWords.groupEqualWords(array));



    }
}

