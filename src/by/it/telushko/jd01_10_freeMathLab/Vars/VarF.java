package by.it.telushko.jd01_10_freeMathLab.Vars;

import by.it.telushko.jd01_10_freeMathLab.Interfaces.*;

public class VarF extends Var implements IAdd,IDiv,IMul,ISub,IVar {

    private double value;

    //конструкторы класса численной переменной.
    public VarF (String str ){                     //если передали строку
        setFromString(str);
    }

    public VarF (double value){                    //если передали число
        this.value=value;
    }

    //возврат результата вычисления
    public double getValue(){
        return value;
    }
    // переопределяем методы операций

    @Override
    public Var add(Var var) {
        if (var instanceof VarF) //проверим, является ли аргумент скаляром
            return new VarF(this.value + ((VarF)var).value); //выводим итог
        //если аргумент не скаляр, то меняем местами операнды f2+f1
        return var.add(this);
    }

    @Override
    public Var sub(Var var) {
        if (var instanceof VarF) //проверим, является ли аргумент скаляром
            return new VarF(this.value - ((VarF)var).value); //выводим итог
        //если аргумент не скаляр, то меняем местами операнды (-1)*(f2-f1)
        VarF minus=new VarF(-1); //готовим -1
        return minus.mul(var.sub(this)); //выводим итог = (-1)*(f2-f1)
    }

    @Override
    public Var mul(Var var) {
        if (var instanceof VarF) //проверим, является ли аргумент скаляром
            return new VarF(this.value * ((VarF)var).value); //выводим итог
        //если аргумент не скаляр, то меняем местами операнды f2+f1
        return var.mul(this);
    }

    @Override
    public Var div(Var var) {
        if (var instanceof VarF) //проверим, является ли аргумент скаляром
            return new VarF(this.value / ((VarF)var).value); //выводим итог
        //если аргумент не скаляр, то на него делить нельзя, вызываем базовый класс
        return super.div(var);
    }

    // вспомогательные операции
    @Override
    public String toString(){                      //возвращаем результат вычисления в строку
        return ((Double)value).toString();
    }
    @Override
    public void setFromString (String str){        //получаем значение из строки со входа конструктора
        value=Double.valueOf(str);
    }

}
