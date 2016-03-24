package by.it.Baranova.JD01_09_MathLab;

import by.it.Baranova.JD01_09_MathLab.Creator.Creator;
import by.it.Baranova.JD01_09_MathLab.Creator.CreatorVarFLoat;
import by.it.Baranova.JD01_09_MathLab.Creator.CreatorVarMatrix;
import by.it.Baranova.JD01_09_MathLab.Creator.CreatorVarVector;
import by.it.Baranova.JD01_09_MathLab.vars.VarImpl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


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
            Creator creator=new CreatorVarFLoat();
            return creator.factoryMethod(str);
        }
        if (kol==1){
            Creator creator=new CreatorVarVector();
            return  creator.factoryMethod(str);
        }
        if (kol>1){
            Creator creator=new CreatorVarMatrix();
            return creator.factoryMethod(str);
        }
        return null;
    }
}
