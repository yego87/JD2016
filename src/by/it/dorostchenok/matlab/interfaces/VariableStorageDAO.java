package by.it.dorostchenok.matlab.interfaces;

import by.it.dorostchenok.matlab.values.Value;

import java.util.List;

public interface VariableStorageDAO {
    Value getVariable(String variableName);
    void setVariable(String variableName, Value value);
    List<Value> getAll();
}
