package by.it.Baranova.JD01_09_MathLab.vars;

import by.it.Baranova.JD01_09_MathLab.Exceptions.DifferentSizesException;
import by.it.Baranova.JD01_09_MathLab.Int.ICalculations;
import by.it.Baranova.JD01_09_MathLab.Int.IVariable;
import by.it.Baranova.JD01_09_MathLab.Log;
import by.it.Baranova.JD01_09_MathLab.Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class VarVectorImpl extends VarImpl implements ICalculations, IVariable {

    //Конструкторы

    public double[] getVector() {
        return vector;
    }

    private double[] vector;
    public VarVectorImpl(String str) {
        setFrom(str);
    }
    VarVectorImpl(double [] vector) {
        this.vector=new double[vector.length];
        System.arraycopy(vector, 0, this.vector, 0, vector.length);
    }

    VarVectorImpl(VarVectorImpl init){
        this.vector = new double[init.vector.length];
        System.arraycopy(init.vector, 0, this.vector, 0, this.vector.length);
    }

    //Операции

    /**
     * Сумма - первый операнд вектор
     * @param var v2 - второе слагаемое
     * @return v1 - вектор после операции сложения
     */
    @Override
    public VarImpl add(VarImpl var) {
        Log log=Log.getInstance();
        //Второй аргумент - Вектор

        try {
            if (var instanceof VarVectorImpl&&((VarVectorImpl) var).vector.length != this.vector.length) {
                throw new DifferentSizesException("Вектора имеют разную длину");

            }
            if (var instanceof VarVectorImpl && ((VarVectorImpl) var).vector.length == this.vector.length) {
                VarVectorImpl v1 = new VarVectorImpl(this);
                VarVectorImpl v2 = (VarVectorImpl) var;
                for (int i = 0; i < v1.vector.length; i++) {
                    v1.vector[i] = v1.vector[i] + v2.vector[i];
                }
                return v1;
            }
        } catch (DifferentSizesException e){
            log.saveLog("Вектора имеют разную длину");
        }
        //Второй аргумент - скалярная величина
        if (var instanceof VarFloatImpl){
            VarVectorImpl v1=new VarVectorImpl(this);
            double v2=((VarFloatImpl) var).getValue();
            for (int i=0;i<v1.vector.length;i++){
                v1.vector[i]=v1.vector[i]+v2;
            }
            return v1;
        }
    return super.add(var);
    }

    /**
     * Вычитание - первый операнд вектор
     * @param var v2 - вычитаемое
     * @return v1- вектор после операции вычитания
     */
    @Override
    public VarImpl sub(VarImpl var) {
        Log log=Log.getInstance();
        //Второй аргумент - Вектор
        try {
            if (var instanceof VarVectorImpl&&((VarVectorImpl) var).vector.length != this.vector.length) {
                throw new DifferentSizesException("Вектора имеют разную длину");
            }
            if (var instanceof VarVectorImpl && ((VarVectorImpl) var).vector.length == this.vector.length) {
                VarVectorImpl v1 = new VarVectorImpl(this);
                VarVectorImpl v2 = (VarVectorImpl) var;
                for (int i = 0; i < v1.vector.length; i++) {
                    v1.vector[i] = v1.vector[i] - v2.vector[i];
                }
                return v1;
            }
        }catch (DifferentSizesException e){
            log.saveLog("Вектора имеют разную длину");
        }
        //Второй аргумент - скалярная величина
        if (var instanceof VarFloatImpl){
            VarVectorImpl v1=new VarVectorImpl(this);
            double v2=((VarFloatImpl) var).getValue();
            for (int i=0;i<v1.vector.length;i++){
                v1.vector[i]=v1.vector[i]-v2;
            }
            return v1;
        }
        return super.sub(var);
    }


    /**
     * Умножение - первый операнд вектор
     * @param var - второй операнд
     * @return mulV-скалярное произведение, v1 - вектор после произведения
     */
    @Override
    public VarImpl mul(VarImpl var) {
        Log log=Log.getInstance();
        //Второй аргумент - Вектор
        try {
            if (var instanceof VarVectorImpl&&((VarVectorImpl) var).vector.length != this.vector.length) {
                throw new DifferentSizesException("Вектора имеют разную длину");
            }

            if (var instanceof VarVectorImpl && ((VarVectorImpl) var).vector.length == this.vector.length) {
                VarVectorImpl v1 = new VarVectorImpl(this);
                VarVectorImpl v2 = (VarVectorImpl) var;
                double mulV = 0;
                for (int i = 0; i < v1.vector.length; i++) {
                    mulV = mulV + v1.vector[i] * v2.vector[i];
                }
                return new VarFloatImpl(mulV);
            }

        } catch (DifferentSizesException e) {
            log.saveLog("Вектора имеют разную длину");
        }

        //Второй аргумент - скалярная величина
        if (var instanceof VarFloatImpl){
            VarVectorImpl v1=new VarVectorImpl(this);
            double v2=((VarFloatImpl) var).getValue();
            for (int i=0;i<v1.vector.length;i++){
                v1.vector[i]=v1.vector[i]*v2;
            }
            return v1;
        }
        return super.mul(var);
    }

    /**
     * Деление - первый операнд вектор
     * @param var - второй операнд
     * @return v1 - вектор после произведения
     */
    @Override
    public VarImpl div(VarImpl var) {
        //Второй аргумент - скалярная величина
        if (var instanceof VarFloatImpl) {
            VarVectorImpl v1=new VarVectorImpl(this);
            double v2=((VarFloatImpl) var).getValue();
            for (int i=0;i<v1.vector.length;i++){
                v1.vector[i]=v1.vector[i]/v2;
            }
            return v1;
        }
        return super.div(var);
    }

    //Вспомогательные операции
    @Override
    public String toString() {
        StringBuilder result=new StringBuilder("");
        //System.out.print("Type Vector ");
        result.append('{');
        for (int i=0;i<vector.length;i++){
            result.append(vector[i]);
            if (i!=vector.length-1) {result.append(',');}
        }
        result.append('}');
        return result.toString();
    }

    @Override
    public void setFrom(String str) {

        String [] elem=str.split(",");
        vector=new double[elem.length];
        Pattern p1=Pattern.compile(Patterns.exVal);
        Matcher m1=p1.matcher(str);
        int i=0;
        while (m1.find()) {
            vector[i]=Double.parseDouble(m1.group());
            i++;
        }
    }
}
