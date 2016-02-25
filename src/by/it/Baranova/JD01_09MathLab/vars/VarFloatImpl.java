package by.it.Baranova.JD01_09MathLab.vars;


import by.it.Baranova.JD01_09MathLab.Interfaces.*;

/**
 * Created by Ekaterina on 2/22/16.
 */
public class VarFloatImpl extends VarImpl implements IDivable,IAddable,ISubable,IMulable,IVariable {
    private double value;
    //Конструкторы
    public VarFloatImpl(String str){
        setFrom(str);
    }

    public VarFloatImpl(double value){
        this.value=value;
    }
    public double getValue() { return value;}

    @Override //Сумма
    public VarImpl add (VarImpl var){
        if (var instanceof VarFloatImpl)
            return new VarFloatImpl(this.value+((VarFloatImpl)var).value);
        return var.add(this);
    }


    @Override //Вычитание
    public VarImpl sub(VarImpl var){
        if (var instanceof VarFloatImpl)
            return new VarFloatImpl(this.value-((VarFloatImpl)var).value);
        VarFloatImpl minus=new VarFloatImpl(-1);
        return minus.mul(var.sub(this));
    }

    @Override //Умножение
    public VarImpl mul(VarImpl var){
        if (var instanceof VarFloatImpl)
            return new VarFloatImpl(this.value*((VarFloatImpl)var).value);
        return var.mul(this);
    }

    @Override //Деление
    public VarImpl div(VarImpl var){
        if (var instanceof VarFloatImpl)
            return new VarFloatImpl(this.value/((VarFloatImpl)var).value);
        return super.div(var);
    }

    //Вспомогательные операции
    @Override
    public String toString () {return ((Double)value).toString();}
    @Override
    public void setFrom(String str) {value=Double.valueOf(str);}
}
