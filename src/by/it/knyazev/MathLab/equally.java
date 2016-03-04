package by.it.knyazev.MathLab;

/**
 * Created by Mac on 03.03.16.
 */
public class Equally extends Main{
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
