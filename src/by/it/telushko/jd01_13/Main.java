package by.it.telushko.jd01_13;

import by.it.telushko.jd01_13.Task_A;

public class Main {
    public static void main(String[] args) throws MinusSqrtException {

       // System.out.println("Выберите тип задач(а, b, c)\n(можно раскомментировать нужную букву)");
       // String taskNum=InOut.consoleLineInput(); //выбор типа задания
       // String taskNum="a";
        String taskNum="b";
        //String taskNum="c";
        switch (taskNum){
            case "a":{
                System.out.println("Задача А-1");
                Task_A.taskA();
                break;
            }
            case "b": {
                Task_B.taskB();

                break;
            }

            case "c": {
              //  TaskC.taskC1(text);
                //TaskC.taskC2(text); не сделано
                break;
            }
            default :{
                System.out.println("Ошибка!");
                break;
            }
        }
    }
}
