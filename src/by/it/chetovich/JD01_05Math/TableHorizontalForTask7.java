package by.it.chetovich.JD01_05Math;

/**
 * Creates a table where elements follow rows
 */
public class TableHorizontalForTask7 {
    /**
     *
     * @param array massiv elementov, kotoriy nuzhno vivesti
     * @param rows koli4estvo radov
     * @param cols koli4estvo stolbcov
     */
    static void arrayOut (double [] array, int rows, int cols){
        String s1 = "| [] =  |";
        String s = s1 + array.length + 1.11; //sozdaem stroku, kotoraya po dline budet ravna ya4eyke v tablice
                                                       //array.length budet zanimat stolko zhe mesta, kak i naibol6iy indeks
                                                       //1.11 primer elementa, oni v diapazone 4-9 s to4nostyu do sotih

        //verhnaya liniya vne6ney tablici
        System.out.print(" ");
        for (int i = 0; i < s.length()*cols; i++) {
            System.out.print("_");
        }
        System.out.println();


        // perebiraem massiv
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j+=cols) {
                if (i==j){
                    // esli nomer elementa 0 ili kraten koli4estvu stolbcov, zna4it eto na4alo novoy stroki i mi delaem
                    // verhnuyu liniyu ya4eek
                    System.out.print("|"); // palo4ka otnositsa k levomu krayu vne6ney tablici
                    for (int l = 0; l < cols; l++) {
                        System.out.print(" ");
                        for (int k = 0; k < s.length()-2; k++) {
                            System.out.print("_");
                        }
                        System.out.print(" ");
                    }
                    System.out.println("|");
                    System.out.print("|"); // palo4ka pravoy granici vne6ney tablici
                }
            }
            System.out.printf("| [%2d] = %.2f |",i,array[i]); // pe4ataem i element s granicami ego ya4eyki
            /*System.out.print(s1);
            System.out.printf("%2d",i);
            System.out.print(s2);
            System.out.printf("%.2f",array[i]);
            System.out.print(s3);*/

            //esli eto posledniy element, to mi pe4ataem granici pustih ya4eek
            if (i==array.length-1){
                int blankCells = cols*rows - array.length;
                for (int j = 0; j < blankCells; j++) {
                    System.out.print("|");
                    for (int k = 0; k < s.length()-2; k++) {
                        System.out.print(" ");
                    }
                    System.out.print("|");
                }
                printCellLowEdge(cols, s);
            }

            //esli koli4estvo nape4atannih v stroke elementov kratno koli4estvu stobcov i eto ne posledniy element,
            // to mi pe4ataem nizhnuyu granicu ya4eek
            if ((i+1)%4==0&&i!=array.length-1){

                printCellLowEdge(cols, s);
            }
        }

        //kogda vse elementi nape4atani, delaem nizhnuyu granicu vne6ney tablici
        System.out.print("|");
        for (int i = 0; i < s.length()*cols; i++) {
            System.out.print("_");
        }
        System.out.println("|");
    }

    static void printCellLowEdge (int cols, String s){
        System.out.println("|"); //poslednyaa palo4ka v predidus4ey stroke, t.e. pravaya vne6nyaa granica
        System.out.print("|");
        for (int j = 0; j < cols; j++) {
            System.out.print("|");
            for (int k = 0; k < s.length()-2; k++) {
                System.out.print("_");
            }
            System.out.print("|");
        }
        System.out.println("|");
    }


}
