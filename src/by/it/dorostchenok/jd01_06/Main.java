package by.it.dorostchenok.jd01_06;


import by.it.dorostchenok.jd01_06.string.Constatnt;
import by.it.dorostchenok.jd01_06.tasks.TaskA;

public class Main {

    public static void main(String[] args){
        TaskA taskA = new TaskA();
        // A 1
        System.out.println(taskA.replaceCharacters(Constatnt.TEXT));
        // A 2
        taskA.countWords(Constatnt.TEXT);
        // A 3
        System.out.println(taskA.countStartEndVowelWords(Constatnt.TEXT));

    }
}
