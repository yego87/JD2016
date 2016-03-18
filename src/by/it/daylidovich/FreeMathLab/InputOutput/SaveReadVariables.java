package by.it.daylidovich.FreeMathLab.InputOutput;

import by.it.daylidovich.FreeMathLab.variables.Variable;

import java.io.*;
import java.util.Map;

import static by.it.daylidovich.FreeMathLab.variables.Variable.getBase;

public class SaveReadVariables {
    public static void saveBase(){
        Map<String, Variable> base = getBase();
        try{
            PrintWriter printer = new PrintWriter(new FileWriter("src\\by\\it\\daylidovich\\FreeMathLab\\Vars.txt"));
            for (Map.Entry<String, Variable> pair: base.entrySet()){
                printer.println(pair.getKey() + "=" + pair.getValue());
            }
            printer.close();
        } catch (IOException e) {
            System.out.println("Ошибка записи.");
        }
    }

    public static void readBase(){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("src\\by\\it\\daylidovich\\FreeMathLab\\Vars.txt"));
            String vars;
            while (null != (vars = reader.readLine())){
                String name = by.it.daylidovich.FreeMathLab.InputOutput.Reader.readNameVariable(vars);
                String variable = by.it.daylidovich.FreeMathLab.InputOutput.Reader.readSecondTerm(vars);
                by.it.daylidovich.FreeMathLab.InputOutput.Reader.getVariable(variable).save(name);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        } catch (IOException e) {
            System.out.println("Ошибка чтения.");
        }
    }

    public static String clearBase(){
        if (new File("src\\by\\it\\daylidovich\\FreeMathLab\\Vars.txt").delete()){
            Variable.clearBase();
            return "База переменных очищена.";
        }
        else
             return "База не очищена.";
    }
}
