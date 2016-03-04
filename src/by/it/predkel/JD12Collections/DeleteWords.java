package by.it.predkel.JD12Collections;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user_2 on 26.02.2016.
 */
public class DeleteWords {
    public static void delete() {
        String text = "I am going to tell you about my school. My school is new and modern and I like it very much. It has three floors. The classrooms are light and spacious. There are classrooms for different subjects, such as English, History, Physics, Mathematics, Chemistry, Geography, Biology Literature etc.\n" +
                "\n" +
                "There is a computer class in our school. We study computer science here. The computer class has the most modern equipment and the Internet access.\n" +
                "\n" +
                "We’ve also an assembly hall, which is situated on the second floor. Meetings, conferences, concerts and all the celebrations take place here. We prepare different performances for all holidays. We sing songs, recite poetry, dance, and participate in theatre performances.\n" +
                "\n" +
                "There are many opportunities to go in for sports in our school. Our school has a gym, a sports ground, a football field, a swimming pool, and other sports facilities. There are many different sports groups: table tennis, swimming, athletics, football, volleyball, wrestling, and rhythmic gymnastics. Many pupils of our school attend these sports groups.\n" +
                "\n" +
                "In our school we have also painting group, dance group, theatre group and rock group. All these groups are very popular and many pupils attend them.";
        HashMap<String,Integer> word=new HashMap<>();
        Pattern pat=Pattern.compile("[A-Za-z]+");
        Matcher mat=pat.matcher(text);
        while (mat.find()){
            if (!word.containsKey(mat.group())) {
                word.put(mat.group(), 1);
            }else {
                int temp=word.get(mat.group())+1;
                word.put(mat.group(),temp);
            }
        }
        System.out.println(word);
    }
}
