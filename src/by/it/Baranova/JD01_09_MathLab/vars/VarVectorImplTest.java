package by.it.Baranova.JD01_09_MathLab.vars;

import org.junit.Test;

import static org.junit.Assert.*;


public class VarVectorImplTest {

    @Test
    public void testAdd() throws Exception {
        String res=new VarVectorImpl("{1,2,3}").add(new VarVectorImpl("{1,3,2}")).toString();
        assertEquals("{2.0,5.0,5.0}",res);
        String res2=new VarVectorImpl("{1,2,3}").add(new VarFloatImpl("3")).toString();
        assertEquals("{4.0,5.0,6.0}",res2);

    }

    @Test
    public void testSub() throws Exception {
        String res=new VarVectorImpl("{6,6,6}").sub(new VarVectorImpl("{1,3,2}")).toString();
        assertEquals("{5.0,3.0,4.0}",res);
        String res2=new VarVectorImpl("{4,2,3}").sub(new VarFloatImpl("3")).toString();
        assertEquals("{1.0,-1.0,0.0}",res2);

    }

    @Test
    public void testMul() throws Exception {
        String res=new VarVectorImpl("{6,6,6}").mul(new VarVectorImpl("{1,3,2}")).toString();
        assertEquals("36.0",res);
        String res2=new VarVectorImpl("{4,2,3}").mul(new VarFloatImpl("3")).toString();
        assertEquals("{12.0,6.0,9.0}",res2);
    }

    @Test
    public void testDiv() throws Exception {
        String res=new VarVectorImpl("{6,3,3}").div(new VarFloatImpl("3")).toString();
        assertEquals("{2.0,1.0,1.0}",res);
    }
}