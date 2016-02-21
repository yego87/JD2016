package by.it.predkel.MatLab.OtherClasses;

/**
 * Created by Admin on 20.02.2016.
 */
public class InverseMatrixJordanGauss {

    public static float[][] Inverse_matrix_jordan_gauss(float[][] A){
        int i,j,k;
        int size=A.length;
        float[][] E = new float[size][size];//единичная матрица
//заполнение единичной матрицы
        for (i=0;i<size;i++){
            for (j=0;j<size;j++){
                if (i==j) E[i][j]=1;
                else E[i][j]=0;
            }
        }
//Задаём номер ведущей строки (сначала 0,1...size)
        for (k=0;k<size;k++){
            for (j=k+1;j<size;j++){
                A[k][j]=A[k][j]/A[k][k];
                //все элементы k-ой строки матрицы A, кроме k-ого и до него, делим на разрешающий элемент - a[k][k]
            }
            for (j=0;j<size;j++){
                E[k][j]=E[k][j]/A[k][k];
                //все элементы k-ой строки матрицы e, делим на разрешающий элемент - a[k][k]
            }
            A[k][k]=A[k][k]/A[k][k];
            //элемент соответствующий  разрещающему - делим на самого себя(т.е получит. 1 )
//идём сверху вниз, обходя k-ую строку
            if (k>0) {//если номер ведущей строки не первый
                for (i=0;i<k;i++){   //строки, находящиеся выше k-ой
                    for (j=0;j<size;j++){
                        E[i][j]=E[i][j]-E[k][j]*A[i][k];
                        //Вычисляем элементы матрицы e,идя по столбцам с 0 -ого  к последнему
                    }
                    for (j=size-1;j>=k;j--){
                        A[i][j]=A[i][j]-A[k][j]*A[i][k];
                        //Вычисляем элементы матрицы a,идя по столбцам с последнего к k-ому
                    }
                }
            }
            for (i=k+1;i<size;i++){   //строки, находящиеся ниже k-ой
                for (j=0;j<size;j++){
                    E[i][j]=E[i][j]-E[k][j]*A[i][k];
                }
                for (j=size-1;j>=k;j--){
                    A[i][j]=A[i][j]-A[k][j]*A[i][k];
                }
            }
        }
        return E;//На месте исходной матрицы должна получиться единичная а на месте единичной - обратная.
    }
}
