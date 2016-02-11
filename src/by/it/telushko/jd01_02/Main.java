package by.it.telushko.jd01_02;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Выберите тип задач(а, b, c)");
        String taskNum=InOut.consoleLineInput(); //выбор типа задания
      //  String taskNum="c";
        switch (taskNum){
            case "a":{
                String[] val = InOut.consoleReadLine();
                TaskA.task1(val);
                break;
            }
            case "b":{
                //задание В-1
               System.out.println("Введите число и диапазон для задания В-1");
                String[] inData = InOut.consoleReadLine();
                TaskB.taskB1(inData);
                //задание В-2
                System.out.println("Введите число N для задания В-2");
                int n=InOut.consoleIntInput();
                TaskB.taskB2(n);
                //задание В-3
                System.out.println("введите корни квадратного уравнения");
                String[]val=InOut.consoleReadLine();
                int[] v=InOut.strToInt(val);
                TaskB.taskB3(v);
                //задание В-4
                System.out.println("введите номер месяца от 1 до 12");
                n=InOut.consoleIntInput();
                String month=TaskB.taskB4(n);
                System.out.println(month);
                break;
            }
            case "c":{
                System.out.println("Введите размерность матрицы N");
                int size=InOut.consoleIntInput();
                int[][]matrix= TaskC.taskC(size);
                System.out.println("Введите номер задания");
                int taskCNum=InOut.consoleIntInput();
                switch (taskCNum){
                    case 1:{TaskC.taskC1(matrix,size);break;}
                    case 2:{TaskC.taskC2(matrix,size);break;}
                    case 3:{TaskC.taskC3(matrix,size);break;}
                    case 4:{TaskC.taskC4(matrix,size);break;}
                    case 5:{TaskC.taskC5(matrix,size);break;}
                    case 6:{TaskC.taskC6(matrix,size);break;}
                    case 7:{TaskC.taskC7(matrix,size);break;}

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