package by.it.zebnitskiy.JD_01.JD_01_02.Array_1_B;

/**
 * Created by Зебницкий Максим on 2/10/2016.
 */
public class Array_2 {
    public static void main(String[] args){
        String maxArray[] = {"n", "m"};
        int k =7, n=6, m=8;
        if (k >= n && k<= m  ){
            System.out.println(k + " Принадлежит" + "[n;m]");
        }else{
            System.out.println("не принадлежит" +k);
        }
    }
}

