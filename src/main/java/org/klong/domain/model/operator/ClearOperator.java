package org.klong.domain.model.operator;

import org.klong.domain.model.stack.MementoStack;

public class ClearOperator extends MementoOperator {

    public ClearOperator(MementoStack<Double> stack) {
        super(stack);
    }

    @Override
    public OperationStatus processOperation() {
        this.getStack().remember();
        this.getStack().clear();
        return OperationStatus.SUCCESS;
    }
}
