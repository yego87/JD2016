package by.it.dorostchenok.jd01_09.services;

import by.it.dorostchenok.jd01_09.interfaces.VariableStorageDAO;
import by.it.dorostchenok.jd01_09.values.Value;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VariableStorageMapImpl implements VariableStorageDAO {

    private Map<String, Value> valueStorageMap = new HashMap();

    @Override
    public Value getVariable(String variableName) {
        //Value value = valueStorageMap.get(variableName);
        return valueStorageMap.get(variableName);
    }

    @Override
    public void setVariable(String variableName, Value value) {
        valueStorageMap.put(variableName, value);
    }

    @Override
    public List<Value> getAll() {
        List<Value> varList = new ArrayList<>(valueStorageMap.values());

        return varList;
    }
}
