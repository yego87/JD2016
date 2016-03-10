package by.it.veselov.JD01_12;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/**
 * Created by yegorveselov on 10.03.16.
 */
public class A_2 {


        public static void main(String[] args) {
            Set<Integer> a = new HashSet<>(Arrays.asList(1,2,3,4,5));
            Set<Integer> b = new HashSet<>(Arrays.asList(3,4,5,6,7));
            Set<Integer> myCollect = intersection(a, b);

            System.out.println(myCollect.toString());

        }

        static Set<Integer> intersection(Set<Integer> a, Set<Integer> b){
            a.retainAll(b);
            return a;

        }
    }

