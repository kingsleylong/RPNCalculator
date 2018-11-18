package org.klong.domain.model;

import org.junit.Test;
import org.klong.domain.model.calculator.Calculator;
import org.klong.domain.model.calculator.CalculatorFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CalculatorTest {
    @Test
    public void testUndo() {
        Calculator calculator = CalculatorFactory.createCalculator();

        calculator.input(2D);
        calculator.input(3D);
        calculator.add();
        // stack should be [5]
        assertTrue(5D == calculator.output().peek().doubleValue());

        calculator.undo();
        assertTrue(3d == calculator.output().peek().doubleValue());
        assertEquals(2, calculator.output().size());

        calculator.input(10D);
        assertEquals(3, calculator.output().size());

        calculator.undo();
        assertTrue(3d == calculator.output().pop().doubleValue());
        assertTrue(2d == calculator.output().pop().doubleValue());
        assertTrue(calculator.output().isEmpty());

    }

    @Test
    public void testSqRrtOperator() {
        Calculator calculator = CalculatorFactory.createCalculator();
        calculator.input(3D);
        calculator.input(9D);
        calculator.sqrt();

        assertTrue(2 == calculator.output().size());
        assertTrue(3d == calculator.output().pop().doubleValue());
    }

    @Test
    public void testSubstractOperator() {
        Calculator calculator = CalculatorFactory.createCalculator();
        calculator.input(3D);
        calculator.input(9D);
        calculator.substract();

        assertTrue(1 == calculator.output().size());
        assertTrue(-6d == calculator.output().pop().doubleValue());
    }

    @Test
    public void testMultiplyOperator() {
        Calculator calculator = CalculatorFactory.createCalculator();
        calculator.input(3D);
        calculator.input(9D);
        calculator.multiply();

        assertTrue(1 == calculator.output().size());
        assertTrue(27d == calculator.output().pop().doubleValue());
    }

    @Test
    public void testDivideOperator() {
        Calculator calculator = CalculatorFactory.createCalculator();
        calculator.input(9D);
        calculator.input(3D);
        calculator.divide();

        assertTrue(1 == calculator.output().size());
        assertTrue(3d == calculator.output().pop().doubleValue());
    }

    @Test
    public void testClearOperator() {
        Calculator calculator = CalculatorFactory.createCalculator();
        calculator.input(3D);
        calculator.input(9D);
        calculator.clear();

        assertTrue(0 == calculator.output().size());

        calculator.undo();
        assertTrue(2 == calculator.output().size());
    }
}