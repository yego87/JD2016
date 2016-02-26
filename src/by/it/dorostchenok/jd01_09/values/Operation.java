package by.it.dorostchenok.jd01_09.values;

public enum Operation {
    ADD("+"),
    SUB("-"),
    MUL("*"),
    DIV("/");

    private String operation;
    Operation(String operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return operation;
    }
}
