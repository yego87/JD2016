package by.it.knyazev.MathLab;

import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by Mac on 03.03.16.
 */
public class LineToArray extends Middle {

    public LineToArray(String line) {
        super(line);
    }

    public List<String> toArray(){
        Pattern pat = Pattern.compile(" ");//[+]|[-]|[/]|[*]
        array = pat.split(line);
        for (int i = 0; i < array.length; i++) {
            list.add(i,array[i]);
        }
        return list;
    }
}
