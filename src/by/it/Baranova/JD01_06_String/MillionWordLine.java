package by.it.Baranova.JD01_06_String;

/**
 * Created by Ekaterina on 2/16/16.
 */
public class MillionWordLine {
    /**
     * Составление строки длиной 1000000 символов, используя concat
     * @param poetry
     * @return
     */
    public static long CreateMillionLine (String [] poetry){
        long starttime=System.currentTimeMillis();
        int n=poetry.length;
        String [] wordsnew=new String[n];
        for (int i=0;i<n;i++){
            wordsnew[i]=poetry[i];
        }
        String newline="";
        int check=1;
        while (check!=0) {
            int l=newline.length();
            int m= (int) (Math.random()*n);
            if (wordsnew[m].length()<1000000-l-1) {
                newline = newline.concat(wordsnew[m]);
                newline=newline.concat(" ");
            }
            else {
                check=0;
            }
        }

        int l=1000000-newline.length();
        check=1;
        int i=0;
        while (check!=0&&i<n){
            if (wordsnew[i].length()==l){
                newline=newline.concat(wordsnew[i]);
                check=0;
            }
            else {
                i++;
            }
        }
        long finishtime=System.currentTimeMillis();
        long timeTocomplete=finishtime-starttime;
        return timeTocomplete;
    }

    /**
     * Составление строки длиной 1000000 символов, используя StringBuilder
     * @param poetry
     * @return
     */
    public static long CreateMillionLineSB (String [] poetry){
        long starttime=System.currentTimeMillis();
        int n=poetry.length;
        String [] wordsnew=new String[n];
        for (int i=0;i<n;i++){
            wordsnew[i]=poetry[i];
        }
        StringBuilder newline=new StringBuilder("");
        int check=1;
        while (check!=0) {
            int l=newline.length();
            int m= (int) (Math.random()*n);
            if (wordsnew[m].length()<1000000-l-1) {
                newline=newline.append(wordsnew[m]);
                newline=newline.append(" ");
            }
            else {
                check=0;
            }
        }

        int l=1000000-newline.length();
        check=1;
        int i=0;
        while (check!=0&&i<n){
            if (wordsnew[i].length()==l){
                newline=newline.append(wordsnew[i]);
                check=0;
            }
            else {
                i++;
            }
        }
        long finishtime=System.currentTimeMillis();
        long timeTocomplete_SB=finishtime-starttime;
        return timeTocomplete_SB;
    }
}
