package by.it.chetovich.JD01_05Math;

/**
 * Created by Yultos_ on 10.02.2016.
 */
public class Task5 {
    public void searchY (double r){
        double y = 0;
        double z = 0;
        for (double p = -2; p < 15; p+=1.5) {
            if ((p-1)<0)  z = p - 3.18*Math.cos(p+1);
            if ((p-1)>=0&&(p-1)<3)  z = Math.pow(z,3)-Math.tan(p);
            if ((p-1)>=3)   z = Math.pow((p+ Math.sin(Math.PI/6)),5);

            y = Math.sqrt(Math.abs(z - 2.56 * r));
            System.out.print("y = ");
            System.out.printf("%.4f",y);
            System.out.print(" if p = ");
            System.out.printf("%.1f",p);
            System.out.println();

        }
    }
}
