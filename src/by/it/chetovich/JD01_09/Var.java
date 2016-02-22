package by.it.chetovich.JD01_09;

/**
 * abstract class for all types of variable
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
