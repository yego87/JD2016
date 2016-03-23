package by.it.Baranova.JD01_09_MathLab;


import by.it.Baranova.JD01_09_MathLab.vars.VarImpl;

public class ToString {

    public static String toStringOperation(int numberOfoperation,String rLine){
        return "Operation #"+numberOfoperation+": "+rLine;
    }

    public static String toStringOperation(int numberOfoperation,String rLine,VarImpl v){
        return "Operation #"+numberOfoperation+": "+rLine+"="+v;
    }

}
