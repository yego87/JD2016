package by.it.Baranova.JD01_09_MathLab.Creator;

import by.it.Baranova.JD01_09_MathLab.vars.VarFloatImpl;
import by.it.Baranova.JD01_09_MathLab.vars.VarImpl;

public class CreatorVarFLoat extends Creator {

    @Override
    public VarFloatImpl factoryMethod(String str){return new VarFloatImpl(str);}
}

