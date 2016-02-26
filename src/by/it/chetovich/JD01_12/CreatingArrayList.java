package by.it.chetovich.JD01_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by user_2 on 26.02.2016.
 */
public class CreatingArrayList {

    public static ArrayList<Integer> createArrayList (boolean isPositiveElements){

        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();
        if (isPositiveElements) {
            for (int i = 0; i < 20; i++) {
                list.add(rand.nextInt(10) + 1);
            }
        }
        else{
            for (int i = 0; i < 20; i++) {
                list.add(rand.nextInt(10) -5);
            }

        }

        return list;
    }

    public static ArrayList<Integer> createGoodVotesList (List<Integer> list){

        ArrayList<Integer> goodVotes = new ArrayList<>();
        for (Integer vote : list) {
            if (vote>3) goodVotes.add(vote);
        }
        return goodVotes;
    }
}
