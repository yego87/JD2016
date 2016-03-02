package by.it.Baranova.JD01_12_Collections.Task_3.C1;



import by.it.Baranova.JD01_12_Collections.Utils;

import java.util.*;

/**
 * Created by Ekaterina on 2/29/16.
 */
public class ObjectsNames {
    private static void prn(Object o){System.out.println(o.toString());}

    /**
     * Построение списка из наименований,содержащихся в строке с использованием TreeMap
     * @param objects
     */
    public static void SortObjectsNamesTM(String objects) {
        Timer timer=new Timer();
        String[] objectsNamesArray= Utils.StringToArray(objects);
        Map<Integer,String> objectsNames=new TreeMap<>();
        Integer code=100001;
        for (int i=0;i<objectsNamesArray.length;i++){
            objectsNames.put(code,objectsNamesArray[i]);
            code++;
        }
        prn("\nДобавление элементов в Treemap. "+timer);
        Utils.printTreemap(objectsNames);
        List <Integer> keys=new ArrayList<>();
        List <String> duplicates=new ArrayList<>();
        for (Map.Entry<Integer,String> entry: objectsNames.entrySet()){
            if (duplicates.contains(entry.getValue())) {
                keys.add(entry.getKey());
            }
            else {
                duplicates.add(entry.getValue());
            }
        }

        for (Integer entry:keys){
            objectsNames.remove(entry);
        }
        prn("\nУдаление элементов из TreeMap. "+timer);
        Utils.printTreemap(objectsNames);
    }

    /**
     * Построение списка из наименований,содержащихся в строке с использованием HashMap
     * @param objects
     */
    public static void SortObjectsNamesHM(String objects) {
        Timer timer=new Timer();
        String[] objectsNamesArray=Utils.StringToArray(objects);
        Map<Integer,String> objectsNames=new HashMap<>();
        Integer code=100001;
        for (int i=0;i<objectsNamesArray.length;i++){
            objectsNames.put(code,objectsNamesArray[i]);
            code++;
        }
        prn("\nДобавление элементов в HashMap. "+timer);
        Utils.printHashmap(objectsNames);
        List <Integer> keys=new ArrayList<>();
        List <String> duplicates=new ArrayList<>();
        for (Map.Entry<Integer,String> entry: objectsNames.entrySet()){
            if (duplicates.contains(entry.getValue())) {
                keys.add(entry.getKey());
            }
            else {
                duplicates.add(entry.getValue());
            }
        }

        for (Integer entry:keys){
            objectsNames.remove(entry);
        }
        prn("\nУдаление элементов из HashMap. "+timer);
        Utils.printHashmap(objectsNames);
    }

    public static class Timer {
        private  long iniTime;
        private  Double Delta;
        public Timer(){
            iniTime=System.nanoTime();
        }
        public  String toString(){
            Delta=(double)(System.nanoTime()-iniTime)/1000;
            iniTime=System.nanoTime();
            return "Прошло "+Delta.toString()+" микросекунд.";
        }

    }
}
