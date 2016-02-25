package by.it.telushko.jd01_10_freeMathLab.Vars;


import by.it.telushko.jd01_10_freeMathLab.Interfaces.IAdd;
import by.it.telushko.jd01_10_freeMathLab.Interfaces.IDiv;
import by.it.telushko.jd01_10_freeMathLab.Interfaces.IMul;
import by.it.telushko.jd01_10_freeMathLab.Interfaces.ISub;

public abstract class Var implements IAdd,ISub,IMul,IDiv {

    @Override
    public Var add(Var var) {
        new Error("Сложение невозможно");
        return null;
    }

    @Override
    public Var sub(Var var) {
        new Error("Вычитание невозможно");
        return null;
    }

    @Override
    public Var mul(Var var) {
        new Error("Умножение невозможно");
        return null;
    }

    @Override
    public Var div(Var var) {
        new Error("Деление невозможно");
        return null;
    }
}
