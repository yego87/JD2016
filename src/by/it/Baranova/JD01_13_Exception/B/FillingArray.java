package by.it.Baranova.JD01_13_Exception.B;

/**
 * Created by Ekaterina on 3/3/16.
 */
public class FillingArray {
    public static void fillingArray(int n) throws NegativeArraySizeException,NegativeNumberException {
        System.out.println("Начало: заполнение массива числами от 1 до n");
        try {
            Integer[] numbers=new Integer[n];
            for (int i = 0; i <n ; i++) {
                numbers[i]=(int)(Math.random()*(2*n)-n);
            }
            for (int i=0;i<n;i++){
                System.out.print(numbers[i]+"  ");
            }
            System.out.println();
            FindingSqrt.findingSqrt(numbers);
        } catch (NegativeArraySizeException e) {
            throw e;
        }
        System.out.println("Конец: заполнениe массива");
    }
}
