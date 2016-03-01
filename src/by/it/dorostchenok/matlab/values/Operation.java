package by.it.dorostchenok.matlab.values;

public enum Operation {
    ADD("+"),
    SUB("-"),
    MUL("*"),
    DIV("/"),
    ASG("=");

    private String operation;
    Operation(String operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return operation;
    }
}
