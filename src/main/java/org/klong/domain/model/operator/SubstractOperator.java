package org.klong.domain.model.operator;

import org.klong.domain.model.stack.MementoStack;

public class SubstractOperator extends MementoOperator {
    public SubstractOperator(MementoStack<Double> stack) {
        super(stack);
    }

    @Override
    public OperationStatus processOperation() {
        super.getStack().remember();
        Double rightOperand = this.getStack().pop();
        Double leftOperand = this.getStack().pop();
        //todo precision
        Double result = leftOperand - rightOperand;
        this.getStack().push(result);
        return OperationStatus.SUCCESS;
    }
}
