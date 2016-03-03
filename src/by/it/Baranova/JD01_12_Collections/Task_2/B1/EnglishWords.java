package by.it.Baranova.JD01_12_Collections.Task_2.B1;


import by.it.Baranova.JD01_12_Collections.Utils;

import java.util.*;

/**
 * Created by Ekaterina on 3/2/16.
 */
public class EnglishWords {
    /** Метод, подсчитывающий количество вхождений в тексте каждого слова
     * @Target(ElementType.METHOD)
     * @Retention(RetentionPolicy.RUNTIME)
     * @param b - String текст, передаваемый для обработки
     */
    public static void wordsQuantity (String b){
        String [] words= Utils.StringToArray(b);
        List<String> wordsArraylist= Arrays.asList(words);

        Map<String,Integer> wordsHashmap=new HashMap<>();
        Iterator<String> iter=wordsArraylist.iterator();
        while (iter.hasNext()){
            String element=iter.next();
            if (!wordsHashmap.containsKey(element)) {
                wordsHashmap.put(element, 1);
            }
            else {
                for (Map.Entry <String,Integer> pair: wordsHashmap.entrySet()){
                    if (pair.getKey().equals(element)){
                        Integer l=pair.getValue()+1;pair.setValue(l);
                    }
                }

            }
        }
        Utils.printHashmap1(wordsHashmap);
    }
}
