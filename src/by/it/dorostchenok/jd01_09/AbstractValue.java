package by.it.dorostchenok.jd01_09;

public class AbstractValue<T> implements Value{

    T value;

    public AbstractValue(T value){
        this.value = value;
    }

    @Override
    public T getValue() {
        return value;
    }
}
