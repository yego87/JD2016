package by.it.Baranova.JD01_12_Collections.Task_1.A2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Ekaterina on 3/2/16.
 */
public class MyCollection {
    /** Метод для поиска пересечения матриц типа Integer
     * @deprecated
     * Для поиска пересечения матриц лучше использовать Generics класс GetCross
     * @param matrixA
     * @param matrixB
     * @return матрица C
     */
    public static Set<Integer> getCross (Integer[] matrixA, Integer[] matrixB){

        List<Integer> listA= Arrays.asList(matrixA);
        List <Integer> listB=Arrays.asList(matrixB);
        Set<Integer> A = new HashSet<>(listA);
        System.out.println("A="+A);
        Set<Integer> B=new HashSet<>(listB);
        System.out.println("B="+B);
        Set <Integer> C=new HashSet<>();


        for (Integer element:A) {
            if (B.contains(element)) {
                C.add(element);
            }
        }
        return C;
    }

    /** Метод для поиска объединения матриц типа Integer
     * @deprecated
     * Для поиска обьединения матриц лучше использовать Generics класс GetUnion
     * @param matrixA
     * @param matrixB
     * @return матрица С
     */
    public static  Set<Integer> getUnion (Integer[] matrixA, Integer[] matrixB){
        List<Integer> listA= Arrays.asList(matrixA);
        List <Integer> listB=Arrays.asList(matrixB);
        Set<Integer> A = new HashSet<>(listA);
        System.out.println("A="+A);
        Set<Integer> B=new HashSet<>(listB);
        System.out.println("B="+B);
        Set<Integer> C=new HashSet<>(A);
        A.removeAll(B);
        for (Integer element:B) {
            C.add(element);
        }
        for (Integer element:A){
            C.add(element);
        }
        return C;
    }

}
