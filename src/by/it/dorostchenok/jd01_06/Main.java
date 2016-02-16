package by.it.dorostchenok.jd01_06;

import by.it.dorostchenok.jd01_06.string.Constant;
import by.it.dorostchenok.jd01_06.tasks.TaskA;
import by.it.dorostchenok.jd01_06.tasks.TaskB;
import by.it.dorostchenok.jd01_06.tasks.TaskC;

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

        // Group of tasks C
        // C 1
        TaskC taskC = new TaskC();
        String formatedText = taskC.formatText(Constant.TEXT);
        System.out.println(formatedText);
        // C 2
        long before;
        long after;
        before = System.currentTimeMillis();
        taskC.concatOneMillionString(Constant.TEXT, 100000);
        after = System.currentTimeMillis();
        long stringResult = after - before;
        System.out.println("String Result: " + stringResult + " milliseconds");
        before = System.currentTimeMillis();
        taskC.concatOneMillionStringBuffered(Constant.TEXT, 100000);
        after = System.currentTimeMillis();
        long stringBuilderResult = after - before;
        System.out.println("StringBuilder Result: " + stringBuilderResult + " milliseconds\n");
        System.out.println("StringBuilder wins " + (stringResult - stringBuilderResult) + " milliseconds");
        // C 3
        taskC.sortWordsBackOrder(Constant.TEXT);

    }
}
