package by.it.daylidovich.FreeMathLab.InputOutput;

import by.it.daylidovich.FreeMathLab.Logger.Logger;
import by.it.daylidovich.FreeMathLab.variables.Variable;

import java.io.*;
import java.util.Date;
import java.util.Map;

import static by.it.daylidovich.FreeMathLab.variables.Variable.getBase;

public class SaveReadVariables {
    public static void saveBase(){
        Map<String, Variable> base = getBase();
        try{
            PrintWriter printer = new PrintWriter(new FileWriter("src\\by\\it\\daylidovich\\FreeMathLab\\variables\\Vars.txt"));
            for (Map.Entry<String, Variable> pair: base.entrySet()){
                printer.println(pair.getKey() + "=" + pair.getValue());
            }
            printer.close();
        } catch (IOException e) {
            Logger.writeLog(e.toString(), new Date(System.currentTimeMillis()));
        }
    }

    public static void readBase(){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("src\\by\\it\\daylidovich\\FreeMathLab\\variables\\Vars.txt"));
            String vars;
            while (null != (vars = reader.readLine())){
                String name = by.it.daylidovich.FreeMathLab.InputOutput.Reader.readNameVariable(vars);
                String variable = by.it.daylidovich.FreeMathLab.InputOutput.Reader.readSecondTerm(vars);
                by.it.daylidovich.FreeMathLab.InputOutput.Reader.getVariable(variable).save(name);
            }
            reader.close();
        } catch (IOException e) {
            Logger.writeLog(e.toString(), new Date(System.currentTimeMillis()));
        }
    }

    public static String clearBase(){
            Variable.clearBase();
            return "База переменных очищена.";
    }
}
