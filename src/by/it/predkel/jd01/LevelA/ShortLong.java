package by.it.predkel.jd01.LevelA;

/**
 * Created by Admin on 09.02.2016.
 */
public class ShortLong {
    public static void shortLong(String[] str){
        for (String v:str){
            System.out.println(v);
        }
        String max=str[0],min=str[0];
        for (int i = 0; i < str.length; i++){
            if (str[i].length()>max.length())
                max=str[i];
            if (str[i].length()<min.length())
                min = str[i];
        }
        System.out.println("max = "+max+"("+max.length()+")");
        System.out.println("min = "+min+"("+min.length()+")");

    }
}
