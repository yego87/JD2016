package by.it.telushko.jd01_13;

import by.it.telushko.jd01_02.InOut;

public class Main {
    public static void main(String[] args) throws MinusSqrtException {

          System.out.println("Выберите тип задач(а, b, c)\n(можно раскомментировать нужную букву)");
          String taskNum= InOut.consoleLineInput(); //выбор типа задания
        //String taskNum="a";
        //String taskNum="b";
        //String taskNum="c";
        switch (taskNum){
            case "a":{
                System.out.println("Задача А-1");
                Task_A.taskA();
                break;
            }
            case "b": {
                System.out.println("Задача B-1");
                Task_B.taskB();
                break;
            }
            case "c": {
                System.out.println("в пакете jd08 в класс NeuroSurgeonAnimal для метода useKnife дописано исключение");
                break;
            }
            default :{
                System.out.println("Ошибка!");
                break;
            }
        }
    }
}
