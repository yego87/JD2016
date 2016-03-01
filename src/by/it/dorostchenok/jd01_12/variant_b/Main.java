package by.it.dorostchenok.jd01_12.variant_b;

import by.it.dorostchenok.jd01_12.variant_b.tasks.VariantB1;
import by.it.dorostchenok.jd01_12.variant_b.tasks.VariantB2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        /**
         * B1. Задать текст на английском языке (100 и более слов). Вывести все различные слова. Для каждого слова
         подсчитать частоту его встречаемости. Слова, отличающиеся регистром букв, считать различными.
         Использовать класс HashMap.
         */
        VariantB1 variantB1 = new VariantB1();
        variantB1.printWordCount();
        variantB1.printUniqueWords();

        /**
         * B2. В кругу стоят N человек, пронумерованных от 1 до N. При ведении счета по кругу вычеркивается каждый
         второй человек, пока не останется один. Составить два метода processArray и prоcessLinked
         моделирующие процесс. Первый должен использовать класс ArrayList, а второй — LinkedList. Какой из
         двух методов работает быстрее? Почему? Докажите. (см. пример на слайдах).
         */
        int listLegth = 100000;
        VariantB2 variantB2 = new VariantB2();

        List<String> list = variantB2.genArrayList(listLegth, true);
        long before = System.currentTimeMillis();
        List<String> l = variantB2.processList(list);
        long after = System.currentTimeMillis();
        System.out.println("Удаление из " + l.getClass().getSimpleName() + " " + (after - before) + " миллисек");

        list = variantB2.genArrayList(listLegth, false);
        before = System.currentTimeMillis();
        l = variantB2.processList(list);
        after = System.currentTimeMillis();
        System.out.println("Удаление из " + l.getClass().getSimpleName() + " " + (after - before) + " миллисек");
        /*
        В данном случае ArrayList будет быстрее, потому что для того, чтобы "вычеркнуть" каждого второго,
        нужно итерировать список по индексу. Реализация LinkedList "не знает" какой индекс у элемента
        поэтому каждый раз лист считает заново. При использовании итератора вставка и удаление в середину LinkedList
        будет быстрее, потому что каждый элемент соержит сслыку на следующий и она просто перезаписывается при вставке.
         */
    }
}
