package by.it.chetovich.Matlab;

import java.util.Map;
import java.util.TreeMap;

/**
 * Map with variables
 */
public class MapVariables {

    private static Map<String, Var> map = new TreeMap<>();

    public static Map<String, Var> getMap() {
        return map;
    }

    public static void addVariable (String var, Var value){
        map.put(var, value);
    }
}
