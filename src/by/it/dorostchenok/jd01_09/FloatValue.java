package by.it.dorostchenok.jd01_09;

import by.it.dorostchenok.jd01_09.interfaces.Add;
import by.it.dorostchenok.jd01_09.interfaces.Devide;
import by.it.dorostchenok.jd01_09.interfaces.Multiple;
import by.it.dorostchenok.jd01_09.interfaces.Substract;

public class FloatValue extends AbstractValue implements Add, Multiple, Substract, Devide{

    public FloatValue(double value){
        super(value);
    }

    @Override
    public Value add(Value val1, Value val2) {
        return new FloatValue((Double) val1.getValue() + (Double)val2.getValue());
    }

    @Override
    public Value multiple(Value val1, Value val2) {
        return new FloatValue((Double) val1.getValue() * (Double)val2.getValue());
    }

    @Override
    public Value substract(Value val1, Value val2) {
        return new FloatValue((Double) val1.getValue() - (Double)val2.getValue());
    }

    @Override
    public Value devide(Value val1, Value val2) {
        return new FloatValue((Double) val1.getValue() / (Double)val2.getValue());
    }
}
