package by.it.dorostchenok.jd01_09.interfaces;

import by.it.dorostchenok.jd01_09.values.Value;

public interface StorageDAO {
    Value getVariable(String variableName);
    void setVariable(String variableName, Value value);
}
