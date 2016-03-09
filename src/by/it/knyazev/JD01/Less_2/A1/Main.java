package by.it.knyazev.JD01.Less_2.A1;


/**
 * Created by Artsem Kniazeu on 10.02.2016.
 */
 
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] massiv = new String[s.length()];
        massiv = s.split(" ");

        String min = massiv[0],max = massiv[0];

        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i].length()<min.length()){
                min=massiv[i];
            }
            if (massiv[i].length()>max.length()){
                max=massiv[i];
            }
        }
        System.out.println("Короткое число "+min+ "- его длина: "+min.length());
        System.out.println("Длинное число "+max+ "- его длина: "+max.length());
    }
}
