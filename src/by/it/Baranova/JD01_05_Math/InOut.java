package by.it.Baranova.JD01_05_Math;

/**
 * Created by Ekaterina on 2/11/16.
 */
public class InOut {

    /**
     * Печать одномерного массива с заданным именем и индексами
     * @param mas входящий массив
     * @param name имя массива
     * @param cols количество ячеек, выводимых в одной строке
     */

    public static void arrayPrint (double []mas,String name, int cols) {
        int col=0;
        for (int i=0;i<mas.length;i++){
            System.out.print (name);
            System.out.printf ("[%-2d]=%-9.4f ",i,mas[i]);
            col++;
            if (col%cols==0||i==mas.length-1){
                System.out.println();
            }
        }
    }

    /**
     * Печать одномерного массива с заданным именем и индексами в таблице с псевдографическими границами
     * @param mas входящий массив
     * @param name имя массива
     * @param cols количество ячеек, выводимых в одной строке
     */
    public static void arrayPrintTable (double []mas,String name, int cols) {
        //Верхняя граница таблицы
        int kolp=13;
        System.out.print("╔");
        for (int i=0;i<=cols*12;i++){

            if (i==kolp&&i!=cols*12) {
                System.out.print("╦");
                kolp=kolp+12;
            }
            if (i%12!=0&&i!=cols*12){
                System.out.print("═");
            }
            if (i==cols*12) {
                System.out.print("╗");
            }
        }
        System.out.println();

        //Внутренние рамки таблицы
        double line=(double)mas.length/cols;
        int  linenumber= (int) Math.ceil(line);
        int linecounter=1;
        int col=0;
        for (int i=0;i<mas.length;i++){
            System.out.print("║");
            System.out.print (name);
            System.out.printf ("[%-2d]=%-4.1f ",i,mas[i]);
            col++;
            if (col%cols==0) {
                System.out.print("║");
                System.out.println();
                linecounter++;

                if (linecounter <= linenumber) {
                    System.out.print("╠");
                    kolp = 13;
                    for (int j = 0; j <= cols * 12; j++) {

                        if (j == kolp && j != cols * 12) {
                            System.out.print("╬");
                            kolp = kolp + 12;
                        }
                        if (j % 12 != 0 && j != cols * 12) {
                            System.out.print("═");
                        }
                        if (j == cols * 12) {
                            System.out.print("╣");
                        }
                    }
                    System.out.println("");
                }
            }

        }

        if (linecounter ==linenumber&&mas.length%cols!=0){
            kolp=(mas.length%cols)*12+1;
            for (int k=kolp;k<=cols*12+1;k++){
                if (k==kolp) {
                    System.out.print("║");
                    kolp=kolp+12;
                }
                if (k%12!=0&&k!=cols*12){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        System.out.print("╚");
        kolp=13;
        for (int i=0;i<=cols*12;i++){

            if (i==kolp&&i!=cols*12) {
                System.out.print("╩");
                kolp=kolp+12;
            }
            if (i%12!=0&&i!=cols*12){
                System.out.print("═");
            }
            if (i==cols*12) {
                System.out.print("╝");
            }
        }
        System.out.println();
    }
}
