package by.it.knyazev.Less_f3t4.id_6;

/**
 * Created by Artsem Kniazeu on 10.02.2016.
 */
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Введите интервал (Каждое число через enter)");
        String n1 = scan();
        String n2 = scan();
        int i = Integer.parseInt(n1);
        int j = Integer.parseInt(n2);
        System.out.println("Введите проверяемое число");
        String cn = scan();
        int m = Integer.valueOf(cn);
        if (n1.length()==1 && n2.length() == 1 && cn.length() == 1) {
            if(m>=i && m<=j){
                System.out.println("Пренадлежит");
            }
            else if (m<=i && m>=j){
                System.out.println("Пренадлежит");
            }
            else {
                System.out.println("Увы");
            }
        }



    }

    public static String scan(){
        Scanner scan = new Scanner(System.in);
        String scanned = scan.nextLine();
        return scanned;
    }


}
