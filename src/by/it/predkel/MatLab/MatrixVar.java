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
