package by.it.dorostchenok.jd01_12.variant_a;

import by.it.dorostchenok.jd01_12.variant_a.tasks.MyCollect;
import by.it.dorostchenok.jd01_12.variant_a.tasks.VariantA1;
import by.it.dorostchenok.jd01_12.variant_a.tasks.VariantA3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
        /**
         * A1. Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками. Удалить
         неудовлетворительные оценки из списка. Вывести на консоль оба варианта.
         */
        // Список из 20 оценок
        VariantA1 variantA1 = new VariantA1(20);
        List<Integer> marks = variantA1.getMarks();
        // первоначальный список
        variantA1.printList(marks);
        // новый список. Оценки ниже 5 удаляются
        variantA1.printList(variantA1.deleteBadMarks(4, marks));

        /**
         * A2. Определить два множества (A и B) на основе целых чисел. Создать отдельный класс MyCollect и
         статические методы в нем для определения пересечения множеств getCross и объединения множеств
         getUnion. Показать работу этих методов на примере двух множеств (A и B).
         */

        List<String> list1 = new ArrayList<>(Arrays.asList("a", "b", "c", "f", "g"));
        List<String> list2 = new ArrayList<>(Arrays.asList("b", "c", "d", "e"));
        List cross = MyCollect.getCross(list1, list2);
        System.out.println("Cross: " + Arrays.toString(cross.toArray()));
        list1 = new ArrayList<>(Arrays.asList("a", "b", "c", "f", "g"));
        list2 = new ArrayList<>(Arrays.asList("b", "c", "d", "e"));
        List union = MyCollect.getUnion(list1, list2);
        System.out.println("Union: " + Arrays.toString(union.toArray()));

        /**
         * A3. Не используя вспомогательных объектов, переставить отрицательные элементы произвольного
         списка чисел в конец, а положительные — в начало списка.
         */

        VariantA3 variantA3 = new VariantA3();
        // Новый список
        List<Integer> list = variantA3.generateList(10);
        variantA1.printList(list);
        Collections.sort(list);
        Collections.reverse(list);
        variantA1.printList(list);
    }

}
