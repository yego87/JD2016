package by.it.knyazev.JD01.MathLab;

import by.it.knyazev.JD01.MathLab.Interfaces.IBracketsID;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BracketsID implements IBracketsID{
    public int bracketsRoundID(List<String> list){
        int i = list.size() - 1;
        for (int j = 0; j < list.size(); j++) {
            Matcher matchR = Pattern.compile(Patterns.brRound).matcher(list.get(j));
            Matcher matchS = Pattern.compile(Patterns.brSquare).matcher(list.get(j));
            if (matchR.find() | matchS.find()){
                i = j;
            }
        }
        return i;
    }
}
