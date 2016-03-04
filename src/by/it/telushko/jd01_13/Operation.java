package by.it.telushko.jd01_13;


public class Operation {
    public static double countSqrt(int i) throws MinusSqrtException {
        if (i<0){throw new MinusSqrtException("minus");}
        return (Math.sqrt(i));
    }
}
