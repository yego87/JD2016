package by.it.chetovich.JD01_09;

/**
 * Created by user_2 on 19.02.2016.
 */
public abstract class Var implements IAddable, ISubtractable, IMultiplicable, IDividable {

    @Override
    public  Var add(Var value){
        new Error ("Сложение невозможно.");
        return null;
    }

    @Override
    public  Var sub(Var value){
        new Error ("Вычитание невозможно.");
        return null;
    }



    @Override
    public  Var multi(Var value){
        new Error ("Умножение невозможно.");
        return null;
    }



    @Override
    public  Var divide(Var value){
        new Error ("Деление невозможно.");
        return null;
    }

}
