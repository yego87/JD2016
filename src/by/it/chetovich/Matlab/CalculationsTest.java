package by.it.chetovich.Matlab;

import by.it.chetovich.JD01_09.*;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * JUnit Test
 */
public class CalculationsTest {

    @Test
    public void testAddFloats() throws Exception {
        float a = 2f;
        float b = 1f;
        float result = Calculations.add(a,b);
        assertEquals(3, result, 0.001f);

    }

    @Test
    public void testAddVectorFloat() throws Exception {
        float [] a = {2f,3f};
        float b = 1f;
        float []result = Calculations.add(a,b);
        float []expected = {3f,4f};
        assertArrayEquals(expected,result,0.001f);
    }

    @Test
    public void testAddMatrixFloat() throws Exception {
        float [][] a = {{1f,1f},{1f,1f}};
        float b = 1f;
        float [][]result = Calculations.add(a,b);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                assertEquals(2f,result[i][j],0.001f);
            }
        }

    }

    @Test
    public void testAddVectors() throws Exception {
        float [] a = {2f,3f};
        float [] b = {1f,2f};
        float []result = Calculations.add(a,b);
        float []expected = {3f,5f};
        assertArrayEquals(expected,result,0.001f);
    }

    @Test
    public void testAddMatrices() throws Exception {
        float [][] a = {{1f,1f},{1f,1f}};
        float [][] b = {{1f,1f},{1f,1f}};
        float [][]result = Calculations.add(a,b);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                assertEquals(2f,result[i][j],0.001f);
            }
        }
    }

    @Test
    public void testSubFloats() throws Exception {
        float a = 2f;
        float b = 1f;
        float result = Calculations.sub(a, b);
        assertEquals(1, result, 0.001f);
    }

    @Test
    public void testSubVectors() throws Exception {
        float [] a = {2f,3f};
        float [] b = {1f,2f};
        float []result = Calculations.sub(a, b);
        float []expected = {1f,1f};
        assertArrayEquals(expected,result,0.001f);
    }

    @Test
    public void testSubVectorFloat() throws Exception {
        float [] a = {2f,3f};
        float b = 1f;
        float []result = Calculations.sub(a, b);
        float []expected = {1f,2f};
        assertArrayEquals(expected,result,0.001f);
    }

    @Test
    public void testSubMatrixFloat() throws Exception {
        float [][] a = {{2f,2f},{2f,2f}};
        float b = 1f;
        float [][]result = Calculations.sub(a, b);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                assertEquals(1f,result[i][j],0.001f);
            }
        }
    }

    @Test
    public void testSubMatrices() throws Exception {
        float [][] a = {{1f,1f},{1f,1f}};
        float [][] b = {{1f,1f},{1f,1f}};
        float [][]result = Calculations.sub(a, b);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                assertEquals(0f,result[i][j],0.001f);
            }
        }
    }

    @Test
    public void testMultiFloats() throws Exception {
        float a = 2f;
        float b = 1f;
        float result = Calculations.multi(a, b);
        assertEquals(2f, result, 0.001f);
    }

    @Test
    public void testMultiFloatVector() throws Exception {
        float a = 1f;
        float [] b = {2f,3f};
        float []result = Calculations.multi(a, b);
        float []expected = {2f,3f};
        assertArrayEquals(expected,result,0.001f);
    }

    @Test
    public void testMultiFloatMatrix() throws Exception {
        float [][] b = {{2f,2f},{2f,2f}};
        float a = 1f;
        float [][]result = Calculations.multi(a, b);
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                assertEquals(2f,result[i][j],0.001f);
            }
        }
    }

    @Test
    public void testMultiVectors() throws Exception {
        float [] a = {1f,1f};
        float [] b = {1f,1f};
        float result = Calculations.multi(a, b);
        assertEquals(2f, result, 0.001f);

    }

    @Test
    public void testMultiVectorMatrix() throws Exception {
        float [] a = {1f,1f};
        float [][] b = {{1f,1f},{1f,1f}};
        float [] result = Calculations.multi(a,b);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                assertEquals(2f,result[i],0.001f);
            }
        }
    }

    @Test
    public void testMultiMatrices() throws Exception {
        float [][] a = {{1f,1f},{1f,1f}};
        float [][] b = {{1f,1f},{1f,1f}};
        float [][]result = Calculations.multi(a, b);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    assertEquals(4f,result[i][j],0.001f);                }
            }
        }
    }

    @Test
    public void testDivideFloats() throws Exception {
        float a = 2f;
        float b = 1f;
        float result = Calculations.divide(a,b);
        assertEquals(2, result, 0.001f);
    }
}