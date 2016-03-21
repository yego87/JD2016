package by.it.chetovich.Matlab;

/**
 * Created by user_2 on 21.03.2016.
 */
public class FloatCreator extends Creator {

    @Override
    public Var create(String s) {
        return new FloatVar(Float.parseFloat(s));
    }
}
