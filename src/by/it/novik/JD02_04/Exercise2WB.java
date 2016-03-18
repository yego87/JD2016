package by.it.novik.JD02_04;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise2WB {

    public static void main(String[] args) {

        String str = "0x10 15 54 0x15";

        String[] arr = str.split(" ");
        for (String s:arr) {
            Pattern pattern = Pattern.compile("0x([0-9]+)");
            Matcher matcher = pattern.matcher(s);
            while (matcher.find()) {
             System.out.println(matcher.group() + ": " + Integer.parseInt(matcher.group(1),16));
            }
        }
    }

}


