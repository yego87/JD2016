package by.it.telushko.jd01_06;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class
        TaskA {
    public static void taskA1(String text){
        StringBuilder sbText=new StringBuilder(text);
        Pattern word= Pattern.compile("[а-яА-ЯёЁ]{5,}");
        Matcher okWord=word.matcher(sbText);
        while(okWord.find()){
            sbText.setCharAt(okWord.start()+4,'#');
            if ( (okWord.end()-okWord.start() )>=7)
            sbText.setCharAt(okWord.start()+6,'#');
        }
         System.out.println(sbText+" \n");
    }
    public static void taskA2(String text){

        StringBuilder sbText=new StringBuilder(text);
        Pattern word= Pattern.compile("[а-яА-ЯёЁ]+");
        Matcher okWord=word.matcher(sbText);
        while(okWord.find()){
            int counter=0;
            Matcher okWordTemp=word.matcher(sbText);
            while (okWordTemp.find()){
                    if (0==(sbText.substring(okWord.start(), okWord.end())
                            .compareToIgnoreCase(sbText.substring(okWordTemp.start(),okWordTemp.end()))))
                        counter++;
            }
           System.out.println("Слово \""+sbText.substring(okWord.start(),okWord.end())+
                              "\" встречается "+counter+" раз.");
        }
        System.out.println("");
    }
    public static void taskA3(String text){
        StringBuilder sbText=new StringBuilder(text);
        Pattern word= Pattern.compile("[а-яА-ЯёЁ]+");
        Matcher okWord=word.matcher(sbText);
        char[] letters ={'е','у','э','о','а','ы','я','и','ю','Я','И','Ю','Э','О','А','Ы','У','Е','Ё','ё'};
        int count=0;
        boolean startflag,endflag;
        while(okWord.find()) {
            char start = sbText.charAt(okWord.start());
            char end = sbText.charAt(okWord.end() - 1);
            startflag=true;endflag=true;
            for (int i = 0; i <letters.length ; i++) {
                if (letters[i]==start)startflag=false;
            }
            for (int i = 0; i <letters.length ; i++) {
                if (letters[i]==end)endflag=false;
            }
            if (!startflag&&!endflag)count++;
        }
            System.out.println("Слов, которые начинаются и заканчиваются гласной буквой: "+count);
    }

}
