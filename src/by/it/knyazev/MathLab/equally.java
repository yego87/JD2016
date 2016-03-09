package by.it.knyazev.MathLab;

import by.it.knyazev.MathLab.Interfaces.IEqually;

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
