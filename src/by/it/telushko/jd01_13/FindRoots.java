package by.it.telushko.jd01_13;

//для типа Float деление на ноль не вызывает исключения, поэтому пишем свое

public class FindRoots {
    public static void find(int a,int b,int c)throws MinusSqrtException,DevideByZeroException{
        System.out.println("начало вычисления корней");
        float x1, x2;
            if (a==0){
                throw new DevideByZeroException("");
            }

        int d = (int) (Math.pow(b, 2) - 4 * a * c);
            x1 = (-b + Operation.countSqrt(d));
            x2 = (-b - Operation.countSqrt(d));
            x1=x1/(2*a);
            x2=x2/(2*a);
            System.out.println("X1="+x1);
            System.out.println("X2="+x2);
        System.out.println("окончание вычисления корней");
    }
}
