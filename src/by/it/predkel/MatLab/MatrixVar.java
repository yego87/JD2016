package by.it.predkel.MatLab;

import by.it.akhmelev.JD01_07.matrixOk.Matrix;

import java.io.IOException;


import static by.it.predkel.MatLab.OtherClasses.InverseMatrixJordanGauss.Inverse_matrix_jordan_gauss;

/**
 * Created by Admin on 20.02.2016.
 */
public class MatrixVar extends Var {

    double[][] matrix;

    public MatrixVar(double[][] matrix){
        this.matrix=matrix;
    }

    public MatrixVar(String str) throws IOException {
        setForm(str);
    }


    ////////операции\\\\\\\\\

    @Override
    public Var add (Var value){
        if (value instanceof FloatVar) {//матрица+число
            for (int i = 0; i < this.matrix.length; i++) {
                for (int j = 0; j < this.matrix[i].length; j++) {
                    this.matrix[i][j] += ((FloatVar) value).val;
                }
            }
            return this;
        }
        MatrixVar v1 = (MatrixVar)value;
        if ((this.matrix.length!=v1.matrix.length)||(this.matrix[0].length!=v1.matrix[0].length)){
            System.out.println("Эти массивы складывать нельзя");
            return null;
        }
        for (int i=0;i<this.matrix.length;i++){//матрица+матрица
            for (int j=0;j<this.matrix[i].length;j++){
                this.matrix[i][j]+=((MatrixVar)value).matrix[i][j];
            }
        }
        return this;
    }

    @Override
    public Var mul (Var value) {
        if (value instanceof FloatVar) {//матрица*число
            for (int i = 0; i < this.matrix.length; i++) {
                for (int j = 0; j < this.matrix[i].length; j++) {
                    this.matrix[i][j] *= ((FloatVar) value).val;
                }
            }
            return this;
        }else if (checkMatrixToMul(this, (MatrixVar) value)) {
            double[][] temp = new double[this.matrix.length][((MatrixVar) value).matrix[0].length];//матрица*матрица
            for (int i = 0; i < this.matrix.length; i++) {
                for (int j = 0; j < ((MatrixVar) value).matrix[0].length; j++) {
                    for (int k = 0; k < ((MatrixVar) value).matrix.length; k++) {
                        temp[i][j] = temp[i][j] + this.matrix[i][k] * ((MatrixVar) value).matrix[k][j];
                    }
                }
            }
            return new MatrixVar(temp);

        }else if (checkMatrixToMul((MatrixVar) value, this)){
            double[][] temp = new double[((MatrixVar) value).matrix.length][this.matrix[0].length];//матрица*матрица
            for (int i = 0; i < ((MatrixVar) value).matrix.length; i++) {
                for (int j = 0; j < this.matrix[0].length; j++) {
                    for (int k = 0; k < this.matrix.length; k++) {
                        temp[i][j] = temp[i][j] + ((MatrixVar) value).matrix[i][k] * this.matrix[k][j];
                    }
                }
            }
            return new MatrixVar(temp);
        }else{
            System.out.println("Эти матрицы перемножить нельзя");
        }
        return null;
    }

    @Override
    public Var sub (Var value){
        if (value instanceof FloatVar) {//матрица-число
            for (int i = 0; i < this.matrix.length; i++) {
                for (int j = 0; j < this.matrix[i].length; j++) {
                    this.matrix[i][j]-=((FloatVar)value).val;
                }
            }
            return this;
        }
        MatrixVar v1 = (MatrixVar)value;
        if ((this.matrix.length!=v1.matrix.length)||(this.matrix[0].length!=v1.matrix[0].length)){
            System.out.println("Эти массивы складывать нельзя");
            return null;
        }
        for (int i=0;i<this.matrix.length;i++){//матрица-матрица
            for (int j=0;j<this.matrix[i].length;j++){
                this.matrix[i][j]-=((MatrixVar)value).matrix[i][j];
            }
        }
        return this;
    }

    @Override
    public Var div (Var value) {
        if (value instanceof FloatVar) {//матрица/число
            for (int i = 0; i < this.matrix.length; i++) {
                for (int j = 0; j < this.matrix[i].length; j++) {
                    this.matrix[i][j] /= ((FloatVar) value).val;
                }
            }
            return this;
        } else if (checkMatrixToMul(this, (MatrixVar) value)) {
            double[][] value1 = Inverse_matrix_jordan_gauss(((MatrixVar) value).matrix);//создание обратной матрицы
            double[][] temp = new double[this.matrix.length][value1[0].length];//матрица/матрица
            for (int i = 0; i < this.matrix.length; i++) {
                for (int j = 0; j < value1[0].length; j++) {
                    for (int k = 0; k < value1.length; k++) {
                        temp[i][j] = temp[i][j] + this.matrix[i][k] * value1[k][j];
                    }
                }
            }
            return new MatrixVar(temp);

        } else if (checkMatrixToMul((MatrixVar) value, this)) {
            double[][] value1 = Inverse_matrix_jordan_gauss(this.matrix);//создание обратной матрицы
            double[][] temp = new double[value1.length][((MatrixVar) value).matrix[0].length];//матрица/матрица
            for (int i = 0; i < value1.length; i++) {
                for (int j = 0; j < ((MatrixVar) value).matrix[0].length; j++) {
                    for (int k = 0; k < ((MatrixVar) value).matrix.length; k++) {
                        temp[i][j] = temp[i][j] + value1[i][k] * ((MatrixVar) value).matrix[k][j];
                    }
                }
            }
            return new MatrixVar(temp);
        } else {
            System.out.println("Эти матрицы делить нельзя");
        }
        return null;
    }

    ////////////////доп. методы\\\\\\\\\\\\\\\\\

    public void outPut(){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++)
                System.out.print(this.matrix[i][j]+" ");
        }
        System.out.println();
    }

    @Override
    public void setForm(String str) throws IOException {
            matrix = InputExpression.inputMatrix(str);
    }

    @Override
    public int intValue() {
        return (int)this.matrix[0][0];
    }

    @Override
    public long longValue() {
        return (long)this.matrix[0][0];
    }

    @Override
    public float floatValue() {
        return (float) this.matrix[0][0];
    }

    @Override
    public double doubleValue() {
        return this.matrix[0][0];
    }
}
