package by.it.chetovich.JD01_09;

/**
 * Created by user_2 on 19.02.2016.
 */
public abstract class Var implements IAddable, ISubtractable, IMultiplicable, IDividable {

    @Override
    public abstract Var add(Var value);

    @Override
    public abstract void sub(Var value);



    @Override
    public abstract void multi(Var value);



    @Override
    public abstract void divide(Var value);

}
