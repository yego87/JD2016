package by.it.Baranova.JD01_09_MathLab.Creator;


import by.it.Baranova.JD01_09_MathLab.vars.VarImpl;
import by.it.Baranova.JD01_09_MathLab.vars.VarVectorImpl;

public class CreatorVarVector extends Creator{

    @Override
    public VarImpl factoryMethod (String str){return new VarVectorImpl(str);}


}
