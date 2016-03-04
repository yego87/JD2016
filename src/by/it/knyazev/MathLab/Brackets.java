package by.it.knyazev.MathLab;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Mac on 03.03.16.
 */
public class Brackets {

    public boolean bracketsSquare(String line){
        Pattern br = Pattern.compile(Patterns.brSquare);
        Matcher match = br.matcher(line);
        boolean nan = false;
        while (match.find()){nan = true;}
        return nan;
    }

    public boolean bracketsRound(String line){
        Pattern br = Pattern.compile(Patterns.brRound);
        Matcher match = br.matcher(line);
        boolean nan = false;
        while (match.find()){nan = true;}
        return nan;
    }
}
