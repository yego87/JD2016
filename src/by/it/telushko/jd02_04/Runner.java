package by.it.telushko.jd02_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner {
    public static void main(String [] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        Pattern num = Pattern.compile("([0-9]+\\.[0-9]+)|([0-9]+)");
        Pattern oper = Pattern.compile("[-+/*]");
        Pattern var = Pattern.compile("[A-Za-z]");
        String line="";

        ArrayList<String> vars = new ArrayList();
        ArrayList<Double> vals = new ArrayList();
        HashMap<String,Double> results = new HashMap<>();
        String operation = null;

        while (!(line.equals("END"))){

            vals.clear();
            vars.clear();

            line =  bufferedReader.readLine();
            System.out.println(line);
            Matcher okVal = num.matcher(line);
            while (okVal.find()) {
                String varLine = line.substring(okVal.start(), okVal.end());
                double d = Double.valueOf(varLine);
                vals.add(d);
            }

            Matcher okOper = oper.matcher(line);
            while (okOper.find()) {
                operation = line.substring(okOper.start());
            }

            Matcher okVar = var.matcher(line);
            while (okVar.find()){
            vars.add(line.substring(okVar.start(),okVar.end()));
            }

            if (2==vals.size()) {
                switch (operation) {
                    case "+": {results.put(vars.get(0),Parser.add(vals.get(0),vals.get(1)));break;}
                    case "-": {results.put(vars.get(0),Parser.sub(vals.get(0),vals.get(1)));break;}
                    case "*": {results.put(vars.get(0),Parser.mul(vals.get(0),vals.get(1)));break;}
                    case "/": {results.put(vars.get(0),Parser.div(vals.get(0),vals.get(1)));break;}
                }
            }
            if(1==vals.size()){
                switch (operation) {
                    case "+": {results.put(vars.get(0),Parser.add(results.get(vars.get(1)),vals.get(0)));break;}
                    case "-": {results.put(vars.get(0),Parser.sub(results.get(vars.get(1)),vals.get(0)));break;}
                    case "*": {results.put(vars.get(0),Parser.mul(results.get(vars.get(1)),vals.get(0)));break;}
                    case "/": {results.put(vars.get(0),Parser.div(results.get(vars.get(1)),vals.get(0)));break;}
                }
            }
            for (Map.Entry entry : results.entrySet()) {
                System.out.println("Слово: \"" + entry.getKey() +"\" встретилось "+entry.getValue()+" раз" );
            }
        }
    }
}
