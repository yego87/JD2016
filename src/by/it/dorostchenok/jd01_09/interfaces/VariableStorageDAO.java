package by.it.dorostchenok.jd01_09.interfaces;

import by.it.dorostchenok.jd01_09.values.Value;

import java.util.List;

public interface VariableStorageDAO {
    Value getVariable(String variableName);
    void setVariable(String variableName, Value value);
    List<Value> getAll();
}
