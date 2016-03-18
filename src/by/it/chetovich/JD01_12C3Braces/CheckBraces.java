package by.it.chetovich.JD01_12C3Braces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * check braces
 */
public class CheckBraces {

    /**
     *
     * @param s line with braces to check
     * @return array with braces only
     */
    public static ArrayList<String> bracesToArray (String s){

        ArrayList<String> bracesArray=new ArrayList<>();
        Pattern p1=Pattern.compile("[()\\{\\}\\[\\]]{1}");
        Matcher m1=p1.matcher(s);
        while (m1.find()){
            bracesArray.add(m1.group());
        }
        return bracesArray;
    }

    public static void checkBraces (ArrayList<String> braces){

        ArrayList<String> bracesArray=new ArrayList<>(braces);
        int i=0;
        int check=0;
        while (check==0){
            String a=bracesArray.get(i);
            String b=bracesArray.get(i+1);
            if (a.equals("(")&&b.equals(")")||a.equals("[")&&b.equals("]")||a.equals("{")&&b.equals("}")){

                bracesArray.remove(i);
                bracesArray.remove(i);
                if (i>0)i--;
            }
            else i++;

            if (i==bracesArray.size()-1) check=1;

            if (bracesArray.size()==0) {
                check=1;
                System.out.println("Скобки расставлены корректно");
            }

        }
        if (bracesArray.size()!=0){System.out.println("Скобки расставлены не корректно");}
    }


}
