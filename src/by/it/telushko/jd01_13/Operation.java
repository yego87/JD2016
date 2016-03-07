package by.it.telushko.jd01_13;


public class Operation {
    public static float countSqrt(int i) throws MinusSqrtException{
            System.out.println("начало вычисления SQRT");
        if (i<0){throw new MinusSqrtException("minus");}
        System.out.println("окончание вычисления SQRT");
        return (float) Math.sqrt(i);

    }
}
