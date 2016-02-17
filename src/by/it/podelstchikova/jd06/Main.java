package by.it.podelstchikova.jd06;


import by.it.podelstchikova.jd06.TaskA.Task1;
import by.it.podelstchikova.jd06.TaskA.Task2;
import by.it.podelstchikova.jd06.TaskA.Task3;
import by.it.podelstchikova.jd06.TaskB.Task1B;
import by.it.podelstchikova.jd06.TaskB.Task2B;
import by.it.podelstchikova.jd06.TaskB.Task3B;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {   String str="У лукоморья дуб зелёный.\n" +
            "Златая цепь на дубе том:\n" +
            "И днём и ночью кот учёный\n" +
            "Всё ходит по цепи кругом.\n" +
            "Идёт направо - песнь заводит,\n" +
            "Налево - сказку говорит.\n" +
            "Там чудеса: там леший бродит,\n" +
            "Русалка на ветвях сидит.\n" +
            "Там на неведомых дорожках\n" +
            "Следы невиданных зверей.\n" +
            "Избушка там на курьих ножках\n" +
            "Стоит без окон, без дверей.\n" +
            "Там лес и дол видений полны.\n" +
            "Там о заре прихлынут волны\n" +
            "На брег песчаный и пустой,\n" +
            "И тридцать витязей прекрасных\n" +
            "Чредой из вод выходят ясных,\n" +
            "И с ними дядька их морской.\n" +
            "Там королевич мимоходом\n" +
            "Пленяет грозного царя.\n" +
            "Там в облаках перед народом\n" +
            "Через леса, через моря\n" +
            "Колдун несёт богатыря.\n" +
            "В темнице там царевна тужит,\n" +
            "А бурый волк ей верно служит.\n" +
            "Там ступа с Бабою Ягой\n" +
            "Идёт, бредёт сама собой,\n" +
            "Там царь Кащей над златом чахнет.\n" +
            "Там русский дух... там Русью пахнет!\n" +
            "И там я был, и мёд я пил.\n" +
            "У моря видел дуб зелёный.\n" +
            "Под ним сидел, и кот учёный\n" +
            "Свои мне сказки говорил.";
        Task1.printStr(str);
        StringBuffer st = new StringBuffer(str);
        Task2.valueCount(str);
        Task3.print(str);
         Task1B.print(str);
        StringBuffer stringBuffer= new StringBuffer(str);
        stringBuffer=  Task2B.deleteWr(stringBuffer);
        String[] arrayString= Task2B.createArrayString(stringBuffer);
        arrayString=Task2B.sortArrayString(arrayString);
        for (String val:arrayString) { System.out.println(val);}

        char ch =  Task3B.readLitteral();
        arrayString = Task3B.createArrayWord(str);
        arrayString = Task3B.sortLines(arrayString, ch);
        for (String string: arrayString)
            System.out.println(string);
    }
}
