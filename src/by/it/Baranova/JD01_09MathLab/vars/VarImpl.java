package by.it.Baranova.JD01_09MathLab.vars;


import by.it.Baranova.JD01_09MathLab.Interfaces.IAddable;
import by.it.Baranova.JD01_09MathLab.Interfaces.IDivable;
import by.it.Baranova.JD01_09MathLab.Interfaces.IMulable;
import by.it.Baranova.JD01_09MathLab.Interfaces.ISubable;
import by.it.Baranova.JD01_09MathLab.MyError;

/**
 * Created by Ekaterina on 2/22/16.
 */
public abstract class VarImpl implements IAddable, IMulable,IDivable,ISubable {

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
