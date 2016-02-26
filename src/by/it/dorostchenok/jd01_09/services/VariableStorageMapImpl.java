package by.it.dorostchenok.jd01_09.services;

import by.it.dorostchenok.jd01_09.interfaces.StorageDAO;
import by.it.dorostchenok.jd01_09.values.Value;

import java.util.HashMap;
import java.util.Map;

public class VariableStorageMapImpl implements StorageDAO{

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
}
