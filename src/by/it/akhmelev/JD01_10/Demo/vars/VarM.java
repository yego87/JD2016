package by.it.akhmelev.JD01_10.Demo.vars;

public class VarM extends Var{
    //это же просто пример ;)
    //класс создается по аналогии с VarV и VarF

    @Override
    public Var add(Var var) {
        System.out.println("Тест. Позднее связывание с VarM->ADD");
        return null;
    }
}
