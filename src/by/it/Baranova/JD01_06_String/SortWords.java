package by.it.Baranova.JD01_06_String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ekaterina on 2/16/16.
 */
public class SortWords {

    /**
     * Создание массива с неповторяющимися словами
     * @param poetry
     * @return
     */
    public static String [] WordsToArrayID (String [] poetry){
        int n=poetry.length;
        String [] wordsnew=new String[n];
        for (int i=0;i<n;i++){
            wordsnew[i]=poetry[i];
        }

        String regex="[А-Яа-я]{1,}";
        Pattern p1=Pattern.compile(regex);
        for (int i=0;i<n;i++) {
            Matcher m1=p1.matcher(wordsnew[i]);
            boolean b=m1.matches();
            for (int j = i + 1; j < n; j++) {
                if (wordsnew[i].equalsIgnoreCase(wordsnew[j])==true&&b==true){
                    wordsnew[j]="#";
                }
            }
        }

        int kol=0;
        for (int i = 0; i <n ; i++) {
            Matcher m1=p1.matcher(wordsnew[i]);
            boolean b=m1.matches();
            if (wordsnew[i].contains("#") == false&&b==true) {
                kol++;
            }
        }
        String [] idWords=new String[kol];
        int j=0;
        for (int i=0;i<n;i++) {
            Matcher m1=p1.matcher(wordsnew[i]);
            boolean b=m1.matches();
            if (b==true){
                idWords[j]=wordsnew[i];
                idWords[j]=idWords[j].toLowerCase();
                j++;
            }
        }


        return idWords;
}


    /**
     * Сортировка массива слов по убыванию их длин
     * @param poetry
     * @return
     */
    public static String[] WordsArraySortbyLength (String [] poetry){
        int n=poetry.length;
        String [] wordsnew=new String[n];
        for (int i=0;i<n;i++){
            wordsnew[i]=poetry[i];
        }

        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                int ilength=wordsnew[i].length();
                int jlength=wordsnew[j].length();
                if (ilength<jlength) {
                    String x=wordsnew[i];
                    wordsnew[i]=wordsnew[j];
                    wordsnew[j]=x;
                }
            }
        }

        return wordsnew;
    }


    /**
     * Сортировка по количеству гласных букв отсортированного по длине массива
     * @param sortedWords
     * @param poetry
     * @return
     */
    public static String[] WordsArraySortByVowel (String [] sortedWords,String[] poetry){
        int n=sortedWords.length;
        String [] wordsnew=new String[n+1];
        for (int i=0;i<n;i++){
            wordsnew[i]=sortedWords[i];
        }
        for (int i=0;i<n;i++){
            wordsnew[i]=wordsnew[i].toLowerCase();
        }
        int [] vowelQuantity=new int[n+1];
        String regex="[аоеиуыэюя]";
        for (int i=0;i<n;i++){
            Pattern p1=Pattern.compile(regex);
            Matcher m1=p1.matcher(wordsnew[i]);
            int kol=0;
            while (m1.find()){kol++;}
            vowelQuantity[i]=kol;
        }
        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++)
            if (wordsnew[i].length()==wordsnew[j].length()){
                if (vowelQuantity[i]<vowelQuantity[j]){
                    int extra=vowelQuantity[i];
                    vowelQuantity[i]=vowelQuantity[j];
                    vowelQuantity[j]=extra;
                    String extraS=wordsnew[i];
                    wordsnew[i]=wordsnew[j];
                    wordsnew[j]=extraS;
                }
            }
        }
        System.out.println("Слова, отсортированные по длине, а потом по количеству гласных в слове");
        for (int i=0;i<wordsnew.length;i++){
            int kol=SortWords.ReturnQuantity(wordsnew[i],poetry);
            if (kol==1) {
                System.out.println(wordsnew[i]);
            }
            else {
                if (wordsnew[i]!=null) {
                    System.out.println(wordsnew[i] + " встречается " + kol + " раз(a)");
                }
            }
        }
        return wordsnew;
    }

    /**
     * Определение количества повторений слова в тексте
     * @param word проверяемое слово
     * @param poetry массив слов
     * @return
     */
    public static int ReturnQuantity (String word, String [] poetry){
        int n=poetry.length;
        String [] wordsnew=new String[n];
        for (int i=0;i<n;i++){
            wordsnew[i]=poetry[i];
        }
        int kol=0;
        String regex="[А-Яа-яё]{1,}";
        Pattern p1=Pattern.compile(regex);
        for (int i=0;i<n;i++) {
            Matcher m1 = p1.matcher(wordsnew[i]);
            boolean b = m1.matches();
            if (wordsnew[i].equalsIgnoreCase(word) == true && b == true) {
                    kol++;
                }
            }

        return kol;
    }
}
