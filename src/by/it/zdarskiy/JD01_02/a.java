package by.it.zdarskiy.JD01_02;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sleig_000 on 14.02.2016.
 */
public class a  {
    public static void main (String[] args) throws IOException {
        RFC rfc = new RFC();
        rfc.ReadArray();
        rfc.PrintArray();
        rfc.LongAndShort();
        rfc.SR();
        rfc.DifferentNum();
        rfc.Polindrom();//fgfdg
    }
        public static class RFC {
            int[] chArray={};
            String[] stArray={};
            public String[] ReadArray() throws IOException {
               InputStreamReader inputStreamReader=new InputStreamReader(System.in);
               BufferedReader bufferedReader=new BufferedReader (inputStreamReader);
               String rLine=bufferedReader.readLine();
               bufferedReader.close();
                //String rLine = "21 606 18 254 2112 6578421";
                stArray = rLine.split(" ");
                chArray = new int[stArray.length];
                for (int i = 0; i < stArray.length; i++) {
                    chArray[i]=Integer.valueOf(stArray[i]);
                }
                bufferedReader.close();
                return stArray;
            }

            public void PrintArray(){
                for (String k:stArray)
                    System.out.print(k + " ");
                System.out.println();
            }

            public void LongAndShort(){
                int Long=stArray[0].length();
                int Short=stArray[0].length();
                for (String st:stArray){
                    if(st.length()>Long)
                        Long=st.length();
                    else if(st.length()<Short)
                        Short=st.length();
                }
                System.out.print("Максимальная длинна:");
                for (String st:stArray){
                    if(Long==st.length())
                        System.out.print(st + " ");
                }

                System.out.println();

                System.out.print("Минимальная длинна: ");
                for (String st:stArray)
                    if(Short==st.length())
                        System.out.print(st + " ");
                System.out.println();
            }

            public void SR(){
                int sum=0;
                for (String st:stArray)
                    sum+=st.length();
                int sr = sum/stArray.length;
                System.out.print("Числа средней длинны: ");
                for (String st:stArray)
                    if(sr==st.length())
                        System.out.print(st + " ");
                System.out.println();
            }

            public void DifferentNum(){
                for (int ch:chArray){
                    char[] s = Integer.toString(ch).toCharArray();
                    boolean is=true;
                    for (int i = 0; i < s.length; i++) {
                        for (int j = i+1; j <s.length ; j++) {
                            if (s[i]==s[j])
                                is=false;
                        }
                    }
                    if(is){
                        System.out.println("Число с разными цифрами: "+ch);
                        break;
                    }
                }
            }

            public void Polindrom(){
                int n=0;
                System.out.print("Числа полиндромы: ");
                for (int k:chArray)
                {
                    char[] s = Integer.toString(k).toCharArray();
                    boolean isPolindrom = true;
                    for (int i = 0; i < s.length / 2; i++) {
                        if (s[i]!=s[s.length-1-i])
                            isPolindrom = false;
                    }
                    if (isPolindrom){
                        System.out.print(k+" ");
                        n++;
                    }
                    if(2==n)
                        break;
                }
            }

        }
    }

