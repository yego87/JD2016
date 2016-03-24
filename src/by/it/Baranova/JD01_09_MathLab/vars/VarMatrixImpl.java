package by.it.Baranova.JD01_09_MathLab.vars;

import by.it.Baranova.JD01_09_MathLab.Exceptions.DifferentSizesException;
import by.it.Baranova.JD01_09_MathLab.Int.ICalculations;
import by.it.Baranova.JD01_09_MathLab.Int.IVariable;
import by.it.Baranova.JD01_09_MathLab.Log;
import by.it.Baranova.JD01_09_MathLab.Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VarMatrixImpl extends VarImpl implements ICalculations,IVariable {


    public double[][] getMatrix() {
        return matrix;
    }

    //Конструкторы
    private double [][] matrix;

    public VarMatrixImpl(String str){
        setFrom(str);
    }

    VarMatrixImpl(double [][] matrix){
        this.matrix=new double[matrix.length][matrix[0].length];
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                this.matrix[i][j]=matrix[i][j];
            }
        }
    }

    VarMatrixImpl(VarMatrixImpl init){
        this.matrix=new double[init.matrix.length][init.matrix[0].length];
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                this.matrix[i][j]=init.matrix[i][j];
            }
        }
    }

    //Операции

    /**
     * Сложение - первый операнд- матрица
     * @param var - второй операнд
     * @return v1- матрица после операции сложения
     */
    @Override
    public VarImpl add(VarImpl var) {
        Log log=Log.getInstance();
        //Второй операнд - скалярная величина
        if (var instanceof VarFloatImpl){
            VarMatrixImpl v1=new VarMatrixImpl(this);
            double v2=((VarFloatImpl) var).getValue();
            for (int i=0;i<v1.matrix.length;i++) {
                for (int j = 0; j < v1.matrix[0].length; j++) {
                    v1.matrix[i][j] = v1.matrix[i][j] + v2;
                }
            }
            return v1;
        }
        //Второй операнд - матрица
        try {
            if (var instanceof VarMatrixImpl &&((VarMatrixImpl) var).matrix.length!=this.matrix.length&&
                    ((VarMatrixImpl)var).matrix[0].length!=this.matrix[0].length) {
                    throw new DifferentSizesException("Матрицы имеют размер, не подходящий для сложения");
            }
            if (var instanceof VarMatrixImpl && ((VarMatrixImpl) var).matrix.length == this.matrix.length) {
                VarMatrixImpl v1 = new VarMatrixImpl(this);
                VarMatrixImpl v2 = (VarMatrixImpl) var;
                for (int i = 0; i < v1.matrix.length; i++) {
                    for (int j = 0; j < v1.matrix[0].length; j++) {
                        v1.matrix[i][j] = v1.matrix[i][j] + v2.matrix[i][j];
                    }
                }
                return v1;
            }
        }catch (DifferentSizesException e){
            System.out.println("Матрицы имеют размер, не подходящую для сложения");
            log.saveLog("Введены матрицы с размерами,не подходящими для сложения");
        }
        return super.add(var);
    }


    /**
     * Вычитание - первый операнд- матрица
     * @param var - второй операнд
     * @return v1 - матрица после операции вычитания
     */
    @Override
    public VarImpl sub(VarImpl var) {
        Log log=Log.getInstance();
        //второй операнд - матрица
        try {
            if (var instanceof VarMatrixImpl &&((VarMatrixImpl) var).matrix.length != this.matrix.length&&
                    ((VarMatrixImpl)var).matrix[0].length!=this.matrix[0].length) {
                throw new DifferentSizesException("Матрицы имеют размер, не подходящую для вычитания");
            }
            if (var instanceof VarMatrixImpl && ((VarMatrixImpl) var).matrix.length == this.matrix.length) {
                VarMatrixImpl v1 = new VarMatrixImpl(this);
                VarMatrixImpl v2 = (VarMatrixImpl) var;
                for (int i = 0; i < v1.matrix.length; i++) {
                    for (int j = 0; j < v1.matrix[0].length; j++) {
                        v1.matrix[i][j] = v1.matrix[i][j] - v2.matrix[i][j];
                    }
                }
                return v1;
            }
        } catch (DifferentSizesException e){
            log.saveLog("Введены матрицы с размерами,не подходящими для вычитания");
        }
        return super.sub(var);
    }


    /**
     * Умножение - первый операнд матрица
     * @param var - второй операнд
     * @return матрица после операции умножения
     */
    @Override
    public VarImpl mul(VarImpl var) {
        Log log=Log.getInstance();
        //Второй операнд - скалярная величина
        if (var  instanceof VarFloatImpl){
            VarMatrixImpl v1 = new VarMatrixImpl(this);
            double v2 = ((VarFloatImpl) var).getValue();
            for (int i = 0; i < v1.matrix.length; i++) {
                for (int j = 0; j < v1.matrix[0].length; j++) {
                    v1.matrix[i][j] = v1.matrix[i][j]*v2;
                }
            }
            return v1;
        }
        //Второй операнд - матрица

        try {
            if (var instanceof VarMatrixImpl &&((VarMatrixImpl) var).matrix.length != this.matrix[0].length) {
                throw new DifferentSizesException("Матрицы имеют размер, не подходящий для умножения");
            }
            if (var instanceof VarMatrixImpl && ((VarMatrixImpl) var).matrix.length == this.matrix[0].length) {
                VarMatrixImpl v1 = new VarMatrixImpl(this);
                VarMatrixImpl v2 = (VarMatrixImpl) var;
                double[][] z = new double[v1.matrix.length][v2.matrix[0].length];
                for (int i = 0; i < v1.matrix.length; i++) {
                    for (int j = 0; j < v2.matrix[0].length; j++) {
                        for (int k = 0; k < v2.matrix.length; k++) {
                            z[i][j] = z[i][j] + v1.matrix[i][k] * v2.matrix[k][j];
                        }
                    }
                }
                return new VarMatrixImpl(z);
            }
        } catch (DifferentSizesException e){
            log.saveLog("Введены матрицы с размерами,не подходящими для умножения");

        }
        //Второй операнд - вектор
        if (var instanceof VarVectorImpl){
            VarMatrixImpl v1=new VarMatrixImpl(this);
            VarVectorImpl v2=new VarVectorImpl((VarVectorImpl)var);
            double [] z=new double[v1.matrix.length];
            for (int i=0;i<v1.matrix.length;i++) {
                    for (int k = 0; k < v2.getVector().length; k++) {
                        z[i] = z[i] + v1.matrix[i][k] * v2.getVector()[k];
                    }
            }

            return new VarVectorImpl(z);
        }

        return super.mul(var);
    }


    /**
     * Деление - первый операнд матрица
     * @param var - второй операнд
     * @return v1 - матрица после деления
     */
    @Override
    public VarImpl div(VarImpl var) {
        //Второй операнд - скалярная величина
        if (var  instanceof VarFloatImpl){
            VarMatrixImpl v1 = new VarMatrixImpl(this);
            double v2 = ((VarFloatImpl) var).getValue();
            for (int i = 0; i < v1.matrix.length; i++) {
                for (int j = 0; j < v1.matrix[0].length; j++) {
                    v1.matrix[i][j] = v1.matrix[i][j] / v2;
                }
            }
            return v1;
        }

        return super.div(var);
    }

    //Вспомогательные операции
    @Override
    public String toString() {
        //System.out.println("Type matrix");
        StringBuilder result=new StringBuilder("{");
        for (int i=0;i<matrix.length;i++){
            result.append('{');
            for (int j=0;j<matrix[i].length;j++) {
                result.append(matrix[i][j]);
                if (j!=matrix[i].length-1){
                    result.append(",");
                }
            }
           result.append('}');
            if (i!=matrix.length-1){result.append(",");}
        }
        result.append("}");
        return result.toString();
    }

    @Override
    public void setFrom(String str) {
        Matcher m1=Pattern.compile("}").matcher(str);
        int koli=0;
        while ( m1.find()){
            koli++;
        }
        koli--;
        Matcher m2=Pattern.compile(",").matcher(str);
        int kol=0;
        while ( m2.find()){
            kol++;
        }
        int kolj=(kol+koli)/koli;
        matrix=new double[koli][kolj];
        Pattern p3=Pattern.compile(Patterns.exVal);
        Matcher m3=p3.matcher(str);
        int i=0;int j=0;
        while (m3.find()&&i<(koli)&&j<kolj) {
            matrix[i][j]=Double.parseDouble(m3.group());
            j++;
            if (j==kolj){
                j=0;
                i++;
            }
        }

    }
}
