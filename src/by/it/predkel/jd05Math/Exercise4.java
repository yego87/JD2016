package by.it.predkel.jd05Math;

/**
 * Составить программу вычисления суммы или произведения (вложенные циклы)
 */
public class Exercise4 {
    public static void exercise4(){
        double result=0;
        for (int i=6; i<12;i++){
            for (int x=1;x<=8;x++){
                result+=Math.pow(x,(5+1.3*i));
            }
        }
        System.out.printf("%6f\t",result);
        System.out.println();
    }
}
