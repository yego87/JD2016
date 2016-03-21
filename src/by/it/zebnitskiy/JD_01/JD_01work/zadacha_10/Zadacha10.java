package by.it.zebnitskiy.JD_01.JD_01work.zadacha_10;

/**
 * Created by Зебницкий Максим on 2/11/2016.
 */
public class Zadacha10 {
    public static void main(String[] args) {
        int n = 10;
        int  k =1;
        for  ( int i  = 1; k <= n; i++){
            if (i % 1 == 0){
                System.out.print("\t" + k + " : " + i+", " );
                k++;
            }
        }
    }
}
