package by.it.Baranova.JD01_06_String;

/**
 * Created by Ekaterina on 2/12/16.
 */
public class Main {

    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("У лукоморья дуб зеленый;\n"+
                                            "Златая цепь на дубе том:\n"+
                                            "И днем и ночью кот ученый\n"+
                                            "Все ходит по цепи кругом;\n"+
                                            "Идет направо - песнь заводит,\n"+
                                            "Налево - сказку говорит.\n"+
                                            "Там чудеса: там леший бродит,\n"+
                                            "Русалка на ветвях сидит;\n"+
                                            "Там на неведомых дорожках\n"+
                                            "Следы невиданных зверей;\n"+
                                            "Избушка там на курьих ножках\n"+
                                            "Стоит без окон, без дверей;\n"+
                                            "Там лес и дол видений полны;\n"+
                                            "Там о заре прихлынут волны\n"+
                                            "На брег песчаный и пустой,\n"+
                                            "И тридцать витязей прекрасных\n"+
                                            "Чредой из вод выходят ясных,\n"+
                                            "И с ними дядька их морской;\n"+
                                            "Там королевич мимоходом\n"+
                                            "Пленяет грозного царя;\n"+
                                            "Там в облаках перед народом\n"+
                                            "Через леса, через моря\n"+
                                            "Колдун несет богатыря;\n"+
                                            "В темнице там царевна тужит,\n" +
                                            "А бурый волк ей верно служит;\n"+
                                            "Там ступа с Бабою Ягой\n"+
                                            "Идёт, бредёт сама собой,\n"+
                                            "Там царь Кащей над златом чахнет;\n"+
                                            "Там русский дух, там Русью пахнет!\n"+
                                            "И там я был, и мед я пил;\n"+
                                            "У моря видел дуб зеленый;\n"+
                                            "Под ним сидел, и кот ученый\n"+
                                            "Свои мне сказки говорил."
                                            );
        String b=new String(sb);
        StringFormate stringFormate = new StringFormate();
        SortWordsBySymbol sortWordsBySymbol=new SortWordsBySymbol();
             //TASK A
        StringBuffer sbnew=StringFormate.ReplaceCharAt(b);
        System.out.println(sbnew);
        String poetry[]=StringFormate.StringToArray(b);
        StringFormate.WordsQuantity(poetry);
        int vowelKol=StringFormate.VowelQuantity(b);
        System.out.println("Количество слов начинающихся и заканчивающихся на гласную "+vowelKol);
            //TASK B
        System.out.println("Удалены слова из 5 букв, начинающиеся на согласную");
        String sb_removedwords=StringFormate.DeleteFiveLetters(b);
        System.out.println(sb_removedwords);
        System.out.println("Отсортированные предложения");
        StringFormate.SortSentences(b);
        SortWordsBySymbol.WordsMatrix(poetry,'о');

            //TASK C
        String [] lineArray=WidthFormate.StringLinesToArray(b);
        StringBuilder [] formateLineArray=WidthFormate.FormateLineArray(lineArray);
        long timeTocomplete=MillionWordLine.CreateMillionLine(poetry);
        long timeTocomplete_sb=MillionWordLine.CreateMillionLineSB(poetry);
        System.out.println("Время работы кода со String="+timeTocomplete);
        System.out.println("Время работы кода со StringBuilder="+timeTocomplete_sb);
        System.out.println("Выигрыш в скорости="+(timeTocomplete-timeTocomplete_sb));
        String sortedWords[]=SortWords.WordsToArrayID(poetry);
        sortedWords=SortWords.WordsArraySortbyLength(sortedWords);
        sortedWords=SortWords.WordsArraySortByVowel(sortedWords,poetry);
    }
}

