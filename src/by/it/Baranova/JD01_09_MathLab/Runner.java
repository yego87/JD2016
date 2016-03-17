package by.it.Baranova.JD01_09_MathLab;


import by.it.Baranova.JD01_09_MathLab.vars.VarImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Ekaterina on 2/22/16.
 */
public class Runner {

    public static void one(VarImpl v) {
        if (v != null) System.out.println(v);
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

        Runner.setHashMap();
        Runner.setTreeMap();
        System.out.println("Введите выражение, которое хотите вычислить");
        String rLine = ReadingFromConsole.ReadLine();

        while (rLine.trim().length() != 0) {
            try {
                MakeAnOperation.makeAnOpetation(rLine);
            }
            catch (Exception e) {
                System.err.println("Введено некорректное выражение");
            }
            System.out.println("Введите выражение, которое хотите вычислить");
            rLine = ReadingFromConsole.ReadLine();
        }

        BaseUse.saveVariable(hashMap);
    }

}