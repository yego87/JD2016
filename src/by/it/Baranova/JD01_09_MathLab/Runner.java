package by.it.Baranova.JD01_09_MathLab;


import by.it.Baranova.JD01_09_MathLab.Builder.*;
import by.it.Baranova.JD01_09_MathLab.vars.VarImpl;

import java.io.IOException;
import java.util.*;


public class Runner {

    public static void one(VarImpl v,boolean print) {
        if (v != null&&print) System.out.println(v);
    }

    public static TreeMap<String, VarImpl> getTreeMap() {
        return treeMap;
    }

    public static Map<String, VarImpl> getHashMap() {
        return hashMap;
    }

    private static Map <String,VarImpl> hashMap=new HashMap<>();
    public static void setHashMap() throws IOException{
        hashMap = BaseUse.restoreBase();
    }
    public static void putElement(String str,VarImpl var){
        hashMap.put(str,var);
    }

    private static TreeMap<String,VarImpl> treeMap=new TreeMap<>();
    public static void setTreeMap() {
        treeMap.putAll(hashMap);
    }
    public static void putElementTree(String str, VarImpl var){
        treeMap.put(str,var);
    }



    public static void main(String[] args) throws IOException {
        Date startTime=new Date(System.currentTimeMillis());
        Runner.setHashMap();
        Runner.setTreeMap();
        Log log=Log.getInstance();
        System.out.println("Введите выражение, которое хотите вычислить");
        String rLine = ReadingFromConsole.ReadLine();

        while (rLine.trim().length() != 0) {
            try {
                MakeAnOperation.makeAnOpetation(rLine,true,true);
            }
            catch (Exception e) {
                System.err.println("Введено некорректное выражение");
                log.saveLog("Введено некорректное выражение");
            }
            System.out.println("Введите выражение, которое хотите вычислить");
            rLine = ReadingFromConsole.ReadLine();
        }

        BaseUse.saveVariable(hashMap);
        Date endTime=new Date(System.currentTimeMillis());
        Queue<String> operations=QueueForBuilder.getOperations();
        String s="Отчет о действиях в MathLab";
        Director director=new Director();
        ReportBuilder actionsReportBuilder=new ActionsReportBuilder();
        /*actionsReportBuilder.buildName(s);
        actionsReportBuilder.buildStartTime(startTime);
        actionsReportBuilder.buildEndTime(endTime);
        actionsReportBuilder.buildOperationsQueue(operations);*/
        director.setReportBuilder(actionsReportBuilder);
        director.constructReport(s,startTime,operations,endTime);
        Report report=director.getReport();
        report.writeReportToFile();
    }

}