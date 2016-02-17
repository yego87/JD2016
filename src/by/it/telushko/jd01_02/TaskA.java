package by.it.telushko.jd01_02;

public class TaskA {
    public static void task1(String[] val) {
        int maxL=val[0].length();   //макс длина
        int minL=val[0].length();   //мин длина
        int averLength = 0;         //средняя длина
        String maxLValue="";        //значение самого длинного элемента
        String minLValue="";        //значение самого короткого элемента
        int valElementLength=0;     //длина текущего проверяемого элемента

        // проеобразуем массив строк в сассив чисел и выводим его
        int[] v = new int[val.length];
        int i=0;
        for(String s:val){

            v[i]=Integer.valueOf(s);
            System.out.println(v[i]);
            i++;
        }
        // ---- задание А-1+2
        for (i=0; i<val.length;i++){

            if (val[i].length()>maxL){ //поиск эллемента с максимальной длиной
                maxLValue= val[i];
                maxL=val[i].length();
            }
            if (val[i].length()<minL){ //поиск эллемента с минимальной длиной
                minL=val[i].length();
                minLValue=val[i];
            }
            averLength = averLength + val[i].length(); //накапливаем суммарную длину всех элементов масива
        }

        averLength=Math.round(averLength / val.length); //вычисляем среднюю длину элемента

        System.out.println("Элемент с максимальной длиной: "+maxLValue+", его длина: "+maxL);
        System.out.println("Элемент с минимальной длиной: "+minLValue+", его длина: "+minL);
        System.out.println("Средняя длина элемента массива: "+averLength);

        int j=0; //счетчики для массивов, хранящих элементы короче(длинее) среднего
        int k=0;
        int shorterQ=0; //найденное количество элементов длинее и короче среднего
        int longerQ=0;

        //подсчитываем длины массивов для хранение элементов длинее и короче среднего
        for ( i = 0; i <val.length; i++) {
            if ( val[i].length() > averLength)k=k+1;
            if ( val[i].length() < averLength)j=j+1;
        }

        longerQ=k;  //сохраним длины массивов для хранение элементов длинее и короче среднего
        shorterQ=j;
        j=0;        //счетчики для заполнения массивов элементов длинее и короче среднего
        k=0;

        String[] longer = new String[longerQ]; //создадим массивы для хранения элементов длинее (короче) среднего
        String[] shorter = new String[shorterQ];

        for ( i = 0; i <val.length; i++) {
            if ( val[i].length() > averLength){
                longer[k]=val[i];
                k=k+1;
            }
            if ( val[i].length() < averLength){
                shorter[j]=val[i];
                j=j+1;
            }
        }
        //вывод элементов длинее (короче) среднего
        System.out.println("Элементы, длинее среднего");
        for (k=0; k <(longerQ); k++) {
            System.out.println("Элемент: "+longer[k]+", его длина: "+longer[k].length());
        }
        System.out.println("Элементы, короче среднего");
        for (j=0; j <shorterQ; j++) {
            System.out.println("Элемент: "+shorter[j]+", его длина: "+shorter[j].length());
        }

        //----задание А-3
        int q=0;
        for (i = 0; i <val.length; i++) {
            boolean breakValElementFlag=false;
            for (j = 0; j <val[i].length()-1; j++) {
                for ( q = j+1; q <val[i].length() ; q++) {
                    if(val[i].charAt(j)==val[i].charAt(q)) breakValElementFlag=true;
                }
            }
            if (false == breakValElementFlag){
                System.out.println("Символы не повторяются в элементе: "+val[i]);
                break;
            }
        }
        //----задание А-4
        boolean palindromeFlag = false;
        int palindromeCounter=0;
        for ( i = 0; i <val.length; i++) {
            for (j = 0; j <val[i].length(); j++) {

                if (val[i].charAt(j)==val[i].charAt(val[i].length()-1-j))
                    palindromeFlag=true;
                else
                    palindromeFlag=false;
            }
            if (true==palindromeFlag) {
                System.out.println("элемент " + val[i] + " -палиндром");
                palindromeCounter++;
                if (palindromeCounter >= 2) break;
            }
        }

        }
}
