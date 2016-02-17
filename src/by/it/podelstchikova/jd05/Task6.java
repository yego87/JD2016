package by.it.podelstchikova.jd05;

public class Task6 {
    public static void printValue()
    { double x=5.33;
      double[] z={};
      double[] rez={};
        int k=0;
        double rez1=0;
        double r=1;
        int n=(int)Math.ceil((9-5.33)/0.11);
        z=new double[n];
        for (int i = 0;x<9 ; i++,x+=0.11)
        {
            rez1=Math.pow(x,2)+4.5;
            z[i]=Math.pow(rez1,1.0/3.0);
        }
        for (int i=0;i<z.length;i++) {
            if (z[i] > 3.5) {

                k++;

            }
        }
        rez=new double[k];
        int t=0;
        for (int i=0;i<z.length;i++) {
            if (z[i] > 3.5) {
                rez[t] = z[i]; t++;
            }
        }
        System.out.println("i \t\t z");
        Task6.printArray(z);
        System.out.println("i \t\t rez");
        Task6.printArray(rez);

        for (double l:rez)
        {
            r*=l;
        }
        r=Math.pow(r,1.0/rez.length);
        System.out.println("среднее геометрическое: "+r);
    }
    public static void printArray(double[] z)
    {int i=0;

        for (double k:z)
        {System.out.printf("%d %5.2f\n",i,k);
            i++;
        }
    }
}
