package org.klong.domain.model.operator;

import org.klong.domain.model.stack.MementoStack;

public class DivideOperator extends MementoOperator {

    public DivideOperator(MementoStack<Double> stack) {
        super(stack);
    }

    @Override
    public void processOperation() {
        super.getStack().remember();
        Double rightOperand = this.getStack().pop();
        Double leftOperand = this.getStack().pop();
        //todo precision
        Double result = leftOperand / rightOperand;
        this.getStack().push(result);
    }
}
