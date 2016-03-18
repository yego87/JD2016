package by.it.predkel.MatLab;

import java.io.IOException;

/**
 * Created by Admin on 19.02.2016.
 */
public class FloatVar extends Var {

    double val;

    public FloatVar(double value){
        this.val = value;
    }

    public FloatVar(String str) throws IOException {
        setForm(str);
    }

    @Override
    public int intValue() {
        return (int)this.val;
    }

    @Override
    public long longValue() {
        return (long)this.val;
    }

    @Override
    public float floatValue() {
        return (float)this.val;
    }

    @Override
    public double doubleValue() {
        return this.val;
    }

    @Override
    public Var add (Var value){
        if (value instanceof FloatVar){
            return new FloatVar(val+=((FloatVar) value).val);
        }
        return value.add(this);
    }

    @Override
    public Var mul (Var value){
         if (value instanceof FloatVar){
            return new FloatVar(val*=((FloatVar)value).val);
        }
        return value.mul(this);
    }

    @Override
    public Var sub (Var value){
        if (value instanceof FloatVar){
            return new FloatVar(val-=((FloatVar)value).val);
        }
        FloatVar minus=new FloatVar(-1);
        return minus.mul(value.sub(this));
    }

    @Override
    public Var div (Var value){
        if (value instanceof FloatVar){
            {
                if (((FloatVar) value).val==0){
                    throw new ArithmeticException();}
            }
            return new FloatVar(val/=((FloatVar)value).val);
        }
        return value.div(this);
    }

    @Override
    public void outPut(){
        System.out.println(val);
    }

    public String toString(){
        String temp=""+val;
        return temp;
    }

    @Override
    public void setForm(String str) throws IOException {
        val=Double.parseDouble(str);
    }
}