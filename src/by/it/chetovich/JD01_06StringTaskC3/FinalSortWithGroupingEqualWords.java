package by.it.chetovich.JD01_06StringTaskC3;

/**
 * groups equal words and returns a line with sorted words
 */
public class FinalSortWithGroupingEqualWords {
    public static StringBuilder groupEqualWords (String [] array){



        StringBuilder line = new StringBuilder();
        int count;
        for (int i = 0; i < array.length-1; i++) {

            if (!array[i].equals(array[i+1])) {
                line.append(array[i]);
                if (i<array.length-1) line.append(", ");
                else line.append(".");
            }
            else{
                count = 1;
                for (int j = i; j < array.length-1; j++) {
                if (array[i].equals(array[i+1])) {
                    count++;
                    i++;
                }
                }
                String s = array[i]+"("+count+ " раза)";
                line.append(s);
                if (i+1<array.length-1) line.append(", ");
                else line.append(".");
            }
            
        }
        return line;
    }
}
