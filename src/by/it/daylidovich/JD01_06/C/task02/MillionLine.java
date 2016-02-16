package by.it.daylidovich.JD01_06.C.task02;

public class MillionLine {
    public static void createLine(String string){
        String[] array = CreatingArrays.createArrayOfWord(string);
        String stringOut = new String();
        int countSymbols = 1000000;
        while(1000000 != stringOut.length())
        {
            int n = (int) (Math.random()*array.length);
            if (countSymbols > array[n].length() && countSymbols > 1) {
                stringOut = stringOut + " " + array[n];
                countSymbols = countSymbols - array[n].length() - 1;
            }
        }
    }

    public static void createLine(StringBuilder string){
        StringBuilder[] array = CreatingArrays.createArrayOfWord(string);
        StringBuilder stringOut = new StringBuilder();
        int countSymbols = 1000000;
        while(1000000 != stringOut.length())
        {
            int n = (int) (Math.random()*array.length);
            if (countSymbols > array[n].length() && countSymbols > 1) {
                stringOut.append(' ').append(array[n]);
                countSymbols = countSymbols - array[n].length() - 1;
            }
        }
    }
}
