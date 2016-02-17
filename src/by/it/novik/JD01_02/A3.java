package by.it.novik.JD01_02;


public class A3 {

   public static boolean equalNum(String s) {
       char[]chm = s.toCharArray();
       for (int i=0;i<s.length();i++) {
           for(int j = i+1;j<s.length();j++) {
               if (chm[i]==chm[j]) {
                   return true;
               }
           }
       }
       return false;
   }
    public static void printNumWithDifDigits(String[] arr) {
        for(int i=0; i<arr.length;i++ ) {
            if(!equalNum(arr[i])) {
                System.out.println(arr[i]);
                break;
            }


        }
    }
}
