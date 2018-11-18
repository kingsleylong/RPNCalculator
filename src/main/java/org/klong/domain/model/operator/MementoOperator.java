package org.klong.domain.model.operator;

import org.klong.domain.model.stack.MementoStack;

public abstract class MementoOperator implements Operator {
    private MementoStack<Double> stack;

    public MementoOperator(MementoStack<Double> stack) {
        this.stack = stack;
    }

    @Override
    public OperationStatus operate() {
        return processOperation();
    }

    public abstract OperationStatus processOperation();

    public void setStack(MementoStack<Double> stack) {
        this.stack = stack;
    }

    public MementoStack<Double> getStack() {
        return stack;
    }

    protected boolean verifyOperand(int noOfOperandsRequired) {
        OperandSpecification specification = new OperandSpecification();
        return specification.isSatisfiedBy(this.stack, noOfOperandsRequired);
    }
}
