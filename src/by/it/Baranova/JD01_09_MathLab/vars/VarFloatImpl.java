package by.it.Baranova.JD01_09_MathLab.vars;

import by.it.Baranova.JD01_09_MathLab.Exceptions.ZeroDivisionException;
import by.it.Baranova.JD01_09_MathLab.Int.ICalculations;
import by.it.Baranova.JD01_09_MathLab.Int.IVariable;
import by.it.Baranova.JD01_09_MathLab.Log;



public class VarFloatImpl extends VarImpl implements ICalculations,IVariable {
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
    public VarImpl div(VarImpl var) {
        Log log=Log.getInstance();
        try {
            if (((VarFloatImpl) var).value==0){throw new ZeroDivisionException("Деление на 0 невозможно");}
            if (var instanceof VarFloatImpl)
                return new VarFloatImpl(this.value / ((VarFloatImpl) var).value);
        } catch (ZeroDivisionException e) {
            log.saveLog("Деление на 0");
        }
        return super.div(var);
    }

    //Вспомогательные операции
    @Override
    public String toString () {
        //System.out.print("Type float ");
        return ((Double)value).toString();}
    @Override
    public void setFrom(String str) {value=Double.valueOf(str);}
}
