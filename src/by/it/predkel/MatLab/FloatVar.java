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
/*
    @Override
    public FloatVar addFloat(FloatVar value) {//число+матрица
        this.val += value.val;
        return this;
    }
    @Override
    public MatrixVar addMatrix(MatrixVar value) {//число+матрица
        return new MatrixVar(value.matrix).addFloat(this);
    }
    @Override
    public FloatVar mulFloat(FloatVar value) {//число*число
        this.val *= value.val;
        return this;
    }
    @Override
    public MatrixVar mulMatrix(MatrixVar value){//число*матрицу
        return new MatrixVar(value.matrix).mulFloat(this);
    }
    @Override
    public FloatVar robFloat(FloatVar value){//число-число
        this.val-=value.val;
        return this;
    }
    @Override
    public MatrixVar robMatrix(MatrixVar value){//число-матрица
        System.out.println("Нельзя отнять от числа матрицу!");
        return null;
    }
    @Override
    public FloatVar divFloat(FloatVar value) {//число/число
        this.val /= value.val;
        return this;
    }
    @Override
    public MatrixVar divMatrix(MatrixVar value){//число/матрица
        System.out.println("Нельзя делить число на матрицу!");
        return null;
    }
*/
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
            return new FloatVar(val/=((FloatVar)value).val);
        }
        return value.div(this);
    }

    @Override
    public void setForm(String str) throws IOException {
        val=Double.parseDouble(str);
    }
}