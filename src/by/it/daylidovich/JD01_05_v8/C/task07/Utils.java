package by.it.daylidovich.JD01_05_v8.C.task07;

public class Utils {
    public static double[] CreateArray(){
        double[] array = new double[30];
        for (int i = 0; i < 30; i++) {
            array[i] =(double)Math.round((Math.random()*2+7)*100)/100;
        }
        return array;
    }
    public static double[] ArrayK(double[] arrayIn){
        double[] array = new double[30];
        int n = 0;
        for (int i = 0; i < 30; i++) {
            if((double)i/50 < (double)Math.round((arrayIn[i]%1)*100)/100){
                array[n] = arrayIn[i];
                n++;
            }
        }

        double[] arrayOut = new double[n];
        for (int i = 0; i < n; i++) {
            arrayOut[i] = array[i];
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arrayOut[j]<arrayOut[j+1]){
                    double x = arrayOut[j];
                    arrayOut[j] = arrayOut[j+1];
                    arrayOut[j+1] = x;
                }
            }
        }
        return arrayOut;
    }
    public static void PrintArray(double[] array, String name){
        int n =1;
        for (int i=0; i<array.length; i++){
            System.out.printf(name+"[%-1d]=%-5.2f  ",i,array[i]);
            n++;
            if (n>10){
                System.out.println();
                n = 1;
            }
        }
        System.out.println();
    }
    public static void PrintHorizontal(double[] array,String name){
        int n = 1;
        System.out.println("╔═════════════════════════════════════════════════╗");
        for (int i = 0; i < array.length; i++) {
            if (1 == n){
                System.out.print("║╔");
                for (int j = 0; j < 5; j++) {
                    System.out.print("═══════╦");
                }
                System.out.print("═══════╗║");
                System.out.println();
                System.out.print("║║");
            }
            System.out.printf(" %-1s(%02d)=%-1.2f ║",name,i,array[i]);
            if(6 == n){
                System.out.println("║");
                System.out.print("║╚");
                for (int j = 0; j < 5; j++) {
                    System.out.print("═══════╩");
                }
                System.out.print("═══════╝║");
                System.out.println();
                n = 0;
            }
            n++;
        }
        System.out.println("╚═════════════════════════════════════════════════╝");
    }
    public static void PrintVertical(double[] array, String name){
        int n = array.length/7;
        if(0 != array.length%7)
            n++;
        System.out.print("╔");
        for (int i = 0; i < n; i++) {
            System.out.print("════════");
        }
        System.out.println("═╗");
        for (int i = 0; i <7; i++) {
            System.out.print("║╔");
            for (int j = 0; j < n-1; j++) {
                System.out.print("═══════╦");
            }
            System.out.println("═══════╗║");
            System.out.print("║║");
            for (int j = i; j < array.length; j+=7) {
                System.out.printf(" %-1s(%02d)=%-1.2f ║",name,j,array[j]);
            }
            if (i+7*(n-1) > array.length || i+7*(n-1) == array.length)
                System.out.println("            ║║");
            else
                System.out.println("║");
            System.out.print("║╚");
            for (int j = 0; j < n-1; j++) {
                System.out.print("═══════╩");
            }
            System.out.println("═══════╝║");
        }
        System.out.print("╚");
        for (int i = 0; i < n; i++) {
            System.out.print("════════");
        }
        System.out.println("═╝");
    }
}
