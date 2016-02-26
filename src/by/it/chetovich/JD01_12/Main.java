package by.it.chetovich.JD01_12;

import by.it.chetovich.JD01_09.Counting;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user_2 on 26.02.2016.
 */
public class Main {

    public static void main(String[] args) {

        boolean isPositiveElements = true;
        List<Integer> votes = CreatingArrayList.createArrayList(isPositiveElements); //создаём список оценок от 1 до 10
        List<Integer> goodVotes = CreatingArrayList.createGoodVotesList(votes); //создаём список положительных оценок больше 4

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

        List<Integer> listik = CreatingArrayList.createArrayList(!isPositiveElements);
        //PrintingList.printList(listik);
        Collections.sort(listik, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        System.out.println("List sorted, negative elements in the end: ");
        PrintingList.printList(listik);

        String text = "According to both Landnámabók and Íslendingabók, Celtic monks known as the Papar lived in Iceland before " +
                "Scandinavian settlers arrived, possibly members of a Hiberno-Scottish mission. Recent archaeological excavations " +
                "have revealed the ruins of a cabin in Hafnir on the Reykjanes peninsula. Carbon dating indicates that it was abandoned " +
                "sometime between 770 and 880." +
                "Swedish Viking explorer Garðar Svavarsson was the first to circumnavigate Iceland in 870 and establish that it" +
                " was an island. He stayed over winter and built a house in Húsavík. Garðar departed the following summer " +
                "but one of his men, Náttfari, decided to stay behind with two slaves. Náttfari settled in what is now known as" +
                " Náttfaravík and became the first permanent resident of Iceland.";

        PrintingMap.printMap(CountingWords.countWords(text));



    }
}
