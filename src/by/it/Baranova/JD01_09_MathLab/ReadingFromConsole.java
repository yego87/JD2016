package by.it.Baranova.JD01_09_MathLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ekaterina on 2/25/16.
 */
public class ReadingFromConsole {

    public static String ReadLine()throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String rLine = bufferedReader.readLine();
        //bufferedReader.close();
        return rLine;

    }

    public static String[] Determine (String str){
        String [] operands=new String [3];
        Pattern p1=Pattern.compile(Patterns.exOperations);
        Matcher m1=p1.matcher(str);
        int pos = 0;
        while (m1.find()){
            pos=m1.end();
        }
        operands[0]=str.substring(0,pos-1);
        operands[1]=str.substring(pos,str.length());
        operands[2]=str.substring(pos-1,pos);
        return operands;
    }
}
