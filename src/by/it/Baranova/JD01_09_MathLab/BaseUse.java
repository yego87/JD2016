package by.it.Baranova.JD01_09_MathLab;


import by.it.Baranova.JD01_09_MathLab.vars.VarImpl;

import java.io.*;
import java.util.HashMap;
import java.util.Map;


public class BaseUse {

    public static void saveVariable(Map<String,VarImpl> hashMap) throws IOException{
        Log log=Log.getInstance();
        String src= System.getProperty("user.dir")+"/src/by/it/Baranova/";
        String filename=src+"JD01_09_MathLab/Variables.txt";
        File f=new File(filename);
        PrintWriter wr=null;
        try {
            wr = new PrintWriter(new FileWriter(f));
            for (Map.Entry<String,VarImpl> pair:hashMap.entrySet()) {
                wr.println(pair.getKey() + "=" + pair.getValue());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файла нет:" + filename);
            log.saveLog("Файл не найден");

        } finally {
            if (wr != null) {
                wr.close();
            }

        }
    }

    public  static Map<String,VarImpl> restoreBase()throws IOException{
        Log log=Log.getInstance();
        String src= System.getProperty("user.dir")+"/src/by/it/Baranova/";
        String filename=src+"JD01_09_MathLab/Variables.txt";
        File f=new File(filename);
        Map<String,VarImpl> hashMap=new HashMap<>();
        BufferedReader fr=null;

        try {
            fr=new BufferedReader(new FileReader(filename));
            String line;
            while ((line=fr.readLine())!=null){
                line.trim();
                if (!line.equals("")) {
                    String operands[] = ReadingFromConsole.Determine(line);
                    VarImpl b = DefineType.Define(operands[1]);
                    hashMap.put(operands[0], b);
                }
            }
        }catch (IOException e){
            System.out.println("Ошибка файла: "+e);
            log.saveLog("Файл не найден");
        } finally {
            if (fr!=null){
                fr.close();
            }
        }
        return hashMap;
    }
}
