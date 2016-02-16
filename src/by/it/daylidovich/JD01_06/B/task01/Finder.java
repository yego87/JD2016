package by.it.daylidovich.JD01_06.B.task01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Finder {
    public static void editText(StringBuilder stIn){
        Pattern pattern = Pattern.compile("\\b[ЙЦКНГШЩЗХЪФВПРЛДЖЧСМТЬБйцкнгшщзхъфвпрлджчсмтьб][А-яёЁ]{4}\\b");
        Matcher matcher = pattern.matcher(stIn);
        int[] arrayStart = new int[100];
        int n = 0;
        while (matcher.find()){
            arrayStart[n] = matcher.start();
            n++;
        }
        for (int i = 0; i < n; i++) {
            stIn.delete(arrayStart[i] - i*5,arrayStart[i] - i*5 + 5 );
        }
        System.out.println(stIn);
    }
}
