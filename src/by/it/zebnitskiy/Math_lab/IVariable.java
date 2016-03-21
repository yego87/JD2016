package by.it.zebnitskiy.Math_lab;

/**
 * Created by Зебницкий Максим on 3/10/2016.
 */

public  interface IVariable {
    //тут создаем основные операции
    Variable add(Variable varAdd);
    Variable sub(Variable varSub);
    Variable nul(Variable varNul);
    Variable div(Variable varDiv);

}

