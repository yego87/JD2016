package by.it.chetovich.JD01_12;

import java.util.*;

/**
 * JD01_12
 */
public class Main {

    public static void main(String[] args) {

        boolean isPositiveElements = true;
        List<Integer> votes = CreatingRandomArrayList.createArrayList(isPositiveElements, 20); //создаём список оценок от 1 до 10
        List<Integer> goodVotes = CreatingRandomArrayList.createGoodVotesList(votes); //создаём список положительных оценок больше 4

        System.out.print("Votes list: ");
        PrintingList.printList(votes);
        System.out.print("Good votes list: ");
        PrintingList.printList(goodVotes);

        Set<Integer> setA = CreatingRandomSet.createRandomSet();
        Set<Integer> setB = CreatingRandomSet.createRandomSet();

        System.out.println("First set: ");
        PrintingList.printList(setA);
        System.out.println("Second set: ");
        PrintingList.printList(setB);

        System.out.println("Union of two sets: ");
        PrintingList.printList(MyCollect.getUnion(setA,setB));
        System.out.println("Cross of two sets: ");
        PrintingList.printList(MyCollect.getCross(setA, setB));

        List<Integer> listik = CreatingRandomArrayList.createArrayList(!isPositiveElements, 20);
        //PrintingList.printList(listik);
        Collections.sort(listik, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        System.out.println("List sorted, negative elements in the end: ");
        PrintingList.printList(listik);


        //Задание B1

        String text = "According to both Landnámabók and Íslendingabók, Celtic monks known as the Papar lived in Iceland before " +
                "Scandinavian settlers arrived, possibly members of a Hiberno-Scottish mission. Recent archaeological excavations " +
                "have revealed the ruins of a cabin in Hafnir on the Reykjanes peninsula. Carbon dating indicates that it was abandoned " +
                "sometime between 770 and 880." +
                "Swedish Viking explorer Garðar Svavarsson was the first to circumnavigate Iceland in 870 and establish that it" +
                " was an island. He stayed over winter and built a house in Húsavík. Garðar departed the following summer " +
                "but one of his men, Náttfari, decided to stay behind with two slaves. Náttfari settled in what is now known as" +
                " Náttfaravík and became the first permanent resident of Iceland.";

        PrintingMap.printMap(CountingWords.countWords(text));



        //Задание B2

        //создаём два списка Array и Linked с одинаковым содержанием и длиной
        ArrayList<Integer> peopleInArrayCircle = CreatingList.createArrayList(10000);
        LinkedList<Integer> peopleInLinkedCircle = CreatingList.createLinkedList(10000);

        System.out.println("Delete using indexes:");
        //считаем, сколько времени занимает метод удаления элементов из ArrayList с использованием индексов
        long arrayProcess = ProcessArrayOrLinked.processA(peopleInArrayCircle);
        //считаем, сколько времени занимает метод удаления элементов из LinkedList с использованием индексов
        long linkedProcess = ProcessArrayOrLinked.processL(peopleInLinkedCircle);
        System.out.println("Deleting time for ArrayList: "+arrayProcess+", same operation for LinkedList: "+linkedProcess);

        System.out.println("Delete using Iterator:");
        //считаем, сколько времени занимает метод удаления элементов из ArrayList с использованием итератора
        long arrayProcessI = ProcessArrayOrLinked.processArrayIterator(peopleInArrayCircle);
        //считаем, сколько времени занимает метод удаления элементов из LinkedList с использованием итератора
        long linkedProcessI = ProcessArrayOrLinked.processLinkedIterator(peopleInLinkedCircle);
        System.out.println("Deleting time for ArrayList: "+arrayProcessI+", same operation for LinkedList: "+linkedProcessI);


        //Задание C1

        String s = " дом машина яблоко компьютер ручка молоко бумага шкаф телефон ручка карта молоко гвоздь";
        Map<String,String> map = CreatingMapWithCodes.createMap(s);
        System.out.println(map);
        Map<String,String> mapSorted = CreatingMapWithCodes.sortMap(map);
        System.out.println(mapSorted);
        Map<String,String> mapSharpened = CreatingMapWithCodes.sharpenMap(map);
        System.out.println(mapSharpened);




    }
}
