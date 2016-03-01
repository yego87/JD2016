package by.it.dorostchenok.jd01_12.variant_c;


import by.it.dorostchenok.jd01_12.variant_c.tasks.Element;
import by.it.dorostchenok.jd01_12.variant_c.tasks.VariantC2;
import by.it.dorostchenok.jd01_12.variant_c.tasks.VariantC3;

import java.util.*;

public class Main {
    public static void main(String[] args){

        /**
         * Во входном тексте хранятся наименования некоторых объектов. Построить список C1, элементы которого
         содержат наименования и шифры данных объектов, причем элементы списка должны быть упорядочены по
         возрастанию шифров. Затем «сжать» список C1, удаляя дублирующие наименования объектов.
         */
        // создаем список объектов
        String[] array = {"Apple", "Blackberry", "Cherry", "Avocado", "Feijoa", "Boysenberry", "Blackberry", "Avocado"};
        List<Element> c1 = new ArrayList<>();
        // Заполняем ArrayList
        for (String s : array){
            c1.add(new Element(s));
        }
        // Сортируем по возрастанию шифров. (привет Comparable)
        Collections.sort(c1);
        // Убеждаемся, что все отсортировано
        for (Element e : c1){
            System.out.println(e);
        }
        System.out.println("----------------------------------");
        // Экземпляр TreeSet позволяет хранить объекты отсортированными и не допускает дубликатов
        Set<Element> set = new TreeSet<>();
        // Заливаем список
        set.addAll(c1);
        // Снова убеждаемся, что все осталось отсортированным и исчезли дубликаты
        for (Element e : set){
            System.out.println(e);
        }
        // Заливаем в первоначальный лист. Лист "сжат". чтд
        c1.clear();
        c1.addAll(set);

        System.out.println("##################################");
        /**
         * Решить задачу A2 для произвольных типов данных во множествах.
         */
        VariantC2 c2 = new VariantC2();
        // при помощи шаблонов довольно легко решить проблему
        // Один метод используется для строк и целых чисел
        List<String> list1 = new ArrayList<>(Arrays.asList("a", "b", "c", "f", "g"));
        List<String> list2 = new ArrayList<>(Arrays.asList("b", "c", "d", "e"));
        List cross = c2.getCross(list1, list2);
        System.out.println("Cross String: " + Arrays.toString(cross.toArray()));
        list1 = new ArrayList<>(Arrays.asList("a", "b", "c", "f", "g"));
        list2 = new ArrayList<>(Arrays.asList("b", "c", "d", "e"));
        List union = c2.getUnion(list1, list2);
        System.out.println("Union String: " + Arrays.toString(union.toArray()));

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 6));
        List<Integer> list4 = new ArrayList<>(Arrays.asList(3, 4, 5, 7));
        List cross1 = c2.getCross(list3, list4);
        System.out.println("Cross Integer: " + Arrays.toString(cross1.toArray()));
        list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 6));
        list4 = new ArrayList<>(Arrays.asList(3, 4, 5, 7));
        List union1 = c2.getUnion(list3, list4);
        System.out.println("Union Integer: " + Arrays.toString(union1.toArray()));
        System.out.println("##################################");
        /**
         * Задана строка, состоящая из выражений и символов «(», «)», «[», «]», «{», «}». Проверить корректность
         расстановки скобок с помощью коллекций.
         */
        VariantC3 variantC3 = new VariantC3();
        // correct
        System.out.println(variantC3.checkBrackets("(((a+4)[(b)({})]()))"));
        // incorrect
        System.out.println(variantC3.checkBrackets("](()[()({})]()))"));
    }
}
