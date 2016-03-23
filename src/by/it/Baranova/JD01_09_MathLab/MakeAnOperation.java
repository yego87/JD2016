package by.it.Baranova.JD01_09_MathLab;

import by.it.Baranova.JD01_09_MathLab.Builder.QueueForBuilder;
import by.it.Baranova.JD01_09_MathLab.vars.VarImpl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class MakeAnOperation {
    public static int numberOfoperation=1;

    public static VarImpl makeAnOpetation(String rLine,boolean print,boolean mainoperation) throws IOException {
        //Преобразование переменных в переменные типа VarImpl
        Map<String,String> operations=new HashMap<>();
        VarImpl v = null;
        switch (rLine) {
            case "printvar": {
                Print.printvar(Runner.getHashMap());
                QueueForBuilder.addOperation(ToString.toStringOperation(numberOfoperation,rLine));
                MakeAnOperation.numberOfoperation++;
                break;
            }

            case "sortvar": {
                Print.sortvar(Runner.getTreeMap());
                QueueForBuilder.addOperation(ToString.toStringOperation(numberOfoperation,rLine));
                MakeAnOperation.numberOfoperation++;
                break;
            }

            default: {
                String operands[] = ReadingFromConsole.Determine(rLine);

                switch (operands[2]) {
                    case "+": {
                        VarImpl a = DefineType.Define(operands[0]);
                        VarImpl b = DefineType.Define(operands[1]);
                        Runner.one(v=a.add(b),print);
                        if (mainoperation) {
                            QueueForBuilder.addOperation(ToString.toStringOperation(numberOfoperation, rLine, v));
                            MakeAnOperation.numberOfoperation++;
                        }
                        break;
                    }
                    case "-": {
                        VarImpl a = DefineType.Define(operands[0]);
                        VarImpl b = DefineType.Define(operands[1]);
                        Runner.one(v=a.sub(b),print);
                        if (mainoperation) {
                            QueueForBuilder.addOperation(ToString.toStringOperation(numberOfoperation, rLine, v));
                            MakeAnOperation.numberOfoperation++;
                        }
                        break;
                    }
                    case "/": {
                        VarImpl a = DefineType.Define(operands[0]);
                        VarImpl b = DefineType.Define(operands[1]);
                        Runner.one(v=a.div(b),print);
                        if (mainoperation) {
                            QueueForBuilder.addOperation(ToString.toStringOperation(numberOfoperation, rLine, v));
                            MakeAnOperation.numberOfoperation++;
                        }
                        break;
                    }
                    case "*": {
                        VarImpl a = DefineType.Define(operands[0]);
                        VarImpl b = DefineType.Define(operands[1]);
                        Runner.one(v=a.mul(b),print);
                        if (mainoperation) {
                            QueueForBuilder.addOperation(ToString.toStringOperation(numberOfoperation, rLine, v));
                            MakeAnOperation.numberOfoperation++;
                        }
                        break;
                    }
                    case "=": {
                        boolean toResolve = ReadingFromConsole.toResolve(operands[1]);
                        if (toResolve) {
                            operands[1]= ReadingFromConsole.parser(operands[1]);
                        }
                        VarImpl b = DefineType.Define(operands[1]);
                        Runner.putElement(operands[0], b);
                        Runner.putElementTree(operands[0], b);
                        if (!toResolve) {
                            QueueForBuilder.addOperation(ToString.toStringOperation(numberOfoperation, rLine));
                            MakeAnOperation.numberOfoperation++;
                        }
                        if (toResolve){
                            QueueForBuilder.addOperation(ToString.toStringOperation(numberOfoperation,rLine,b));
                            MakeAnOperation.numberOfoperation++;
                        }
                        break;
                    }
                }
            }
        }
        return v;
    }
}