package by.it.telushko.jd01_04;

public class Main {

    public static void main(String[] args) {

        double[]y={20,11,40,37};
        double[][]m={{2,5,4,1},{1,3,2,1},{2,10,9,7},{3,8,9,2}};
        double[]x= Util.findRoot(m, y, true);
        InOut.arrayPrint(x);
        System.out.println("Проверка");
        InOut.arrayPrint(Util.arrayMulVector(m, x));

        //поиск определителя
        
        m=Util.gaussForward(m);
        double det=m[0][0];
        for (int diag = 1; diag <m.length ; diag++) {
            det=det*m[diag][diag];
        }
        System.out.println("определитель матрицы коэффициентов: "+det);

        //поиск обратной матрицы

        InOut.arrayPrint2D(Util.reverseMatrix(m));

        //проверка ОМ
        System.out.println("проверка");
        InOut.arrayPrint2D(Util.arrayMulVector(m,Util.reverseMatrix(m)));
    }
}

