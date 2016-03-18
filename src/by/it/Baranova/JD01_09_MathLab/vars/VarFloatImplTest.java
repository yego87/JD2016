package by.it.Baranova.JD01_09_MathLab.vars;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Assert;


public class VarFloatImplTest {

    @org.junit.Test
    public void testAdd() throws Exception {
        String res=new VarFloatImpl(2).add(new VarFloatImpl(3)).toString();
        assertEquals("5.0",res);

    }

    @org.junit.Test
    public void testSub() throws Exception {
        String res=new VarFloatImpl("5").sub(new VarFloatImpl("3")).toString();
        assertEquals("2.0",res);
    }

    @org.junit.Test
    public void testDiv() throws Exception {
        String res=new VarFloatImpl("15").div(new VarFloatImpl("5")).toString();
        assertEquals("3.0",res);
    }

    @org.junit.Test
    public void testMul() throws Exception {
        String res=new VarFloatImpl("2").mul(new VarFloatImpl("3")).toString();
        assertEquals("6.0",res);
    }
}