package by.it.telushko.jd02_05;

import by.it.telushko.jd01_02.InOut;

public class Run {
    public static void main(String[] args){
        System.out.println("Выберите задачу(а=a+b, c=c)\n");
        String taskNum= InOut.consoleLineInput(); //выбор типа задания

        switch (taskNum) {
            case "a": {
                task_A.taskAB(args);
                break;
            }

            case "c": {
                task_C.taskC();
                break;
            }

            default: {
                System.out.println("Ошибка!");
                break;
            }
        }
    }
}
