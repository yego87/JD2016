package by.it.daylidovich.JD01_09.interfaces;

import by.it.daylidovich.JD01_09.varables.Variable;

public interface IOperation {
    Variable add(Variable variable);
    Variable sub(Variable variable);
    Variable mult(Variable variable);
    Variable div(Variable variable);
    void save(String name);
}
