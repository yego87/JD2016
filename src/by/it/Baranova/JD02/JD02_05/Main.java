package by.it.Baranova.JD02.JD02_05;

import java.util.Locale;
import java.util.ResourceBundle;


public class Main {
    public static void main(String[] args){
        for (Integer j=0;j<3;j++){
            char i=j.toString().charAt(0);
            String country="";
            String language="";
            switch (i) {
                case('1'):
                    country="RU";
                    language="RU";
                    System.out.println("\n"+i+" - русский");
                break;
                case ('2'):
                    country="BY";
                    language="be";
                    System.out.println("\n"+i+" - беларуский");
                break;
                default:
                    System.out.println("\n"+i+" - английский");
            }

            Locale current=new Locale(language,country);

            Locale.setDefault(new Locale("en","US"));
            ResourceBundle res=ResourceBundle.getBundle("by.it.Baranova.JD02.JD02_05.test", current);
            String s1=res.getString("str1");
            System.out.println(s1);
        }
    }
}
