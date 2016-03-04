package by.it.veselov.JD01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by yegorveselov on 01.03.16.
 */
public class String_B_1 {
    public static void main(String [] args){
        StringBuilder sb=new StringBuilder (
                "У лукоморья дуб зеленый;\n"+
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
                        "Свои мне сказки говорил.");
        String regex="\\b[цкнгшщзхфвпрлджбтмсчЦКНГШЩЗХЖДЛРПВФЧСМТБ]{1}[a-я]{4}\\b";
        Pattern p = Pattern.compile(regex);

        int k=0;

        Matcher m = p.matcher(sb);
        StringBuilder stringBuffer = new StringBuilder(sb);

        while (m.find()) {

            k++;

        }
        int [] start = new int[k];
        int l=0;
        m = p.matcher(sb);
        while (m.find()) {

            start[l]=m.start();
            l++;
        }
        for (int i = 0; i < start.length; i++) {
            stringBuffer.delete(start[i] - i*5,start[i] - i*5 + 5);

        }

        System.out.println(stringBuffer.toString());
    }}
