package by.it.Baranova.JD01_09_MathLab;

import by.it.Baranova.JD01_09_MathLab.vars.VarFloatImpl;
import by.it.Baranova.JD01_09_MathLab.vars.VarImpl;
import by.it.Baranova.JD01_09_MathLab.vars.VarMatrixImpl;
import by.it.Baranova.JD01_09_MathLab.vars.VarVectorImpl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ekaterina on 2/25/16.
 */
public class DefineType {

    public static VarImpl Define (String str) {
        int kol=0;
        String regex="}";
        Pattern p1=Pattern.compile(regex);
        Matcher m1=p1.matcher(str);
        while (m1.find()){
            kol++;
        }
        if (kol==0){
            VarFloatImpl a=new VarFloatImpl(str);
            return a;
        }
        if (kol==1){
            VarVectorImpl a=new VarVectorImpl(str);
            return  a;
        }
        if (kol>1){
           VarMatrixImpl a=new VarMatrixImpl(str);
            return a;
        }
        return null;
    }
}
