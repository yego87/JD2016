package by.it.chetovich.JD01_02_04;

/**
 * Created by Yultos_ on 04.02.2016.
 */
public class C1MatrixSumBetweenPositiv {
    public boolean sumBetweenPositiv (int [][]array){

        for (int i = 0; i < array.length; i++) {
            System.out.print("Sum between first positive elements of " + i + " line: ");
            searhForPositive(array[i]);
        }

    return true;
    }

    private boolean searhForPositive (int [] array){
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>0) {
                sum+=array[i];
                if (i!=array.length-1) {
                    do {
                        i++;
                        sum += array[i];
                    } while (array[i] < 0);
                }
                System.out.println(sum);
                return true;
            }


        }
        System.out.println("There are no positive elements");
        return false;

    }

}
