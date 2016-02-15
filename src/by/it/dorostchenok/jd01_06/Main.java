package by.it.dorostchenok.jd01_06;

import by.it.dorostchenok.jd01_06.string.Constant;
import by.it.dorostchenok.jd01_06.tasks.TaskA;
import by.it.dorostchenok.jd01_06.tasks.TaskB;

public class Main {

    public static void main(String[] args){
        TaskA taskA = new TaskA();
        // A 1
        System.out.println(taskA.replaceCharacters(Constant.TEXT));
        // A 2
        taskA.countWords(Constant.TEXT);
        // A 3
        System.out.println(taskA.countStartEndVowelWords(Constant.TEXT));
        // B 1
        TaskB taskB = new TaskB();
        System.out.println(taskB.deleteWordsOfFiveLength(Constant.TEXT));
        System.out.println("#############################");
        // B 2 show ordered sentences
        taskB.sortSentences(Constant.TEXT);
        System.out.println("#############################");
        // B 3
        // get sorted array
        String[] array = taskB.sortWordsBySymbolMatch(Constant.TEXT, "б");
        // print to console
        for (String s : array)
            System.out.println(s);

    }
}
