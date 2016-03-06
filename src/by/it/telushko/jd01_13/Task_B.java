package by.it.telushko.jd01_13;


import java.util.Scanner;

public class Task_B {
    //решаем квадратное уравнение

    public static void taskB() {
        System.out.println("Начало основной процедуры...\nВведите целые коэффициенты через пробел:");
        Integer a,b,c;
        String s;
        String[] elements;
        Scanner scan = new Scanner(System.in);
        try {
            s = scan.nextLine();
            elements = s.split(" ");
            FindRoots.find(Integer.valueOf(elements[0]), Integer.valueOf(elements[1]), Integer.valueOf(elements[2]));
            System.out.println();
        }

        catch (IndexOutOfBoundsException e) {System.out.println("Вы ввели не все коэффициенты");}
        catch (MinusSqrtException e)        {System.out.println("Отрицательный дискриминант");}
        catch (NumberFormatException e)     {System.out.println("Ошибка ввода");}
        catch (DevideByZeroException e)     {System.out.println("Деление на ноль");}
        finally {scan.close();System.out.println("Oкончание основной процедуры");}
    }


}
