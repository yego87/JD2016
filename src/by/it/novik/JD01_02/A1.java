package by.it.novik.JD01_02;

public class A1 {

    public static int intArray (int[] m) {
        if(0==m.length) {
            return Integer.MAX_VALUE;
        } else {
            int max = m[0];
            for (int n : m) {
                if (max < n) max = n;
                }
            return max;
            }
        }

    public static String maxString (String[] m) {

            int max = 0;
            String out="";
        for (int i = 0; i < m.length; i++) {

                if (max < m[i].length())
                {
                    max=m[i].length();
                    out=m[i];
                }
            }
            return out;
    }
            public static String minString (String[] m) {
                int min = Integer.MAX_VALUE;
                String out = "";
         
                for (int i = 0; i < m.length; i++) {
         
                    if (min > m[i].length())
                    {
                        min=m[i].length();
                        out=m[i];
                    }
                }
                return out;
            }
}