package by.it.knyazev.MathLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class LineToArray {
    public String[] array;

    public List<String> list = new ArrayList<String>();

    public List<String> toArray(String line){
        Pattern pat = Pattern.compile(" ");//[+]|[-]|[/]|[*]
        array = pat.split(line);
        for (int i = 0; i < array.length ; i++) {
            list.add(i,array[i]);
        }
        return list;
    }
}
