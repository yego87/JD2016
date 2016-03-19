package by.it.Baranova.JD01_09_MathLab.vars;

import org.junit.Test;

import static org.junit.Assert.*;

public class VarMatrixImplTest {

    @Test
    public void testAdd() throws Exception {
        String res=new VarMatrixImpl("{{1,2,3},{3,2,1}}").add(new VarMatrixImpl("{{1,3,2},{2,4,5}}")).toString();
        assertEquals("{{2.0,5.0,5.0},{5.0,6.0,6.0}}",res);
        String res2=new VarMatrixImpl("{{1,2,3},{3,2,1}}").add(new VarFloatImpl("1")).toString();
        assertEquals("{{2.0,5.0,5.0},{5.0,6.0,6.0}}",res);
    }

    @Test
    public void testSub() throws Exception {
        String res=new VarMatrixImpl("{{1,2,3},{3,2,1}}").sub(new VarMatrixImpl("{{1,3,2},{2,4,5}}")).toString();
        assertEquals("{{0.0,-1.0,1.0},{1.0,-2.0,-4.0}}",res);
    }

    @Test
    public void testMul() throws Exception {
        String res=new VarMatrixImpl("{{1,2,3},{3,2,1}}").mul(new VarMatrixImpl("{{1,3},{2,2},{3,1}}")).toString();
        assertEquals("{{14.0,10.0},{10.0,14.0}}",res);
        String res2=new VarMatrixImpl("{{1,2,3},{3,2,1}}").mul(new VarFloatImpl("2")).toString();
        assertEquals("{{2.0,4.0,6.0},{6.0,4.0,2.0}}",res2);
        String res3=new VarMatrixImpl("{{1,2,3},{3,2,1}}").mul(new VarVectorImpl("{1,2,2}")).toString();
        assertEquals("{11.0,9.0}",res3);
    }

    @Test
    public void testDiv() throws Exception {
        String res2=new VarMatrixImpl("{{10,2,6},{4,2,4}}").div(new VarFloatImpl("2")).toString();
        assertEquals("{{5.0,1.0,3.0},{2.0,1.0,2.0}}",res2);
    }
}