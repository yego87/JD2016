package by.it.solonovich.JD01_work;

/**
 * Created by Кирилл on 08.02.2016.
 */
public class Zadanie4 {
    public static void main(String[] args) {

            Integer a = 121457;
            String s = a.toString();
            char ch[]=s.toCharArray();
            if ('7' == ch[ch.length-1])
                System.out.println("последнее число равно 7");
            else
                System.out.println("последнее число не равно 7");

        }  }