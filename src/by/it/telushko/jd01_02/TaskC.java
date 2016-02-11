package by.it.telushko.jd01_02;

public class TaskC {
    public static int[][] taskC(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 2 * n - n);
            }
        }
        InOut.printMatrix(matrix, n);
        return matrix;
    }
    public static void taskC1(int[][] matrix,int size){
        int[]answer=new int[size];
        for (int i = 0; i <size; i++) {
            for (int j = 0; j <size ; j++) {
                if (matrix[i][j]>0){
                    for (int k = j+1; k <size; k++) {
                        if (matrix[i][k]<=0)answer[i]=answer[i]+matrix[i][k];
                        else break;
                    }
                    break;
                }
            }
        }
        for (int i = 0; i <size ; i++) {
            System.out.println(answer[i]);
        }
    }
    public static void taskC2(int[][] matrix,int size){
        int temp;
        for (int i = 0; i <size ; i++) {
            for (int j = i; j <size ; j++) {
                temp=matrix[j][i];
                matrix[j][i]=matrix[i][j];
                matrix[i][j]=temp;
            }
        }
        InOut.printMatrix(matrix,size);
    }
    public static void taskC3(int[][] matrix,int size){
        int [][]matrixTurn90=new int[size][size];
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j <size ; j++) {
                matrixTurn90[i][j]=matrix[j][size-i-1];
            }
        }
        InOut.printMatrix(matrixTurn90,size);
    }
    public static void taskC4(int[][] matrix,int size){
        int [][]matrixAnswer=new int[size][size];
        int []aver=new int[size];
        int sum=0;
        for (int i = 0; i <size; i++) {
            for (int j = 0; j <size ; j++) {
                 sum=sum+matrix[i][j];
            }
            aver[i]=sum/size;
            sum=0;
            System.out.println(aver[i]);
        }
        for (int i = 0; i <size; i++) {
            for (int j = 0; j <size ; j++) {
                matrixAnswer[i][j]=matrix[i][j]-aver[i];
            }
        }
        InOut.printMatrix(matrixAnswer,size);
    }
    public static void taskC5(int[][] matrix,int size){
        int max=MathLib.maxElement(matrix,size,size);   //поиск максимального элемента матрицы
        System.out.println("Максимальный элемент матрицы: "+max+"\nЕго позиции:");
               //массив индексов повторяющихся максимальных элементов
        int maxIndex[][]= new int[size][size];
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j <size ; j++) {
                if (matrix[i][j]==max)maxIndex[i][j]=1;
                else maxIndex[i][j]=0;
            }
        }
        InOut.printMatrix(maxIndex,size); //вывод массива с флагами для наглядности. в алгоритме он не нужен
        // определяем размерность нового массива и создаем его
        boolean flagI=false; // флаг true обозначат, что данную строку или столбец нужно удалить
        boolean flagJ=false;
        int newI=0; // счетчики для заполнения нового массива
        int newJ=0;
        int newIsize=0; //размерность нового массива
        int newJsize=0;
        for (int i = 0; i <size ; i++) { //ищем количество строк
            flagI=false;
            for (int jj = 0; jj <size ; jj++) if(matrix[i][jj]==max){flagI=true;}
            if (!flagI) {
                newI++;
            }
        }
        newIsize=newI;
        for (int j = 0;j <size ; j++) { //ищем количество столбцов
            flagJ=false;
            for (int ii = 0; ii <size ; ii++) if(matrix[ii][j]==max){flagJ=true;}
            if (!flagJ) {
                newJ++;
            }
        }
        newJsize=newJ;
        int[][] matrixAnswer = new int[newI][newJ]; //создаем масив с найденными размерами
        //заполняем новый массив
        newI=0;
        newJ=0;
        for (int i = 0; i <size; i++) {
            flagJ = false;
            for (int jj = 0; jj < size; jj++) {if (matrix[i][jj] == max) flagJ = true;}
            if (!flagJ) {
                for (int j = 0; j < size; j++) {
                    flagI = false;
                    for (int ii = 0; ii < size; ii++) {if (matrix[ii][j] == max) flagI = true;}
                    if (!flagI) {
                        matrixAnswer[newI][newJ] = matrix[i][j];
                        newJ++;
                    }
                }
                newI++;
                newJ=0;
            }
        }
        //выводим новый массив
        System.out.println("Ответ");
        InOut.printMatrix(matrixAnswer,newIsize,newJsize);

    }
    public static void taskC6(int[][] matrix,int size){
        boolean flag=false;
        int minI = 0,minJ = 0;
        int min = MathLib.minElement(matrix,size,size);
        System.out.println(min);
        //найдем впервые попавшийся минимальный элемент, его индексы.
            for (int i = 0; i <size; i++) {
                for (int j = 0; j <size; j++) {
                    if ( matrix[i][j]==min) {
                        minI=i;
                        minJ=j;
                        flag = true;
                        break;
                    }
                }
                if(flag)break;
            }
        System.out.println("Первый попавшийся минимальный элемент: "+min+"["+minI+";"+minJ+"].");
        //переставляем строки
        int temp=0;
        for (int j = 0; j < size; j++) {
            temp=matrix[0][j];
            matrix[0][j]=matrix[minI][j];
            matrix[minI][j]=temp;
        }
        //переставляем столбцы
        for (int i = 0; i < size; i++) {
            temp=matrix[i][0];
            matrix[i][0]=matrix[i][minJ];
            matrix[i][minJ]=temp;
        }
        System.out.println("Ответ");
        InOut.printMatrix(matrix,size);
    }
    public static void taskC7(int matrix[][],int size){
        int temp=0;
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j <size-1 ; j++) {
                for (int k = 0; k <size-1 ; k++) {
                    if(matrix[i][k]==0){
                        temp=matrix[i][k];
                        matrix[i][k]=matrix[i][k+1];
                        matrix[i][k+1]=temp;
                    }
                }
            }
        }
        InOut.printMatrix(matrix,size);
    }


}

