package by.it.telushko.jd01_05;
import by.it.telushko.jd01_02.InOut;
import by.it.telushko.jd01_05.Tasks.TaskA;
import by.it.telushko.jd01_05.Tasks.TaskB;
import by.it.telushko.jd01_05.Tasks.TaskC;
import java.lang.reflect.Method;
public class Main {
    public static void main(String[] args) {

        System.out.println("ВАРИАНТ 7\nВыберите тип задач(а, b, c)\n" +

                "d-вывод всех методов класса Math"+ "\nМожно раскоментировать соответствующую букву в коде \n");
        String taskNum= InOut.consoleLineInput(); //выбор типа задания
      //String taskNum="a";
      //String taskNum="b";
      //String taskNum="c";
      //String taskNum="d";
        switch (taskNum){
            case "a":{
                System.out.println("Задание А1----------------------------------------");
                double x= 12.75;
                TaskA.taskA1(x);
                System.out.println("Задание А2----------------------------------------\nВведите A(1,21)");
                double a=1.21; double b=0.371;
            //  double a = InOut.consoleDoubleInput();
            //  System.out.println("Введите B (0,371)");
            //  double b = InOut.consoleDoubleInput();
                TaskA.taskA2(a, b);
                System.out.println("Задание А3---------------------------------------");
                TaskA.taskA3(3.67,1.25,-10,1);
                System.out.println("Задание А4---------------------------------------\nВ нем заменил произведение на сумму, т.к. в ответе получалось infinity");
                TaskA.taskA4(2,3,0.1);
                System.out.println("Задание А5----------------------------------------\nЗаменил условие в 3й ветке,чтобы под корнем появилось отр. число ");
                TaskA.taskA5(4.73,-6,25,4);
                break;
            }
            case "b":{
                TaskB.taskB(12,77,4,5);
                break;
            }
            case "c":{
                TaskC.taskC(21);
                break;
            }
            case "d":{
                Class cls = Math.class;

                System.out.println("Методы Math:");
                for (Method method : cls.getDeclaredMethods()) {
                    System.out.println(method.getName());
                }
                break;
            }
            default :{
                System.out.println("Ошибка!");
                break;
            }
        }
    }
}
