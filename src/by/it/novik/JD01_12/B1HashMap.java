package by.it.novik.JD01_12;


import java.util.HashMap;
import java.util.Map;

public class B1HashMap {

    public static void main(String[] args) {

        String s =  ("The news that a wealthy young gentleman " +
                "named Charles Bingley has rented the manor known as Netherfield Park" +
                " causes a great stir in the neighboring village of Longbourn, especially in the Bennet household." +
                " The Bennets have five unmarried daughters, and Mrs. Bennet, a foolish and fussy gossip," +
                " is the sort who agrees with the novel’s opening words: It is a truth universally acknowledged," +
                " that a single man in possession of a good fortune, must be in want of a wife. " +
                "She sees Bingley’s arrival as an opportunity for one of the girls to obtain a wealthy spouse," +
                " and she therefore insists that her husband call on the new arrival immediately. " +
                "Mr. Bennet torments his family by pretending to have no interest in doing so," +
                " but he eventually meets with Mr. Bingley without their knowing. " +
                "When he reveals to Mrs. Bennet and his daughters that he has made their new neighbor’s acquaintance," +
                " they are overjoyed and excited.").replace(".", "");


        String[] s1 = s.split("[.;:,?!)(/']*\\s+");//\b(\w*)\b

        System.out.println(hm(s1));

    }

    public static Map<String,Integer> hm(String [] s) {

        Map<String,Integer> hashMap= new HashMap<String,Integer>();

        for (int i = 0; i < s.length; i++){
            if (hashMap.containsKey(s[i])) {
                hashMap.put(s[i],hashMap.get(s[i]) + 1);
            } else {
                hashMap.put(s[i], 1);
            }
        }

        return hashMap;

    }
}

