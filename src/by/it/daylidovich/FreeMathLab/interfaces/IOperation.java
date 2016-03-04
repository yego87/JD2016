package by.it.daylidovich.FreeMathLab.interfaces;

import by.it.daylidovich.FreeMathLab.variables.Variable;

public interface IOperation {
    Variable add(Variable variable);
    Variable sub(Variable variable);
    Variable mult(Variable variable);
    Variable div(Variable variable);
    void save(String name);
}
