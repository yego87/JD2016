package by.it.Baranova.JD01_09_MathLab;


import by.it.Baranova.JD01_09_MathLab.vars.VarImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ekaterina on 2/22/16.
 */
public class Runner {
    private static void one(VarImpl v) {
        if (v != null) System.out.println(v);
    }


    public static void main(String[] args) throws IOException {

        Map<String, VarImpl> hashMap = new HashMap<String, VarImpl>();
        ArrayList<String> sortedlist=new ArrayList<>();
        System.out.println("Введите выражение, которое хотите вычислить");
        String rLine = ReadingFromConsole.ReadLine();

        try {
            while (rLine.trim().length() != 0) {
                switch (rLine) {
                    case "printvar": {
                        Print.printvar(hashMap);
                        break;
                    }

                    case "sortvar": {
                        Print.sortvar(sortedlist, hashMap);
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
                                sortedlist.add(operands[0]);
                                break;
                            }
                        }
                    }
                }
                System.out.println("Введите выражение, которое хотите вычислить");
                rLine = ReadingFromConsole.ReadLine();
            }
        }
        catch (StringIndexOutOfBoundsException e){
            System.err.print("Введено некорректное выражение");
        }
    }
}