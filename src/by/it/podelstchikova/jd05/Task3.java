package by.it.podelstchikova.jd05;

public class Task3 {

    public static void printTable() {
        double t=2;
        double s;
        int i=0;
        System.out.println("i \t s");
        while (t<=3){
            s=Math.log(Math.abs(1.3+t)+Math.exp(t));
         System.out.printf("%d  %5.2f\n",i,s);
            t+=0.1;
            i++;

        }

    }

}
