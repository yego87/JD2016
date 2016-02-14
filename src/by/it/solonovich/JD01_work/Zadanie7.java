package by.it.solonovich.JD01_work;

/**
 * Created by Кирилл on 08.02.2016.
 */
public class Zadanie7 {


  public static void main(String[] args) {
    int day = 22;
    int month = 11;
    int year = 2016;


      if ((day) >= 31 && (month == 1|| month == 3 || month == 5 || month == 7 || month == 8 || month == 10))
      {
        day = 1;
        month++;
        System.out.println(day + "." + month + "." + year);}
      else if ((day) >= 30 && (month == 4|| month == 6 || month == 9 || month == 11 ))
      {
        day = 1;
        month++;
        System.out.println(day + "." + month + "." + year);
      }
      else if ((day) >= 30 && (month == 4|| month == 6 || month == 9 || month == 11 ))
      {
        day = 1;
        month++;
        System.out.println(day + "." + month + "." + year);}

      else if ((day) >= 28 && (month == 2))

      {
        day = 1;
        month++;
        System.out.println(day + "." + month + "." + year);}

      else if ((day) >= 31 && (month == 12))

      {
        day = 1;
        month = 1;
        year++;
        System.out.println(day + "." + month + "." + year);}


      else
      {
        day++;
      System.out.println(day + "." + month + "." + year);}}}


