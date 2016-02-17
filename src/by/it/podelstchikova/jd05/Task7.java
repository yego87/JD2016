package by.it.podelstchikova.jd05;



public class Task7 {
    public static void printVal()
    {
        double [] m=new double[29];
        double n=3;

        for (int i = 0; i < m.length; i++)
            m[i] = Math.random()*3-7;
        double[] b={};
        int k=0;
        for (int i = 0; i < m.length; i++) {
            if (Math.abs(m[i])*3<i) {k++;}
        }
        b=new double[k];
        k=0;
        for (int i = 0; i < m.length; i++) {
            if (Math.abs(m[i])*3<i) {b[k]=m[i];k++;}
        }
        for (int i = b.length-1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (b[j+1]>b[j])
                {
                    double buf = b[j+1];
                    b[j+1]=b[j];
                    b[j]=buf;
                }
            }
        }
        Task7.printM(m);
        Task7.printB(b);
    }

    public static void printM(double[] a)
    { int k=(int)Math.ceil(a.length/7);
        int t=0;
        for (int l=0;l<7;l++) {
            for (int i = 0; i < k; i++) {
                System.out.printf(" m [ %d ] = %3.2f\t",t,a[t]);
                t++;
            }
            System.out.println();
        }
    }
    public static void printB(double[] a)
    { boolean tf=true;
        double k=Math.ceil(a.length/7);
        int k1=(int)k+1;
int t=0;
        for (int l = 0; l < 7; l++) {
            for (int i = 0; i < k1; i++) {
                int z=t+7*i;
                if (z>=a.length){
                    tf=false;
                  break;
                    }
                System.out.printf(" b [ %d ] = %3.2f\t",z,a[z]);

            }
            if (!tf) break;
            t++;
            System.out.println();

        }

    }
}
