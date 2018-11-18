package org.klong.domain.model.operator;

import org.klong.domain.model.stack.MementoStack;

import java.util.Stack;

public class UndoOperator extends MementoOperator{
    public UndoOperator(MementoStack<Double> stack) {
        super(stack);
    }

    @Override
    public OperationStatus processOperation() {
        this.getStack().clear();

        if (!this.getStack().isMementoEmpty()) {
            Stack<Double> recentStack = this.getStack().retriveMemento();
            this.getStack().addAll(recentStack);
        }
        return OperationStatus.SUCCESS;
    }
}
