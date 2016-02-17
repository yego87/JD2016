package by.it.novik.JD01_06;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B1 {

    public static void main(String[] args) {


                System.out.println(TextA.example);
                System.out.println("Удаляем слова из 5 букв на согласную: ");

                String[] wordArray = TextA.example.split("[\\s,«».:;!?]+");

                Pattern pattern = Pattern.compile("^[^аоэиуыеёюя]");

                for (String word : wordArray) {

                    Matcher matcher = pattern.matcher(word);

                    if (matcher.find()) {
                        if (word.length() == 5) {
                            word = "-";
                        }
                    }
                    System.out.print(word + " ");
                }
    }
}

