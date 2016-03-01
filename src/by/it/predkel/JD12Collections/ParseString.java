package by.it.predkel.JD12Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Admin on 01.03.2016.
 */
public class ParseString {
    /*public static void run(String s){
        ArrayList<Character> bracketsCir=new ArrayList<>();

        Pattern pat = Pattern.compile("[\\(\\)]");
        Matcher mat = pat.matcher(s);
        while (mat.find()){
            bracketsCir.add(mat.group().charAt(0));
        }


        Pattern pat2 = Pattern.compile("[\\{\\}]");
        Matcher mat2 = pat.matcher(s);
        while (mat.find()){
            bracketsCir.add(mat.group().charAt(0));
        }
        if (bracketsCir.size()%2!=0)
            throw new IllegalArgumentException();
        System.out.println(bracketsCir);
        Iterator itCir = bracketsCir.iterator();



            if (!itCir.equals(itCir.next())) {
                bracketsCir.remove(itCir);

            }

        System.out.println(bracketsCir);
        }
*/
    public static boolean run(String str) {
        StringBuffer brackets = new StringBuffer();
        Pattern pat = Pattern.compile("[\\(\\)\\[\\]\\{\\}]");
        Matcher mat = pat.matcher(str);
        while (mat.find()) {
            brackets.append(mat.group());
        }
        boolean result = true;
        Stack<Character> stack = new Stack<Character>();
        char current, previous;
        for (int i = 0; i < brackets.length(); i++) {
            current = brackets.charAt(i);
            if (current == '(' || current == '[' || current == '{') {
                stack.push(current);
            } else if (current == ')' || current == ']' || current == '}') {
                if (stack.isEmpty()) {
                    result = false;
                } else {
                    previous = stack.peek();
                    if ((current == ')' && previous == '(') || (current == ']' && previous == '[') || (current == '}' && previous == '{')) {
                        stack.pop();
                    } else {
                        result = false;
                    }
                }
            }
        }
        if (!stack.isEmpty()) {
            result = false;
        }
        return result;
    }
}

