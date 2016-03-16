package by.it.telushko.jd02_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner {
    public static void main(String [] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line =  bufferedReader.readLine();

        Pattern var = Pattern.compile("([0-9]+\\.[0-9]+)|([0-9]+)");
        Pattern oper = Pattern.compile("[-+/*]");

        ArrayList<Double> vars = new ArrayList();
        String operation = null;
        Matcher okVar = var.matcher(line);
        while (okVar.find()) {
            String varLine = line.substring(okVar.start(), okVar.end());
            double d = Double.valueOf(varLine);
            vars.add(d);
        }
        Matcher okOper = oper.matcher(line);
        while (okOper.find()) {
            operation = line.substring(okOper.start());
        }
        switch (operation){
            case "+":{Parser.add(vars.get(0),vars.get(1));break;}
            case "-":{Parser.sub(vars.get(0), vars.get(1));break;}
            case "*":{Parser.mul(vars.get(0),vars.get(1));break;}
            case "/":{Parser.div(vars.get(0),vars.get(1));break;}
        }
    }
}
