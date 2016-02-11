package by.it.telushko.jd01_05;
import by.it.telushko.jd01_02.InOut;
public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите тип задач(а, b, c)");
       // String taskNum=InOut.consoleLineInput(); //выбор типа задания
        String taskNum="a";
        switch (taskNum){
            case "a":{
                double x= 12.75;
                TaskA.taskA1(x);
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
