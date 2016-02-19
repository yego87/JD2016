package by.it.knyazev.Less_6.B3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Artsem Kniazeu on 17.02.2016.
 */
public class Main {
    public static void main(String[] args) {

        //System.out.println("Введите текст>");
        //String line = new Scanner(System.in).nextLine();
        String line = "У лукоморья дуб срубили Кота на мясо зарубили Цепи с ветвей сорвали Русалку в шпроты посадили И наступила красота";
        String z = "м";
        sort(line,z);
        Pattern f = Pattern.compile("[^a-zA-Z_а-яА-ЯёЁ]+");
        String [] array = f.split(line);
        System.out.println("Исходный текст: " + Arrays.toString(array));

        for (String i:array) {
            for (int j = 0; j < array.length-1; j++) {
                if (sort(array[j],z)<sort(array[j+1],z)){
                    String k = array[j];
                    array[j] = array [j+1];
                    array[j+1] = k;
                }
            }
        }
        System.out.println("По букве '"+z.toUpperCase()+"' "+Arrays.toString(array));
        String[] words = line.split("\\s+");
        Arrays.sort(words);
        System.out.println("По алфавиту: " + Arrays.toString(words));
    }
    public static int sort(String f,String z){
        int i = 0;
        Pattern symbol = Pattern.compile(z);
        Matcher s = symbol.matcher(f);
        while (s.find()){
            i++;
        }
        return i;
    }

}
