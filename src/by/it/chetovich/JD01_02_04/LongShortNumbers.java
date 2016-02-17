package by.it.chetovich.JD01_02_04;

/**
 * Created by Yultos_ on 03.02.2016.
 */
public class LongShortNumbers {
    public void searchLongShort (String [] array)
    {
        String max = array[0];
        String min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].length()>max.length()) max=array[i];
            if (array[i].length()<min.length()) min=array[i];
        }
        System.out.println("The shortest number is "+min + " its length is "+min.length());
        System.out.println("The longest number is "+max + " its length is "+max.length());
    }
}
