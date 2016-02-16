package by.it.knyazev.Less_2.B4;

import java.util.Scanner;

/**
 * Created by Artsem Kniazeu on 13.02.2016.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int m = Integer.parseInt(s);
        String mn = null;
        switch (m){
            case 1: {
                mn="Янв";
                break;
            }            case 2: {
                mn="Фев";
                break;
            }            case 3: {
                mn="Мрт";
                break;
            }            case 4: {
                mn="Апр";
                break;
            }            case 5: {
                mn="Май ";
                break;
            }            case 6: {
                mn="Июн ";
                break;
            }            case 7: {
                mn="Июл ";
                break;
            }            case 8: {
                mn="Июл ";
                break;
            }            case 9: {
                mn="Сен";
                break;
            }            case 10: {
                mn="Окт";
                break;
            }            case 11: {
                mn="Нбр";
                break;
            }            case 12: {
                mn="Дек";
                break;
            }

        }
        System.out.println(mn);

    }
}
