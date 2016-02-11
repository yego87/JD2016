package by.it.akhmelev.JD01_05;

public class EqualStrings {
    public static void main(String[ ] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        String s4 = new String(s1);
        System.out.println(s1 + "==" + s2 + " : " + (s1 == s2)); // true
        System.out.println(s3 + "==" + s4 + " : " + (s3 == s4)); // false
        System.out.println(s1 + "==" + s3 + " : " + (s1 == s3)); // false
        System.out.println(s1 + " equals " + s2 + " : " + s1.equals(s2)); // true
        System.out.println(s1 + " equals " + s3 + " : " + s1.equals(s3)); // true
    }
}
