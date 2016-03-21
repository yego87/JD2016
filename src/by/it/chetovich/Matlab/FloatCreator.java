package by.it.chetovich.Matlab;

/**
 * FloatVar Creator
 */
public class FloatCreator extends Creator {

    @Override
    public Var create(String s, int lineQuantity) {
        return new FloatVar(Float.parseFloat(s));
    }
}
