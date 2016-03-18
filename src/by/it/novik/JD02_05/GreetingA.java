package by.it.novik.JD02_05;


import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class GreetingA {
    public static void main(String[] args) {

        System.out.printf("%s%s%s","Выберите язык\n","Choose language\n","Абярыце мову\n");
        System.out.println("RU/EN/BY >");

        Scanner scanner = new Scanner(System.in);
        String language = "";
        if (scanner.hasNext()) {
            language = scanner.nextLine();
        }
        else {
            System.out.println("You were asked to enter a language");
        }


        Locale rus = Locale.getDefault();
        Locale bel = new Locale("be", "BY");;
        Locale eng = new Locale("en", "US");;
        Locale cur = Locale.getDefault();

        switch (language) {
            case "RU":
                cur = rus;
                break;
            case "EN":
                 cur = eng;
                break;
            case "BY":
                cur = bel;
                break;

        }


        ResourceBundle rb = ResourceBundle.getBundle("by.it.novik.JD02_05.text", cur);

        String greeting = rb.getString("key");

        System.out.println(greeting);
    }
}
