package by.it.knyazev.MathLab;

import by.it.knyazev.MathLab.Interfaces.IBrackets;

import java.lang.annotation.Target;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Brackets implements IBrackets{

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
