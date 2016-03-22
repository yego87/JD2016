package by.it.chetovich.Matlab;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

/**
 * Matlab utils
 */
public class UtilsMatlab {


    /**
     *
     * @param s line to convert to array
     * @return array of 2 elements
     */
    public static String[] convertLineToArray (String s, String regex)throws ArrayIndexOutOfBoundsException,NullPointerException{

        Pattern pat = Pattern.compile(regex); //разбиваем на 2 переменных и  заносим их в массив
        String[] array = pat.split(s);

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].trim();
        }
        return array;
    }


    /**
     *
     * @param file where we should save variables
     */
    public static void saveVarsInFile ( File file){

        Map<String, Var> map = MapVariables.getMap();
        try (PrintWriter print = new PrintWriter(new FileWriter(file,true))){
            for (Map.Entry<String, Var> entry : map.entrySet()) {
                print.println(entry.getKey()+" = "+entry.getValue());
            }
        }
        catch (IOException e){
            System.out.println("Writing to file "+file+" failed.");
        }
    }


    /**
     *
     * @return map with variables saved in earlier sessions
     */
    public static Map <String, Var> putVarsFromFileIntoMap(){

        Map<String,Var> map = MapVariables.getMap();
        String src = System.getProperty("user.dir") + "/src/by/it/chetovich/Matlab/vars.txt";
        File file = new File(src);
        try(BufferedReader r = new BufferedReader(new FileReader(file))){
            String line;
            while ((line = r.readLine())!=null){
                String[] array = UtilsMatlab.convertLineToArray(line, "=");
                String a = array[0].trim();// имя переменной
                Var b = DefineVariable.defineVar(array[1]);  //второй операнд
                map.put(a, b);
            }
        }
        catch (IOException e){
            System.out.println(file+" file not read.");
        }
        return map;
    }


    /**
     *
     * @param var instance which field should be printed
     */
    public static void print (Var var) {

        if (var!=null) System.out.println(" = " + var+var.getType());
    }


    /**
     *
     * @param line line that has been entered by user (sortvar or printvar)
     * @param map from which the variables should be printed
     * @throws IOException
     */
    public static void printVarList (String line, Map <String, Var> map) throws IOException {

        if (!line.isEmpty()) {
            if ("printvar".equals(line)) UtilsMatlab.ifPrintvar(map);
            else{
                if ("sortvar".equals(line)) UtilsMatlab.ifSortvar(map);
                else {
                    System.out.println("Что-то вы не то ввели, может попробуете ещё раз.");
                    printVarList(enterLine(), map);
                }
            }
        }
    }


    /**
     *
     * @param map map with variables
     */
    public static void ifSortvar(Map<String, Var> map) throws IOException {

        if (!map.isEmpty()) {
            for (String s : map.keySet()) {
                System.out.println(s);
            }
        } else System.out.println("Список пуст.");
    }


    /**
     *
     * @param map map with variables
     */
    public static void ifPrintvar(Map<String, Var> map) {

        if (!map.isEmpty()) {
            for (Map.Entry<String, Var> entry : map.entrySet()) {
                System.out.println(entry.getKey()+" = "+entry.getValue());
            }
        } else System.out.println("Список пуст.");

    }


    /**
     *
     * @return line that has been entered by user
     * @throws IOException
     */
    public static String enterLine() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }


    /**
     *
     * @param s expression to calculate
     * @param array numbers to calculate
     * @return result, calculated by method count
     * @throws ErrorException
     * @throws ArrayIndexOutOfBoundsException
     * @throws NullPointerException
     */
    public static Var calculateWith2Operands (String s, String[] array) throws ErrorException, ArrayIndexOutOfBoundsException,NullPointerException {

        Var a = DefineVariable.defineVar(array[0]);  //первый операнд
        Var b = DefineVariable.defineVar(array[1]);  //второй операнд
        return Counting.count(a, b, s);
    }



}
