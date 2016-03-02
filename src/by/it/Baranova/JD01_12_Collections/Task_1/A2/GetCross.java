package by.it.Baranova.JD01_12_Collections.Task_1.A2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Ekaterina on 2/28/16.
 */
public class GetCross<T> {
    /**
     * Метод Generics для поиска пересечения матриц произвольных типов
     * @Target(ElementType.METHOD)
     * @Retention(RetentionPolicy.RUNTIME)
     * @param matrixA
     * @param matrixB
     */
    public void getCrossArrays(T [] matrixA, T [] matrixB) {
        List<T> listA= Arrays.asList(matrixA);
        List <T> listB=Arrays.asList(matrixB);
        Set<T> A = new HashSet<>(listA);
        Set<T> B=new HashSet<>(listB);
        Set <T> C=new HashSet<>();
        for (T element:A) {
            if (B.contains(element)) {
            C.add(element);
            }
        }
        System.out.println("Пересечение множеств A и B = "+C);
    }
}


