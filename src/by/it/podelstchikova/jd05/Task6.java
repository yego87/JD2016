package by.it.podelstchikova.jd05;

public class Task6 {
    public static void printValue()
    { double x=5.33;
      double[] z={};
      double[] rez={};
        int k=0;
        double r=1;
        for (int i = 0;x<9 ; i++,x+=0.11)
        {
            z[i]=Math.pow((Math.pow(x,2)+4.5),1/3);
        }
        for (double l: z) {
            if (l > 3.5) {
                rez[k] = l;
                k++;

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
        r=Math.pow(r,1/rez.length);
        System.out.println("среднее геометрическое: "+r);
    }
    public static void printArray(double[] z)
    {int i=0;

        for (double k:z)
        {System.out.println(i+"\t\t"+k);
            i++;
        }
    }
}
