package by.it.zebnitskiy.JD_01.JD_01work.zadacha_12;

/**
 * Created by Зебницкий Максим on 2/19/2016.
 */
public class zadacha_12 {
    public static void main(String[] args){
        int []  arr = {1, 2 ,3 ,4 ,5, 10 ,9 ,8 ,7, 6};
        int index = 0;
        int max = 0;
        for (int i = 0; i < arr.length ; i ++){
            if (max <arr[i]){
                max = arr[i];
                index = i +1;
            }
        }
        System.out.println("marks = " + max+","+ "  index = " + index+ ";");
    }
}
