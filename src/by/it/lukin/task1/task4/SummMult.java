package by.it.lukin.task1.task4;

/**
 * Created by алексей on 14.02.2016.
 */
public class SummMult {
    public  static void main(String[] args){
        for (double a = 0; a <= 2;a = a+0.2){
            for(int i = 2; i <= 8;i++){
                double k = Math.pow(Math.E,i) - 2.11*a;
                System.out.println(" a = "+a+", i = "+i+" k = "+k);
            }
        }
    }
}
