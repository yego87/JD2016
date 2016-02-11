package by.it.Baranova.JD01_02_taskC;

import java.util.Scanner;

import static java.lang.System.out;

/**
 * Created by Ekaterina on 2/6/16.
 */
public class ArrayFormate {

    public void FillingArray() {
        Scanner in = new Scanner(System.in);
        out.println("Введите размер матрицы n=");
        int n = in.nextInt();
        int m = 2 * n + 2;
        int numbers[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                numbers[i][j] = ((int) (Math.random() * m - (n+1)));
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(numbers[i][j] + "   ");
            }
            System.out.println();
        }



        int summ = 0;
        for (int i = 0; i < n; i++) {
            int j = 0;
            int counter = 0;
            int position[] = new int[2];
            while (j < n && counter < 2) {
                if (numbers[i][j] > 0) {
                    position[counter] = j;
                    counter = counter + 1;
                }
                j++;
            }
            if (position[0] < position[1]) {
                for (int k = position[0] + 1; k < position[1]; k++) {
                    summ = summ + numbers[i][k];
                }
            }
        }
        System.out.println("Сумма элементов  " + summ);

        //Поиск транспонированной матрицы
        System.out.println("Транспонированная матрица");
        int transp_numbers[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transp_numbers[i][j] = numbers[j][i];
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(transp_numbers[i][j]+"  ");
            }
            System.out.println();
        }

        //Поиск матрицы, перевернутой на 90 градусов
        System.out.println("Матрица повернутая на 90 градусов");
        int numbers90[][] = new int[n][n];
        for (int j = n - 1; j >= 0; --j) {
                    for (int i = 0; i < n; i++)
                        numbers90[n - j - 1][i] = numbers[i][j];
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(numbers90[i][j] + "   ");
            }
            System.out.println();
        }
        //Удаление строк и столбцов с максимальным элементом
        System.out.println("Массив, с удаленными строками и столбцами");
        int maxelement=numbers[0][0];
        for (int i = 0; i < n; i++) {
           for (int j = 0; j < n; j++) {
                if (numbers[i][j]>maxelement){maxelement = numbers[i][j];}
            }
        }
        int kol=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (numbers[i][j] == maxelement) {
                    kol++;
                }
            }
        }

        int positionj[]=new int[n];
        int positioni[]=new int[n];
        for (int i = 0; i <n ; i++) {
            positioni[i]=0;
            positionj[i]=0;
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (numbers[i][j]==maxelement){positioni[i]=1;positionj[j]=1;}
            }
        }

        int koli=0;
        for (int i = 0; i <n; i++) {
            if (positioni[i]==1) {koli++;}
        }
        int kolj=0;
        for (int i = 0; i <n; i++) {
            if (positionj[i] == 1) {
                kolj++;
            }
        }

        int maxnumbers[][]=new int [n-koli][n-kolj];
        int inew=0;
        for (int i=0;i<n;i++){
            int jnew=0;
            for (int j=0;j<n;j++){

                if (positionj[j]==0&&positioni[i]==0){
                    maxnumbers[inew][jnew]=numbers[i][j];
                    jnew++;
                }
            }
         if (positioni[i]==0){inew++;}
        }

        for (int i = 0; i < n-koli; i++) {
            for (int j = 0; j < n-kolj; j++) {
                System.out.print(maxnumbers[i][j] + "   ");
            }
            System.out.println();
        }

        //Построение новой матрицы
        System.out.println("Новая матрица");
        int newnumbers[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            int summ1 = 0;
            for (int j = 0; j < n; j++){
                summ1 = summ1 + numbers[i][j];}
            int average = summ1 / n;
            for (int j = 0; j < n; j++){
                newnumbers[i][j] = numbers[i][j] - average;}
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(newnumbers[i][j] + "   ");
            }
            System.out.println();
        }

        //Нахождение мин элемента и перенесение его на позицию [1,1]
        System.out.println("Матрица с min элементом на позиции [1,1]");
        int minelement=numbers[0][0];
        int iposition=0;
        int jposition=0;
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                if (numbers[i][j] < minelement) {
                    minelement = numbers[i][j];
                    iposition = i;
                    jposition = j;
                }
            }
        }

        int minnumbers[][]=new int [n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                minnumbers[i][j]=numbers[i][j];
            }
        }
        for (int j=0;j<n;j++) {
            int addelement = minnumbers[1][j];
            minnumbers[1][j] = minnumbers[iposition][j];
            minnumbers[iposition][j] = addelement;
        }

        for (int i=0;i<n;i++) {
            int addelement = minnumbers[i][1];
            minnumbers[i][1] = minnumbers[i][jposition];
            minnumbers[i][jposition] = addelement;
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(minnumbers[i][j] + "   ");
            }
            System.out.println();
        }

        // Матрица, нули располагаются после остальных элементов
        System.out.println("Матрица с 0 в конце");
        int zeronumbers[][]=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                zeronumbers[i][j] = numbers[i][j];
            }
        }

        System.out.println();
        for (int i=0;i<n;i++){
            int j=0;
            while (j<n-1){
                if (zeronumbers[i][j]==0&&zeronumbers[i][j+1]!=0) {
                    int extraposition;
                    extraposition = zeronumbers[i][j];
                    zeronumbers[i][j] = zeronumbers[i][j + 1];
                    zeronumbers[i][j + 1] = extraposition;
                }
                if (zeronumbers[i][j]==0&&zeronumbers[i][j+1]==0){
                    int k=j+1;
                    while (k<n-1){
                        if (zeronumbers[i][k]==0){k++;}
                        if (zeronumbers[i][k]!=0){
                            int addposition=zeronumbers[i][k];
                            zeronumbers[i][k]=zeronumbers[i][j];
                            zeronumbers[i][j]=addposition;
                            k=n-1;
                        }
                    }

                }
                j++;
            }

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(zeronumbers[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
