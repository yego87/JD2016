package by.it.predkel.JD12Collections;

/**
 * Created by user_2 on 26.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        StudentsMarks.mark();
        MyCollection.input();
        MyCollection.getCross();
        MyCollection.getUnion();
        LikeASort.miniSort();
        DeleteWords.delete();
        DeleteCircle.runDelete();
        MyTreeMap.treeMap();
        LevelA2Update.input();
        LevelA2Update.getCross();
        LevelA2Update.getUnion();
        //ParseString.run("()())(((");
        System.out.print(ParseString.run("({}[])[hey]i{am[your]friend}"));
    }
}
