package by.it.predkel.jd01.LevelA;

/**
 * Created by Admin on 09.02.2016.
 */
public class DifferentSymbols {
    public static void differentSymbols(String[] str){
        char [] ch;
        boolean checker=true;
        for (int i=0; i< str.length; i++){
            ch = str[i].toCharArray();
            checker=true;
            for (int j = 0; j < str[i].length(); j++){
                for (int k = j+1; k <str[i].length(); k++){
                    if (ch[j]==ch[k]){
                        checker=false; break;
                    }
                }
            }
            if (checker==true)
                System.out.println(str[i]+" ");
        }
    }
}
