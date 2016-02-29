package by.it.dorostchenok.jd01_09;

import by.it.dorostchenok.jd01_09.exception.BadOperationException;
import by.it.dorostchenok.jd01_09.exception.BadValueException;
import by.it.dorostchenok.jd01_09.exception.VariableNotDefinedException;
import by.it.dorostchenok.jd01_09.interfaces.VariableStorageDAO;
import by.it.dorostchenok.jd01_09.services.Parser;
import by.it.dorostchenok.jd01_09.services.VariableStorageMapImpl;
import by.it.dorostchenok.jd01_09.values.Value;
import by.it.dorostchenok.jd01_09.values.Variable;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;

import by.it.dorostchenok.jd01_09.services.VariableComparator;

public class ConsoleRunner {

    private VariableStorageDAO storage = new VariableStorageMapImpl();
    Parser parser = new Parser();

    public void execute() throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, BadOperationException, BadValueException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


        while (true){

            String line = bufferedReader.readLine();
            if ("q".equals(line.trim().toLowerCase())){
                System.out.println("Exit.. Thank you for using");
                bufferedReader.close();
                break;
            } else if ("printvar".equals(line.trim().toLowerCase())){
                for (Value v : storage.getAll()){
                    System.out.println(v.toString());
                }
            } else if ("sortvar".equals(line.trim().toLowerCase())){
                List<Value> varList = storage.getAll();
                Collections.sort(varList, new VariableComparator());
                for (Value v : varList){
                    System.out.println(v.toString());
                }

            }

            try{
                Value result = parser.parse(line, storage);
                if (result instanceof Variable){
                    storage.setVariable(result.getValue(), result);
                }
                if (result == null){
                    System.out.println("Result: " + null);
                }

            } catch (BadValueException e){
                System.out.println(e.getMessage());
            } catch (VariableNotDefinedException e) {
                System.out.println(e.getMessage());
            }
            //System.out.println(result);
        }

    }
}
