package by.it.solonovich.JD01_work;

/**
 * Created by Кирилл on 08.02.2016.
 */
public class Zadanie6 {
    public static void main(String[] args) {

        Integer a =100;
        Integer b = 99;
       Integer c =a+b;
        String s=c.toString();
        char ch[]=s.toCharArray();
        int len=s.length();

        char result=s.charAt(s.length()-1);
        if ('0'==result)
        {System.out.println( c + " рублей" );}
        if ('1'==result)
        {System.out.println( c + " рубль" );}
        else if ('2'==result)
        {System.out.println( c +  " рубля" );}
        else if ('3'==result)
        {System.out.println( c + " рубля" );}
        else if ('4'==result)
        {System.out.println( c + " рубля" );}
        else if ('5'==result)
        {System.out.println( c + " рублей" );}
        else if ('6'==result)
        {System.out.println( c + " рублей" );}
        else if ('7'==result)
        {System.out.println( c + " рублей" );}
        else if ('8'==result)
        {System.out.println( c + " рублей" );}
        else if ('9'==result)
        {System.out.println( c + " рублей" );}





        //System.out.println(result);

    }
}
