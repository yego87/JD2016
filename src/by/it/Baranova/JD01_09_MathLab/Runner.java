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
    private static void one(VarImpl v) {
        if (v != null) System.out.println(v);
    }


    public static void main(String[] args) throws IOException {

        Map<String, VarImpl> hashMap = BaseUse.restoreBase();
        TreeMap<String,VarImpl> treeMap=new TreeMap<>(hashMap);
        System.out.println("Введите выражение, которое хотите вычислить");
        String rLine = ReadingFromConsole.ReadLine();

        while (rLine.trim().length() != 0) {
            try {
                switch (rLine) {
                    case "printvar": {
                        Print.printvar(hashMap);
                        break;
                    }

                    case "sortvar": {
                        Print.sortvar(treeMap);
                        break;
                    }

                    default: {
                        //Преобразование переменных в переменные типа VarImpl
                        String operands[] = ReadingFromConsole.Determine(rLine);

                        switch (operands[2]) {
                            case "+": {
                                VarImpl a = DefineType.Define(operands[0]);
                                VarImpl b = DefineType.Define(operands[1]);
                                one(a.add(b));
                                break;
                            }
                            case "-": {
                                VarImpl a = DefineType.Define(operands[0]);
                                VarImpl b = DefineType.Define(operands[1]);
                                one(a.sub(b));
                                break;
                            }
                            case "/": {
                                VarImpl a = DefineType.Define(operands[0]);
                                VarImpl b = DefineType.Define(operands[1]);
                                one(a.div(b));
                                break;
                            }
                            case "*": {
                                VarImpl a = DefineType.Define(operands[0]);
                                VarImpl b = DefineType.Define(operands[1]);
                                one(a.mul(b));
                                break;
                            }
                            case "=": {
                                VarImpl b = DefineType.Define(operands[1]);
                                hashMap.put(operands[0], b);
                                treeMap.put(operands[0],b);
                                break;
                            }
                        }
                    }
                }

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