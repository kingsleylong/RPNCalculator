package org.klong;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Stack;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );

        Stack<Double> stack = new Stack<>();
        stack.push(1D);
        stack.push(2D);
        stack.push(3D);

        Stack<Double> memento = new Stack<>();

        for (Double e : stack) {
            System.out.println(e);
            memento.push(e);
        }

        System.out.println("Pop original stack");
        while (!stack.isEmpty()) {
            Double element = stack.pop();
            Double mementoElement = memento.pop();
            assertTrue(element.equals(mementoElement));
        }

        assertTrue(stack.isEmpty());
        assertTrue(memento.isEmpty());
    }
}
