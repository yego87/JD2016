package by.it.akhmelev.JD01_10.Demo.vars;

import by.it.akhmelev.JD01_10.Demo.Error;
import by.it.akhmelev.JD01_10.Demo.interfaces.*;

public abstract class Var implements IAdd,ISub,IMul,IDiv {
    //эти процедуры будут ЧАСТИЧНО перекрыты в подклассах VarF VarV VarM (числа, вектора и матрицы)
    //если операция не описана, то будет генерироваться указанная ошибка
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
