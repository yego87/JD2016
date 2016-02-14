package by.it.podelstchikova.jd05;


public class Task4{
    public static void printValue()
    {   double m=1.0;

        for (double i=2 ;i<=3.1;i+=0.1)
        {
            for (int d = 23; d <= 39; d++)
            {
                m*=Math.log(d-i);

            }
            System.out.printf("t= %f \t m=%5.2f \n",i,m);
        }
    }

}
