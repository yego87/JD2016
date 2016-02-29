package by.it.dorostchenok.matlab.services;

import by.it.dorostchenok.matlab.interfaces.Calc;
import by.it.dorostchenok.matlab.values.FloatValue;
import by.it.dorostchenok.matlab.values.Value;
import by.it.dorostchenok.matlab.values.Variable;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Calculator implements Calc {

    public Value calculate(Expression expression) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method;
        method = this.getClass().getMethod(expression.getOperation().name().toLowerCase(), Value.class, Value.class);
        Value result = (Value) method.invoke(this, expression.getFirstValue(), expression.getSecondValue());
        //return add(expression.getFirstValue(), expression.getSecondValue());
        return result;
    }

    public Value asg(Value val1, Value val2){
        Variable variable = new Variable(val1.getValue());
        variable.setVariableValue(val2);
        return variable;
    }

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
