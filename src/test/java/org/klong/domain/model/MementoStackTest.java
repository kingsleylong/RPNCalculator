package org.klong.domain.model;

import org.junit.Test;
import org.klong.domain.model.stack.MementoStack;

import java.util.Stack;

import static org.junit.Assert.*;

public class MementoStackTest {
    @Test
    public void testRememberAndRetrieve() {
        MementoStack<Double> mementoStack = new MementoStack<>();

        mementoStack.inputOperand(1D);
        mementoStack.inputOperand(2D);
        mementoStack.remember();

        assertFalse(mementoStack.isMementoEmpty());

        Stack<Double> memento = mementoStack.retriveMemento();
        assertTrue(2d == memento.pop().doubleValue());
        assertTrue(1d == memento.pop().doubleValue());

        assertTrue(mementoStack.isMementoEmpty());
    }

    @Test
    public void testUndo() {
        MementoStack<Double> mementoStack = new MementoStack<>();

        mementoStack.inputOperand(1D);
        mementoStack.inputOperand(2D);
        mementoStack.inputOperand(3D);

        mementoStack.pop();
        mementoStack.pop();
        mementoStack.inputOperand(6D);


    }

}