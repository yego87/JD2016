package by.it.chetovich.JD01_02_04;

/**
 * Created by Yultos_ on 03.02.2016.
 */
public class A2AverageLength {
    public void averageLength (String [] array)
    {
        int length = 0;
        for (int i = 0; i <array.length ; i++)
        {
            length+=array[i].length();
        }

        int averageLength = length/array.length;
        System.out.print("Numbers longer than average are ");
        for (int i = 0; i < array.length; i++) {
            if (array[i].length()>averageLength) System.out.print(array[i]+" ");
        }
        System.out.print("Numbers shorter than average or equal are ");
        for (int i = 0; i < array.length; i++) {
            if (array[i].length()<=averageLength) System.out.print(array[i]+" ");
        }
    }
}
