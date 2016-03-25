package by.it.zhuravlyov.JD01_15;

/**
 * Created by user_2 on 04.03.2016.
 */
public class TaskA {
    public static void main(String[]args){
         int[][]matrix;
        matrix= new int[4][4];
        for( int i=0; i<matrix.length;i++){
        for(int j=0; j<matrix.length;j++){
                matrix[i][j]=(int)(-15+Math.random()*15+15);
                System.out.print(matrix[i][j]+" ");
            }
            }
        for (int i=0;i < matrix.length;i++,System.out.println()){
            for (int j=0;j < matrix[i].length;j++){
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }

    }
}
