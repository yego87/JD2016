package by.it.knyazev.JD01.MathLab;

import by.it.knyazev.JD01.MathLab.Interfaces.IEqually;

public class Equally extends Main implements IEqually{
    public boolean equally(String line){
        boolean nan;
        if(line.contains("=")){
            nan = false;
        }else {
            nan = true;
        }
        return nan;
    }
}
