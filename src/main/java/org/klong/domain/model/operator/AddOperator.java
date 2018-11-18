package org.klong.domain.model.operator;

import org.klong.domain.model.stack.MementoStack;

public class AddOperator extends MementoOperator {

    public AddOperator(MementoStack<Double> stack) {
        super(stack);
    }

    @Override
    public OperationStatus processOperation() {
        if (this.verifyOperand(2)) {
            super.getStack().remember();
            Double rightOperand = this.getStack().pop();
            Double leftOperand = this.getStack().pop();
            //todo precision
            Double result = leftOperand + rightOperand;
            this.getStack().push(result);
            return OperationStatus.SUCCESS;
        } else {
            return OperationStatus.INSUFFICIENT_PARAM;
        }
    }
}
