package by.it.Baranova.JD01_09_MathLab;

import by.it.Baranova.JD01_09_MathLab.vars.VarImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ekaterina on 2/25/16.
 */
public class ReadingFromConsole {
    public static int  numberExpression=0;
    public static Map<String,VarImpl> tmpHashMap=new HashMap<>();
    public static String ReadLine()throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String rLine = bufferedReader.readLine();
        return rLine;
    }

    public static String[] Determine (String str){
        String [] operands=new String [3];
        if (!str.contains("=")) {
            Pattern p1 = Pattern.compile(Patterns.exOperations);
            Matcher m1 = p1.matcher(str);
            int pos = 0;
            while (m1.find()) {
                pos = m1.end();
            }
            operands[0] = str.substring(0, pos - 1);
            operands[1] = str.substring(pos, str.length());
            operands[2] = str.substring(pos - 1, pos);
        } else {
            Matcher m1=Pattern.compile("=").matcher(str);
            int pos = 0;
            while (m1.find()) {
                pos = m1.end();
            }
            operands[0] = str.substring(0, pos - 1);
            operands[1] = str.substring(pos, str.length());
            operands[2] = str.substring(pos - 1, pos);
        }
        for (int i=0;i<2;i++){
            Map<String,VarImpl> hashMap=Runner.getHashMap();
            if (hashMap.containsKey(operands[i])){
                operands[i]=hashMap.get(operands[i]).toString();
            }


        }
        return operands;
    }

    //Method check if the expression has to be resolved
    public static boolean toResolve (String str){
        Pattern p1 = Pattern.compile(Patterns.exOperations);
        Matcher m1 = p1.matcher(str);
        boolean check=false;
        if (m1.find()) {
            check=true;
        }
        return check;
    }

    public static String purser(String str)throws IOException{
        String newstr=str;
        newstr=ReadingFromConsole.purse(newstr);
        VarImpl var=MakeAnOperation.makeAnOpetation(newstr);
        String varstr=var.toString();
        return varstr;
    }

    public static String purse (String str) throws IOException{
        String newstr=str;
        String pursestring="";
        while (newstr.contains("(")||newstr.contains(")")) {
            Matcher m1 = Pattern.compile(Patterns.braces).matcher(newstr);
            while (m1.find()) {
                numberExpression++;
                String initExpression = "tmp" + numberExpression;
                pursestring = m1.group();
                newstr = newstr.replace(pursestring, initExpression);
                pursestring = pursestring.substring(1, pursestring.length() - 1);
                if (pursestring.contains("(") || pursestring.contains(")")) {
                    pursestring = ReadingFromConsole.purse(pursestring);
                }
                Runner.putElement(initExpression, MakeAnOperation.makeAnOpetation(pursestring));
            }
        }
        System.out.println(newstr);
        return newstr;
    }
}
