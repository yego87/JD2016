package by.it.telushko.jd01_05;
import by.it.telushko.jd01_02.InOut;
public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите тип задач(а, b, c)");
       // String taskNum=InOut.consoleLineInput(); //выбор типа задания
        String taskNum="a";
        switch (taskNum){
            case "a":{
                System.out.println("Задание А1");
                double x= 12.75;
                TaskA.taskA1(x);
                System.out.println("Задание А2\nВведите A(1,21)");
                double a=1.21; double b=0.371;
             // double a = InOut.consoleDoubleInput();
            //  System.out.println("Введите B (0,371)");
            //  double b = InOut.consoleDoubleInput();
                TaskA.taskA2(a, b);

                break;
            }
           /* case "b":{
                //задание В-1

                break;
            }
            case "c":{

                }
                break;
            }*/
            default :{
                System.out.println("Ошибка!");
                break;
            }
        }
    }
}
