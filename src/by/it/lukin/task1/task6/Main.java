package by.it.lukin.task1.task6;

/**
 * Created by алексей on 14.02.2016.
 */
public class Main {
    public static void main(String[] args){
        int index = 0;
        double []a = new double[20];
        for (double x = 7.0/20.0;x < 7;x = x+7.0/20.0){
            double w = x + Math.sin(x);
            a[index] = w;
            System.out.println("a[" +index+"]="+a[index]);
            index++;
        }
        System.out.println(" ");

        int count = 0;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] > 3) {
                count++;
            }
        }

        double[] b = new double[count];
        int k = 0;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] > 3)
            {
                b[k] = a[i];
                System.out.println("b[" +k+"]="+b[k]);
                k++;
            }
        }


        double sum = 0;
        for (int n = 0; n < b.length;n++){
            sum = sum + b[n];
        }
        System.out.print("\nСумма равна = "+sum);

    }
}
