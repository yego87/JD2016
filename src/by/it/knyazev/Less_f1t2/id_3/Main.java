package by.it.knyazev.Less_f1t2.id_3;

/**
 * Created by Artsem Kniazeu on 10.02.2016.
 */
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        InputStreamReader inputStreamReader=new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        String text = bufferedReader.readLine();
        bufferedReader.close();

        //String text = "1 22 333 4444 55555 666666";

        String[] massiv = new String[text.length()];

        massiv = text.split(" ");

        int min = massiv[0].length(),max = massiv[0].length();

        for (int i = 0; i < massiv.length; i++) {

            if (massiv[i].length()<min){
                min=massiv[i].length();
            }

            if (massiv[i].length()>max){
                max=massiv[i].length();
            }
        }

        for (int i = 0; i < massiv.length; i++) {
            int k;
            k = (min + max)/2;

            if (massiv[i].length()<=k){
                System.out.print(massiv[i]);
                System.out.println(" length-" + massiv[i].length());
            }

        }
    }
}
