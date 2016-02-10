package by.it.predkel.jd01.LevelB;

import java.io.IOException;

/**
 * Необходимо ввести номер месяца и выдать соответственное его название (с проверкой ввода)
 */
public class ChooseMonth {
    public static void chooseMonth() throws IOException {
        int month=-1;
        while (month<0 || month>12)
            month=System.in.read();
        String namemonth="";
        switch (month) {
            case 1:{
                namemonth="январь";
                break;}
            case 2:{
                namemonth="февраль";
                break;}
            case 3:{
                namemonth="март";
                break;}
            case 4:{
                namemonth="апрель";
                break;}
            case 5:{
                namemonth="май";
                break;}
            case 6:{
                namemonth="июнь";
                break;}
            case 7:{
                namemonth="июль";
                break;}
            case 8:{
                namemonth="август";
                break;}
            case 9:{
                namemonth="сентябрь";
                break;}
            case 10:{
                namemonth="октябрь";
                break;}
            case 11:{
                namemonth="ноябрь";
                break;}
            case 12:{
                namemonth="декабрь";
                break;}
        }
        System.out.print(namemonth);
    }
}
