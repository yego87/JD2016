package by.it.zebnitskiy.JD_01.JD_01_02.Array_2_B;

/**
 * Created by Зебницкий Максим on 2/10/2016.
 */
public class ArrayB {
    public static void main(String[] args){

        int max[] = {0, 1, 2, 3, 4, 5, 6, 7, 8   };
        for( int j =0; j<max.length; j++){
            if ((j+1)%3!=0)
                System.out.print(max[j]);
            else{
                System.out.println(max[j]);
            }

        }
    }
}
