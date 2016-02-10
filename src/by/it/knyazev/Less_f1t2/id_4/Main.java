package by.it.knyazev.Less_f1t2.id_4;


/**
 * Created by Artsem Kniazeu on 10.02.2016.
 */
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static boolean diff(String s){
        char[] massch = s.toCharArray();

        boolean find = false;

        for (int i=0; i < massch.length; i++) {
            for (int j = 0; j < massch.length; j++) {
                if ((j != i) && (massch[i] == massch[j])) {
                    find = true;

                }
            }
        }
        return find;
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader=new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        String text = bufferedReader.readLine();
        bufferedReader.close();

	    //String text = "1 12 1223 22 1234";

        String[] mass = new String[text.length()];

        mass = text.split(" ");

        for (String s:mass) {
            if (diff(s)){
                System.out.println(s);
            }
        }
    }
}
