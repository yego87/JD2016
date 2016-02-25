package by.it.dorostchenok.jd01_09;

import by.it.dorostchenok.jd01_09.exception.OperationNotFoundException;
import by.it.dorostchenok.jd01_09.services.Parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleRunner {

    public void execute() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        Parser parser = new Parser();
        while (true){

            String line = bufferedReader.readLine();
            if ("q".equals(line.trim().toLowerCase())){
                System.out.println("Exit.. Thank you for using");
                bufferedReader.close();
                break;
            }
            try {
                parser.parse(line);
            } catch (OperationNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
