package by.it.predkel.jd01.LevelA;

/**
 * Created by Admin on 09.02.2016.
 */
public class Palindrom {
    public static void palindrom(String[] str){
        char [] ch;
        boolean checker;
        for (int i = 0; i <str.length; i++){
            ch = str[i].toCharArray();
            checker=true;
            int t=str[i].length()/2;
            for (int j=0,k=str[i].length()-1;j<t;j++, k--)
            {if (ch[j] != ch[k]) {
                checker = false;
                break;
            }
            }
            if (checker==true) System.out.println(str[i]);
        }
    }
}
