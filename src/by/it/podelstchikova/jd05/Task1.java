package by.it.podelstchikova.jd05;

public class Task1 {
    public static void printValue(double a,double x, boolean print)
    {
        if (print) System.out.println(Math.cos(Math.pow((Math.pow(x,2)+Math.PI/6),5))-Math.sqrt((x*Math.pow(a,3)))-Math.log((a-1.12*x)/4));
        else
        { double rez=0;
            rez=Math.cos(Math.pow((Math.pow(x,2)+Math.PI/6),5));
            rez+=-Math.sqrt((x*Math.pow(a,3)));
            rez+=-Math.log((a-1.12*x)/4);
            System.out.println(rez);


        }
    }
}
