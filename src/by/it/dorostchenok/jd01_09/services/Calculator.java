package by.it.dorostchenok.jd01_09.services;

import by.it.dorostchenok.jd01_09.interfaces.Calc;
import by.it.dorostchenok.jd01_09.values.FloatValue;
import by.it.dorostchenok.jd01_09.values.Value;


public class Calculator implements Calc {
    @Override
    public Value add(Value val1, Value val2) {
        if (val1 instanceof FloatValue && val2 instanceof FloatValue){
            return new FloatValue(Double.parseDouble(val1.getValue()) + Double.parseDouble(val2.getValue()));
        }

        return null;
    }

    @Override
    public Value sub(Value val1, Value val2) {
        if (val1 instanceof FloatValue && val2 instanceof FloatValue){
            return new FloatValue(Double.parseDouble(val1.getValue()) - Double.parseDouble(val2.getValue()));
        }
        return null;
    }

    @Override
    public Value mul(Value val1, Value val2) {
        if (val1 instanceof FloatValue && val2 instanceof FloatValue){
            return new FloatValue(Double.parseDouble(val1.getValue()) * Double.parseDouble(val2.getValue()));
        }
        return null;
    }

    @Override
    public Value div(Value val1, Value val2) {
        if (val1 instanceof FloatValue && val2 instanceof FloatValue){
            return new FloatValue(Double.parseDouble(val1.getValue()) / Double.parseDouble(val2.getValue()));
        }
        return null;
    }


}
