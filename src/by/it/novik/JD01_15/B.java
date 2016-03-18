package by.it.novik.JD01_15;



import java.io.*;
import java.util.ArrayList;

public class B {
    public static void main(String[] args) {


        String src = System.getProperty("user.dir");//making a path
        String way = src + "/src/by/it/novik/JD01_15/B.java";
        File file = new File(way);
        StringBuilder sb = new StringBuilder();
        try (BufferedReader bf = new BufferedReader(new FileReader(file))){
            String str;

            while ((str = bf.readLine()) != null) {//while it contains anything

                sb.append(str);//add

                sb.append("\n");
            }
        }
        catch (IOException e){
            System.out.println("File not found " + file.toString());//if not exists
        }


        System.out.println(sb);
        StringBuilder noComment = removeComments(sb);//deleting comments
        String src1 = System.getProperty("user.dir");
        String way1 = src1 + "/src/by/it/novik/JD01_15/B.txt";
        File thisText = new File(way1);
        printToConsole(noComment, thisText);
    }
    public static StringBuilder removeComments (StringBuilder sb){//method  that deletes comments

        String str = sb.toString();


        String regexp = "/[*]{1,2}.+?((\n.+)+)?[*]/|[/]{2}.+";
        str.split(regexp);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(str);//adding sting to arraylist
        StringBuilder output = new StringBuilder();
        for (String strn : arrayList) {

            output.append(strn);
        }
        return output;

    }

    public static void printToConsole (StringBuilder s, File file){

        String str = s.toString();
        try (BufferedReader bf = new BufferedReader(new StringReader(str))){
            String strn;
            int count = 1;
            while ((strn = bf.readLine()) != null){
                System.out.print(count + " ");
                System.out.println(strn);
                writeAFile(count,strn,file);
                count++;
            }
        }
        catch (IOException e){
            System.out.println("Could not read the file " + file.toString());
        }
    }

    public static void writeAFile (int count, String str, File file){

        try (PrintWriter printWriter = new PrintWriter(new FileWriter(file, true))){
            printWriter.print(count + " ");
            printWriter.println(str);
        }
        catch (IOException e){
            System.out.println("Not found " + file.toString());
        }
    }
}
