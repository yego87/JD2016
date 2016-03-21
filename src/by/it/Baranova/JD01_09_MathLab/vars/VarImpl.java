package by.it.Baranova.JD01_09_MathLab.vars;


import by.it.Baranova.JD01_09_MathLab.Int.ICalculations;
import by.it.Baranova.JD01_09_MathLab.MyError;

public abstract class VarImpl implements ICalculations {

    @Override
    public VarImpl add (VarImpl var) {
        new MyError("Сложение не возможно");
        return null;
    }

    @Override
    public VarImpl div (VarImpl var) {
        new MyError("Деление не возможно");
        return null;
    }

    @Override
    public VarImpl mul(VarImpl var){
        new MyError("Умножение не возможно");
        return null;
    }

    @Override
    public VarImpl sub (VarImpl var){
        new MyError("Вычитание не возможно");
        return null;
    }

}
