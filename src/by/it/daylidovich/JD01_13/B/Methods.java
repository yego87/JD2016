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
            throw new NumberFormatException();
        }
    }

    public static void secondMethod() throws ArrayIndexOutOfBoundsException{
        System.out.println("Начало второй процедуры.");
        thirdMethod();
        throw new ArrayIndexOutOfBoundsException();
    }

    public static void thirdMethod() {
        System.out.println("Начало третьей процедуры.");
        try {
            throw new  ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль.");
        }
        System.out.println("Конец третьей процедуры.");
    }
}
