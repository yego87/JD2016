package by.it.chetovich.JD01_06String;

import java.util.regex.Pattern;

/**
 *formats a poem
 */
public class C1BothSidesFormat {
    public void formatText (StringBuilder s){
        Pattern pat = Pattern.compile("\\s*\\n+\\s*");
        String [] array  = pat.split(s);
        for (String s1 : array) {
            s1=s1.trim();
            System.out.println(s1);
        }
        int max = 0;
        for (String s1 : array) {
            if (s1.length()>max) max = s1.length();
        }


        System.out.println(max);

        for (String s1 : array) {
            int deltaLength = max - s1.length();
            StringBuilder lineBuilder = new StringBuilder(s1);
            int k = 0;
            //double spacesForOneTime = (double)deltaLength/spaceQuantity;
            //int spacesForOneTimeInt = spaceQuantity.

            while (lineBuilder.length()<=max) {
                for (int j = 0; j < lineBuilder.length(); j++) {
                    if (k<=deltaLength) {
                        if (lineBuilder.charAt(j) == ' ') {
                            lineBuilder.insert(j, ' ');
                            j++;
                            k++;
                        }
                    }
            }

            }
            System.out.println(lineBuilder);
        }

    }
}
