package by.it.dorostchenok.jd01_09;

import by.it.dorostchenok.jd01_09.exception.BadOperationException;
import by.it.dorostchenok.jd01_09.interfaces.VariableStorageDAO;
import by.it.dorostchenok.jd01_09.services.Parser;
import by.it.dorostchenok.jd01_09.services.VariableStorageMapImpl;
import by.it.dorostchenok.jd01_09.values.Value;
import by.it.dorostchenok.jd01_09.values.Variable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;

public class ConsoleRunner {

    private VariableStorageDAO storage = new VariableStorageMapImpl();
    Parser parser = new Parser();

    public void execute() throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, BadOperationException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


        while (true){

            String line = bufferedReader.readLine();
            if ("q".equals(line.trim().toLowerCase())){
                System.out.println("Exit.. Thank you for using");
                bufferedReader.close();
                break;
            } else if ("vars".equals(line.trim().toLowerCase())){
                for (Value v : storage.getAll()){
                    System.out.println(v.toString());
                }
            }

            Value result = parser.parse(line, storage);
            if (result instanceof Variable){
                storage.setVariable(result.getValue(), result);
            }
            //System.out.println(result);
        }

    }
}
