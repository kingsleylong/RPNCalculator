package org.klong.domain.model.operator;

import org.klong.domain.model.stack.MementoStack;

public class SqrtOperator extends MementoOperator {
    public SqrtOperator(MementoStack<Double> stack) {
        super(stack);
    }

    @Override
    public void processOperation() {
        getStack().remember();
        Double operand = getStack().pop();
        double result = Math.sqrt(operand);
        getStack().push(result);
    }
}
