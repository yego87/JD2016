package by.it.predkel.JD06String.LevelB;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * сортировка слов по вхождению в них символа, если равны то по алфавиту
 */
public class SortWords {
    public static void sortWords(String str,char symbol){
        //String[] sa = str.trim().split(" ");

        int dimension=0;
        ArrayList<String> list=new ArrayList<>();
        Pattern pat = Pattern.compile("([а-яА-яёЁ]{2,})");
        Matcher mat = pat.matcher(str);
        int max=0;
        while (mat.find()){
            dimension++;
            list.add(mat.group());
            if (max<mat.group().length()){
                max=mat.group().length();
            }
        }
       // String[] s=new String[dimension];

 //       Matcher mat1 = pat.matcher(str);
       // while (mat.find()){
          //  s[k]=mat.group();
          //  if (max<s[dimension].length()) {
          //      max = s[dimension].length();
          //  }
          //  k++;
     //   }

        int[] couns=new int[dimension];
        for (int i=0;i<list.size();i++){
            char[] syms=list.get(i).toCharArray();
            int counter=0;
            for (int j=0;j<syms.length;j++){
                if (syms[j]==symbol){
                    counter++;
                }
            }
            couns[i]=counter;
        }
        for (int i=0;i<dimension-1;i++){
            for (int j=i+1;j<dimension;j++){
                int comparison = list.get(i).toLowerCase().compareTo(list.get(j).toLowerCase());
                if ((couns[i]<couns[j])||((couns[i] == couns[j])&&(comparison>0))){
                        int tempc=couns[i];
                        String temps=list.get(i);
                        couns[i]=couns[j];
                        list.set(i,list.get(j));
                        couns[j]=tempc;
                        list.set(j,temps);
                    }
                }

            }
        for (String word: list) {
            System.out.print(word+" ");
        }
    }
}
