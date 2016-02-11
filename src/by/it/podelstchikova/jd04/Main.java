package by.it.podelstchikova.jd04;

public class Main {
public static  void main(String[] args)
{  double [][] massX={
        {2, 5, 4, 1},
        {1, 3, 2, 1},
        { 2, 10, 9,7},
        {3,8,9,2 }
};
double [] y = {20, 11, 40, 37};
double [] x = new double[y.length];
   x= TaskAndBndC.findRoot(massX, y);
    System.out.println("Ответ:");
    for (int i = 0; i < x.length; i++) {
        System.out.println(x[i]);
    }
    }

}
