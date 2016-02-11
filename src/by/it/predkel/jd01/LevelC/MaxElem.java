package by.it.predkel.jd01.LevelC;

/**
 * нахождение максимального элемента массива и удаление строк и столбцов их содержащие
 */
public class MaxElem {
    public static void maxElem(int[][] mass) {
        int[][] massi=new int[mass.length][mass.length];
        int[][] massj=new int[mass.length][mass.length];
        int max = mass[0][0];

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                if (max < mass[i][j])
                    max = mass[i][j];
            }
        }

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                if (max == mass[i][j]) {
                    for (int k = 0; k < mass.length; k++)
                        massi[i][k] = 1;
                    for (int l = 0; l < mass.length; l++)
                        massi[l][j] = 1;
                }
            }
        }System.out.print("max"+max);
        for (int i=0; i<mass.length; i++){
            for (int j=0; j<mass.length; j++){
                if ((massi[i][j]==massj[i][j])&&(mass[i][j]==0))
                    System.out.printf("%4d",mass[i][j]);
            }
            System.out.println();
        }
        /*
        int countmax = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                if (max == mass[i][j])
                    countmax++;
            }
        }
        int k=0;
        int[][] massmax = new int[countmax][2];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                if (max == mass[i][j]){
                    boolean checker=true;
                    for (int l = 0; l < massmax.length; l++) {
                        if (massmax[l][1]==i)
                            checker=false;
                    }
                    if (checker){
                        massmax[k][1]=i;
                        k++;
                    }
                    boolean checker1=true;
                    for (int l = 0; l < massmax.length; l++) {
                        if (massmax[l][2]==i)
                            checker1=false;
                    }
                    if (checker1){
                        massmax[k][2]=i;
                        k++;
                    }
                    else
                }
        }

        }*/
    }
}