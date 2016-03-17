package by.it.daylidovich.FreeMathLab.variables.Tests;

import by.it.daylidovich.FreeMathLab.variables.Float.VariableFloat;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperationFloatTest {

    @Test
    public void testAdd() throws Exception {
        String res = (new VariableFloat(3).add(new VariableFloat(2))).toString();
        assertEquals("5.0", res);
    }

    @Test
    public void testSub() throws Exception {
        String res = (new VariableFloat(3).sub(new VariableFloat(2))).toString();
        assertEquals("1.0",res);
    }

    @Test
    public void testMult() throws Exception {
        String res = (new VariableFloat(3).mult(new VariableFloat(2))).toString();
        assertEquals("6.0",res);
    }

    @Test
    public void testDiv() throws Exception {
        String res = (new VariableFloat(3).div(new VariableFloat(2))).toString();
        assertEquals("1.5",res);
    }
}