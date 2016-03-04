package by.it.daylidovich.JD01_13.B;

public class Main {
    public static void main(String[] args) {
        try{
            Methods.firstMethod();
        }
        catch (NumberFormatException e){
            System.out.println("Некоректный ввод.");
            System.out.println("Конец первой процедуры.");
        }
    }
}
