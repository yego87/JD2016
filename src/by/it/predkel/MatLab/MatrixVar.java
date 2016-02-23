package by.it.predkel.MatLab;

import static by.it.predkel.MatLab.OtherClasses.InverseMatrixJordanGauss.Inverse_matrix_jordan_gauss;

/**
 * Created by Admin on 20.02.2016.
 */
public class MatrixVar extends Var {

    float[][] matrix;

    public MatrixVar(float[][] matrix){
        this.matrix=matrix;
    }
/*
    @Override
    public MatrixVar addFloat(FloatVar value) {//матрица+число
        for (int i=0;i<this.matrix.length;i++) {
            for (int j=0;j<this.matrix[i].length;j++){
                this.matrix[i][j]+=value.val;
            }
        }
        return this;
    }
    @Override
    public MatrixVar addMatrix(MatrixVar value) {//матрица+матрица
        for (int i=0;i<this.matrix.length;i++){
            for (int j=0;j<this.matrix[i].length;j++){
                this.matrix[i][j]+=value.matrix[i][j];
            }
        }
        return this;
    }
    @Override
    public MatrixVar mulFloat(FloatVar value) {//матрица*число
        for (int i=0;i<this.matrix.length;i++) {
            for (int j=0;j<this.matrix[i].length;j++){
                this.matrix[i][j]*=value.val;
            }
        }
        return this;
    }
    @Override
    public MatrixVar mulMatrix(MatrixVar value) {//матрица*матрица
        float[][] temp=new float[this.matrix.length][value.matrix[0].length];
        for (int i=0;i<this.matrix.length;i++) {
            for (int j=0;j<value.matrix[0].length;j++) {
                for (int k = 0; k < value.matrix.length; k++) {
                    temp[i][j]=temp[i][j]+this.matrix[i][k]*value.matrix[k][j];
                }
            }
        }
        return new MatrixVar(temp);
    }
    @Override
    public MatrixVar robFloat(FloatVar value){//матрица-число
        for (int i=0;i<this.matrix.length;i++) {
            for (int j=0;j<this.matrix[i].length;j++){
                this.matrix[i][j]-=value.val;
            }
        }
        return this;
    }
    @Override
    public MatrixVar robMatrix(MatrixVar value){//матрица-матрица
        for (int i=0;i<this.matrix.length;i++){
            for (int j=0;j<this.matrix[i].length;j++){
                this.matrix[i][j]-=value.matrix[i][j];
            }
        }
        return this;
    }
    @Override
    public MatrixVar divMatrix(MatrixVar value){//матрица/матрица
        float[][] value1=Inverse_matrix_jordan_gauss(value.matrix);//создание обратной матрицы
        float[][] temp=new float[this.matrix.length][value1[0].length];
        for (int i=0;i<this.matrix.length;i++) {
            for (int j=0;j<value1[0].length;j++) {
                for (int k = 0; k < value1.length; k++) {
                    temp[i][j]=temp[i][j]+this.matrix[i][k]*value1[k][j];
                }
            }
        }
        return new MatrixVar(temp);
    }
*/
    public void outPut(){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++)
                System.out.print(this.matrix[i][j]);
        }
        System.out.println();
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
            float[][] temp = new float[this.matrix.length][((MatrixVar) value).matrix[0].length];//матрица*матрица
            for (int i = 0; i < this.matrix.length; i++) {
                for (int j = 0; j < ((MatrixVar) value).matrix[0].length; j++) {
                    for (int k = 0; k < ((MatrixVar) value).matrix.length; k++) {
                        temp[i][j] = temp[i][j] + this.matrix[i][k] * ((MatrixVar) value).matrix[k][j];
                    }
                }
            }
            return new MatrixVar(temp);

        }else if (checkMatrixToMul((MatrixVar) value, this)){
            float[][] temp = new float[((MatrixVar) value).matrix.length][this.matrix[0].length];//матрица*матрица
            for (int i = 0; i < ((MatrixVar) value).matrix.length; i++) {
                for (int j = 0; j < this.matrix[0].length; j++) {
                    for (int k = 0; k < this.matrix.length; k++) {
                        temp[i][j] = temp[i][j] + ((MatrixVar) value).matrix[i][k] * this.matrix[k][j];
                    }
                }
            }
            return new MatrixVar(temp);
        }else{
            System.out.print("Эти матрицы перемножить нельзя");
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
            float[][] value1 = Inverse_matrix_jordan_gauss(((MatrixVar) value).matrix);//создание обратной матрицы
            float[][] temp = new float[this.matrix.length][value1[0].length];//матрица/матрица
            for (int i = 0; i < this.matrix.length; i++) {
                for (int j = 0; j < value1[0].length; j++) {
                    for (int k = 0; k < value1.length; k++) {
                        temp[i][j] = temp[i][j] + this.matrix[i][k] * value1[k][j];
                    }
                }
            }
            return new MatrixVar(temp);

        } else if (checkMatrixToMul((MatrixVar) value, this)) {
            float[][] value1 = Inverse_matrix_jordan_gauss(this.matrix);//создание обратной матрицы
            float[][] temp = new float[value1.length][((MatrixVar) value).matrix[0].length];//матрица/матрица
            for (int i = 0; i < value1.length; i++) {
                for (int j = 0; j < ((MatrixVar) value).matrix[0].length; j++) {
                    for (int k = 0; k < ((MatrixVar) value).matrix.length; k++) {
                        temp[i][j] = temp[i][j] + value1[i][k] * ((MatrixVar) value).matrix[k][j];
                    }
                }
            }
            return new MatrixVar(temp);
        } else {
            System.out.print("Эти матрицы делить нельзя");
        }
        return null;
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
        return this.matrix[0][0];
    }

    @Override
    public double doubleValue() {
        return (double) this.matrix[0][0];
    }
}
