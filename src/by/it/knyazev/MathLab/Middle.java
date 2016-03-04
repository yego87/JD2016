package by.it.knyazev.MathLab;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by Mac on 03.03.16.
 */
public class Middle{

    public String line;

    public List<String> list = new ArrayList<String>();

    public String[] array;

    public Middle(String line) {
        this.line = line;
    }

    public Brackets brackets = new Brackets(line);

    public LineToArray lta = new LineToArray(line);

    public void checkBrackets(){

    }

    public void requiredOperations(){
        list = lta.toArray();
        System.out.println(list);
    }



}
