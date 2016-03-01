package by.it.dorostchenok.jd01_12.variant_c.tasks;

import java.util.ArrayDeque;
import java.util.Deque;

public class VariantC3 {

    public boolean checkBrackets(String stringToCheck){

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : stringToCheck.toCharArray()){

            if ('(' == c || '[' == c || '{' == c){
                deque.push(c);
                continue;
            }

            if (')' == c || ']' == c || '}' == c){
                if (!deque.isEmpty()){
                    char c1 = deque.pop();
                    if ((c1 == '(' && c == ')') || (c1 == '[' && c == ']') || (c1 == '{' && c == '}')){
                        continue;
                    }
                    else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }

        if (!deque.isEmpty()){
            return false;
        }

        return true;
    }
}
