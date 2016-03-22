package by.it.daylidovich.FreeMathLab.InputOutput;

import by.it.daylidovich.FreeMathLab.Logger.Logger;
import by.it.daylidovich.FreeMathLab.variables.Float.VariableFloat;
import by.it.daylidovich.FreeMathLab.variables.Matrix.VariableMatrix;
import by.it.daylidovich.FreeMathLab.variables.Variable;
import by.it.daylidovich.FreeMathLab.variables.Vector.VariableVector;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reader {
    public static String readInput() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try{
            line = reader.readLine().trim();
        }
        catch (IOException e){
            Logger.writeLog(e.getMessage(), new Date(System.currentTimeMillis()));
            System.out.println(e.getMessage());
        }
        return line;
    }

    public static String readFirstTerm(String string){
        Matcher matcher = Pattern.compile("([0-9\\[\\]\\{\\}.,]+)([+\\-*/ ])").matcher(string);
        if (matcher.find())
            return matcher.group(1);
        else
            return null;
    }

    public static String readSecondTerm(String string){
        Matcher matcher = Pattern.compile("([+\\-*/= ])([0-9\\[\\]\\{\\}.,]+)").matcher(string);
        if (matcher.find())
            return matcher.group(2);
        else
            return null;
    }

    public static String readOperation(String string){
        Matcher matcher = Pattern.compile("[+\\-*/=]").matcher(string);
        if (matcher.find())
            return matcher.group();
        else
            return null;
    }

    public static String readNameVariable(String string){
        Matcher matcher = Pattern.compile("([A-z0-9]+)([ ]*[=][ ]*)").matcher(string);
        if (matcher.find())
            return matcher.group(1);
        else
            return null;
    }

    public static String readExpression(String string){
        Matcher matcher = Pattern.compile("([ ]*[=][ ]*)([A-z+\\-*/0-9\\[\\]\\{\\}\\(\\)., ]+)").matcher(string);
        if (matcher.find())
            return matcher.group(2).trim();
        else
            return null;
    }

    public static String readBrackets(String string){
        Matcher matcher = Pattern.compile("[\\(][+\\-*/0-9\\[\\]\\{\\}., ]+[\\)]").matcher(string);
        if (matcher.find())
            return matcher.group();
        else
            return null;
    }

    public static Variable getVariable(String string) {
        Matcher matcher = Pattern.compile("[\\[\\{]").matcher(string);
        int count = 0;
        while (matcher.find())
            count++;
        switch (count){
            case 0:
                return new VariableFloat(string);
            case 1:
                return  new VariableVector(string);
            default:
                return new VariableMatrix(string);
        }
    }
}
