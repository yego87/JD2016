package by.it.chetovich.JD01_05Math;

/**
 * Creates a table where elements follow columns
 */
public class TableVerticalForTask7 {
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
        for (int m = 0; m < rows; m++) {
            for (int i = m; i < rows*cols; i+=rows) { //shag raven kol-vu strok,kogda nape4atano 4 elementa perehodim na novuyu stroku

                if (i<rows) {
                    // kogda i men6e koli4estva strok, eto zna4it on budet pe4atatsya v pervom stolbce i mi pe4ataem
                    // verhnuyu liniyu ya4eek
                    System.out.print("|"); // palo4ka otnositsa k levomu krayu vne6ney tablici
                    for (int l = 0; l < cols; l++) {
                        System.out.print(" ");
                        for (int k = 0; k < s.length() - 2; k++) {
                            System.out.print("_");
                        }
                        System.out.print(" ");
                    }
                    System.out.println("|");
                    System.out.print("|"); // palo4ka pravoy granici vne6ney tablici
                }
                if (i<array.length) { //esli i ne bol6e dlini massiva, mi pe4ataem i element
                    System.out.printf("| [%2d] = %.2f |", i, array[i]); // pe4ataem i element s granicami ego ya4eyki
                }
                else { //esli bol6e, to elementa s takim nomerom v massive net i mi pe4ataem pustuyu ya4eyku
                    System.out.print("|");
                    for (int j = 0; j < s.length()-2; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("|");
                }
                if ((i>=(cols-1)*rows)) { //esli nape4atanniy element nahoditsya v poslednem stolbce, delaem nizhnuyu granicu ya4eek

                    printCellLowEdge(cols, s);
                }
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
