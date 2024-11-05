package com.example.ej7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * The type Calculator test.
 */
public class CalculatorTest {
    private final Calculator calc = new Calculator();

    /**
     * Test add 2 operands.
     */
    @Test
    public void testAdd2Operands() {
        String total = calc.calculate("5+3");
        assertEquals("Expected sum of 5 + 3 to be 8", "8.0", total);
    }

    /**
     * Test add 3 operands.
     */
    @Test
    public void testAdd3Operands() {
        String total = calc.calculate("4+3+1");
        assertEquals("Expected sum of 4 + 3 + 1 to be 8", "8.0", total);
    }

    /**
     * Test mult 2 operands.
     */
    @Test
    public void testMult2Operands() {
        String total = calc.calculate("4*2");
        assertEquals("Expected product of 4 * 2 to be 8", "8.0", total);
    }

    /**
     * Test mult with addition.
     */
    @Test
    public void testMultWithAddition() {
        String total = calc.calculate("2*3");
        assertEquals("Expected result of 2 * 3 to be 6", "6.0", total);
    }

    /**
     * Test multiple multiplications.
     */
    @Test
    public void testMultipleMultiplications() {
        String total = calc.calculate("1*2*8");
        assertEquals("Expected result of 1 * 2 * 8 to be 16", "16.0", total);
    }

    /**
     * Test complex expression 1.
     */
    @Test
    public void testComplexExpression1() {
        String total = calc.calculate("2*2+3");
        assertEquals("Expected result of 2 * 2 + 3 to be 7", "7.0", total);
    }

    /**
     * Test complex expression 2.
     */
    @Test
    public void testComplexExpression2() {
        String total = calc.calculate("3+2*2");
        assertEquals("Expected result of 3 + 2 * 2 to be 10", "10.0", total);
    }

    /**
     * Test complex expression 3.
     */
    @Test
    public void testComplexExpression3() {
        String total = calc.calculate("3+2*2+4");
        assertEquals("Expected result of 3 + 2 * 2 + 4 to be 11", "14.0", total);
    }
}
