package by.it.predkel.MatLab;

import by.it.predkel.MatLab.OtherClasses.InputExpression;
import java.io.IOException;
import static by.it.predkel.MatLab.OtherClasses.InverseMatrixJordanGauss.Inverse_matrix_jordan_gauss;

/**
 * Created by Admin on 20.02.2016.
 */
public class MatrixVar extends Var {

    double[][] val;

    public MatrixVar(double[][] val){
        this.val=val;
    }

    public MatrixVar(String str) throws IOException {
        setForm(str);
    }

    ////////операции\\\\\\\\\

    @Override
    public Var add (Var value){
        if (value instanceof FloatVar) {//матрица+число
            for (int i = 0; i < this.val.length; i++) {
                for (int j = 0; j < this.val[i].length; j++) {
                    this.val[i][j] += ((FloatVar) value).val;
                }
            }
            return this;
        }
        MatrixVar v1 = (MatrixVar)value;
        if ((this.val.length!=v1.val.length)||(this.val[0].length!=v1.val[0].length)){
            System.out.println("Эти массивы складывать нельзя");
            return null;
        }
        for (int i=0;i<this.val.length;i++){//матрица+матрица
            for (int j=0;j<this.val[i].length;j++){
                this.val[i][j]+=((MatrixVar)value).val[i][j];
            }
        }
        return this;
    }

    @Override
    public Var mul (Var value) {
        if (value instanceof FloatVar) {//матрица*число
            for (int i = 0; i < this.val.length; i++) {
                for (int j = 0; j < this.val[i].length; j++) {
                    this.val[i][j] *= ((FloatVar) value).val;
                }
            }
            return this;
        }else if (checkMatrixToMul(this, (MatrixVar) value)) {
            double[][] temp = new double[this.val.length][((MatrixVar) value).val[0].length];//матрица*матрица
            for (int i = 0; i < this.val.length; i++) {
                for (int j = 0; j < ((MatrixVar) value).val[0].length; j++) {
                    for (int k = 0; k < ((MatrixVar) value).val.length; k++) {
                        temp[i][j] = temp[i][j] + this.val[i][k] * ((MatrixVar) value).val[k][j];
                    }
                }
            }
            return new MatrixVar(temp);

        }else if (checkMatrixToMul((MatrixVar) value, this)){
            double[][] temp = new double[((MatrixVar) value).val.length][this.val[0].length];//матрица*матрица
            for (int i = 0; i < ((MatrixVar) value).val.length; i++) {
                for (int j = 0; j < this.val[0].length; j++) {
                    for (int k = 0; k < this.val.length; k++) {
                        temp[i][j] = temp[i][j] + ((MatrixVar) value).val[i][k] * this.val[k][j];
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
            for (int i = 0; i < this.val.length; i++) {
                for (int j = 0; j < this.val[i].length; j++) {
                    this.val[i][j]-=((FloatVar)value).val;
                }
            }
            return this;
        }
        MatrixVar v1 = (MatrixVar)value;
        if ((this.val.length!=v1.val.length)||(this.val[0].length!=v1.val[0].length)){
            System.out.println("Эти массивы складывать нельзя");
            return null;
        }
        for (int i=0;i<this.val.length;i++){//матрица-матрица
            for (int j=0;j<this.val[i].length;j++){
                this.val[i][j]-=((MatrixVar)value).val[i][j];
            }
        }
        return this;
    }

    @Override
    public Var div (Var value) {
        if (value instanceof FloatVar) {//матрица/число
            for (int i = 0; i < this.val.length; i++) {
                for (int j = 0; j < this.val[i].length; j++) {
                    this.val[i][j] /= ((FloatVar) value).val;
                }
            }
            return this;
        } else if (checkMatrixToMul(this, (MatrixVar) value)) {
            double[][] value1 = Inverse_matrix_jordan_gauss(((MatrixVar) value).val);//создание обратной матрицы
            double[][] temp = new double[this.val.length][value1[0].length];//матрица/матрица
            for (int i = 0; i < this.val.length; i++) {
                for (int j = 0; j < value1[0].length; j++) {
                    for (int k = 0; k < value1.length; k++) {
                        temp[i][j] = temp[i][j] + this.val[i][k] * value1[k][j];
                    }
                }
            }
            return new MatrixVar(temp);

        } else if (checkMatrixToMul((MatrixVar) value, this)) {
            double[][] value1 = Inverse_matrix_jordan_gauss(this.val);//создание обратной матрицы
            double[][] temp = new double[value1.length][((MatrixVar) value).val[0].length];//матрица/матрица
            for (int i = 0; i < value1.length; i++) {
                for (int j = 0; j < ((MatrixVar) value).val[0].length; j++) {
                    for (int k = 0; k < ((MatrixVar) value).val.length; k++) {
                        temp[i][j] = temp[i][j] + value1[i][k] * ((MatrixVar) value).val[k][j];
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
    @Override
    public void outPut(){
        for (int i=0;i<val.length;i++){
            for (int j=0;j<val[i].length;j++)
                System.out.print(this.val[i][j]+" ");
            System.out.println();
        }
    }

    @Override
    public void setForm(String str) throws IOException {
        val = InputExpression.inputMatrix(str);
    }

    @Override
    public int intValue() {
        return (int)this.val[0][0];
    }

    @Override
    public long longValue() {
        return (long)this.val[0][0];
    }

    @Override
    public float floatValue() {
        return (float) this.val[0][0];
    }

    @Override
    public double doubleValue() {
        return this.val[0][0];
    }
}
