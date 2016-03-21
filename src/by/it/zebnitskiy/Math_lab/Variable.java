package by.it.zebnitskiy.Math_lab;

/**
 * Created by Зебницкий Максим on 3/10/2016.
 */
import org.omg.CORBA.PUBLIC_MEMBER;


public class Variable implements IVariable {
    //этот класс для переменной, ее значение будет в поле value
    private Double value;
    // добавим два конструктора.Один пустой, а втрой по строке с числом;
    public Variable() {
    }
    //конструктор по строке
    public Variable(String string) {
        this.value = Double.valueOf(string);
    }
    //конструктор по значению
    public Variable(Double value){
        this.value = value;
    }
    //теперь для описания операций создадим интефейс
    @Override
    public Variable add(Variable varAdd) {
        // TODO Auto-generated method stub
        //приготовим отдельную переменную для результата операции (чтобы не изменять входные значения)
        Variable out = new Variable();
        //теперь проведем нужную операцию
        out.value = this.value+varAdd.value;
        return out;
    }
    @Override
    public Variable sub(Variable varSub) {
        // TODO Auto-generated method stub
        //приготовим отдельную переменную для результата операции (чтобы не изменять входные значения)
        Variable out = new Variable();
        //теперь проведем нужную операцию
        out.value = this.value-varSub.value;
        return out;
    }
    @Override
    public Variable nul(Variable varNul) {
        // TODO Auto-generated method stub
        //приготовим отдельную переменную для результата операции (чтобы не изменять входные значения)
        Variable out = new Variable();
        //теперь проведем нужную операцию
        out.value = this.value*varNul.value;
        return out;
    }
    @Override
    public Variable div(Variable varDiv) {
        // TODO Auto-generated method stub
        //приготовим отдельную переменную для результата операции (чтобы не изменять входные значения)
        Variable out = new Variable();
        //теперь проведем нужную операцию
        out.value = this.value/varDiv.value;
        return out;
        //теперь, осталось проверить этот класс
        //еще нужен метод вывода значений

    }
    public String toString(){
        return value.toString();
    }
}

