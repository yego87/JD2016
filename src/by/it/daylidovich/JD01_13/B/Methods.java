package by.it.daylidovich.JD01_13.B;

public class Methods {
    public static void firstMethod() throws NumberFormatException{
        System.out.println("Начало первой процедуры.");
        try{
            secondMethod();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Превышение длинны массива.");
            System.out.println("Конец второй процедуры.");
        }
        finally {
            int x = Integer.parseInt("string");
            System.out.println("Конец первой процедуры.");
        }
    }

    public static void secondMethod() throws ArrayIndexOutOfBoundsException{
        System.out.println("Начало второй процедуры.");
        thirdMethod();
        int[] array = new int[3];
        array[3] = 5;
        System.out.println("Конец второй процедуры.");
    }

    public static void thirdMethod() {
        System.out.println("Начало третьей процедуры.");
        try {
            int k = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль.");
        }
        System.out.println("Конец третьей процедуры.");
    }
}
