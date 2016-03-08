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





    /*
    public static void searcPattern (){

        Map<String, String> map = new HashMap<>();
        StringBuilder s = new StringBuilder("(5+4*(2+3))/[2-1]");
        */
        //String innerEx = "([\\w+\\-*/=.]+)";
        /*String bracesEx = "[\\(]"+innerEx+"[\\)]|[\\[]"+innerEx+"[\\]]";
        //Pattern pat = Pattern.compile("[\\(]([\\w\\+\\-\\*\\/\\=]+)[\\)]|[\\[](\\1)[\\]]");
        Pattern pat = Pattern.compile(bracesEx);
        int i = 0;
        while (pat.matcher(s).find()){
            Matcher mat = pat.matcher(s);
            String group = pat.matcher(s).group();
            System.out.println(group);
            map.put("b"+i,group);
            i++;
            s.replace(mat.start(),mat.end(),"b"+i);
            mat.reset();
        }
    }

    public static StringBuilder findMatch (StringBuilder s, String bracesEx, Pattern pat, int i, Matcher mat, Map<String, String>map){

        while (mat.find()){
            String group = mat.group();
            System.out.println(group);
            map.put("b"+i,group);
        }
        return s;
    }*/
}
