package by.it.Baranova.JD01_06_String;

/**
 * Created by Ekaterina on 2/15/16.
 */
public class SortWordsBySymbol {

    /**
     * Сортировка слов по убыванию количества вхождений заданного символа в каждое слово
     * а в случае равенства- по алфавиту
     * @param poetry массив слов
     * @param a
     */
    public static void  WordsMatrix(String[] poetry,char a){
        int n=poetry.length;
        String [] wordsnew=new String[n];
        for (int i=0;i<n;i++){
            wordsnew[i]=poetry[i];
        }

        int [] symbolQuantity=new int[n];
        for (int i=0;i<n;i++){
            int m=wordsnew[i].length();
            int kol=0;
            for (int j=0;j<m;j++){
               if (wordsnew[i].charAt(j)==a){
                   kol++;
               }
            symbolQuantity[i]=kol;
            }
        }

        //Сортируем массивы по убыванию количества вхождений заданного символа в каждое слово
        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                if (symbolQuantity[i]<symbolQuantity[j]){
                    int extra=symbolQuantity[i];
                    symbolQuantity[i]=symbolQuantity[j];
                    symbolQuantity[j]=extra;
                    String extraS=wordsnew[i];
                    wordsnew[i]=wordsnew[j];
                    wordsnew[j]=extraS;
                }
            }
        }
        //Сортировка по алфавиту
        for (int i=0;i<n-1;i++) {
            for (int j = i+1; j < n; j++) {
                if (symbolQuantity[i] == symbolQuantity[j]) {
                    if (wordsnew[i].compareToIgnoreCase(wordsnew[j]) > 0) {
                        int extra = symbolQuantity[i];
                        symbolQuantity[i] = symbolQuantity[j];
                        symbolQuantity[j] = extra;
                        String extraS = wordsnew[i];
                        wordsnew[i] = wordsnew[j];
                        wordsnew[j] = extraS;
                    }
                }
            }
        }
        System.out.println("Сортировка слов по убыванию количества вхождений заданного символа в каждое слово\n" +
                "  а в случае равенства- по алфавиту");
        int j=0;
        for (int i=0;i<n;i++){
            j++;
            System.out.print(wordsnew[i]+"  ");
            if (j%25==0){System.out.println();}
        }
        System.out.println();

    }
}
