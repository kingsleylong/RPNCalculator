package org.klong.domain.model.operator;

import org.klong.domain.model.stack.MementoStack;

public abstract class MementoOperator implements Operator {
    private MementoStack<Double> stack;

    public MementoOperator(MementoStack<Double> stack) {
        this.stack = stack;
    }

    @Override
    public void operate() {
        processOperation();
    }

    public abstract void processOperation();

    public void setStack(MementoStack<Double> stack) {
        this.stack = stack;
    }

    public MementoStack<Double> getStack() {
        return stack;
    }
}
