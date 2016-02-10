package by.it.knyazev.Less_f3t4.id_5;


/**
 * Created by Artsem Kniazeu on 10.02.2016.
 */
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        /*
        InputStreamReader inputStreamReader=new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        String text = bufferedReader.readLine();
        bufferedReader.close();

        */
        String text = "1 23 404 3123 9815189";

        String[] mass = new String[text.length()];

        mass = text.split(" ");

        for (String s:mass) {

            if (bool(s)) {
                System.out.println(s);
            }

        }


    }

    public static boolean bool(String s){

        char[] massbl = s.toCharArray();

        boolean boole = true;

        for (int i=massbl.length-1; i >= 0; i--) {

            int j = massbl.length-i-1;

            if ((massbl[i] != massbl[j])) {
                boole = false;
            }

        }

        return  boole;
    }

}
