package org.klong.domain.model.calculator;

import org.klong.domain.model.operator.OperationStatus;
import org.klong.domain.model.stack.MementoStack;
import org.klong.domain.model.operator.Operator;

import java.util.Stack;

public class Calculator {
    private final MementoStack<Double> stack;
    private final Operator addOperator;
    private final Operator undoOperator;
    private final Operator clearOperator;
    private final Operator sqrtOperator;
    private final Operator substractOperator;
    private final Operator multiplyOperator;
    private final Operator divideOperator;

    public Calculator(MementoStack<Double> stack, Operator addOperator, Operator undoOperator, Operator clearOperator, Operator sqrtOperator, Operator substractOperator, Operator multiplyOperator, Operator divideOperator) {
        this.stack = stack;
        this.addOperator = addOperator;
        this.undoOperator = undoOperator;
        this.clearOperator = clearOperator;
        this.sqrtOperator = sqrtOperator;
        this.substractOperator = substractOperator;
        this.multiplyOperator = multiplyOperator;
        this.divideOperator = divideOperator;
    }

    public OperationStatus add() {
        return this.addOperator.operate();
    }

    public OperationStatus substract() {
        return this.substractOperator.operate();
    }

    public OperationStatus multiply() {
        return this.multiplyOperator.operate();
    }

    public OperationStatus divide() {
        return this.divideOperator.operate();
    }

    public OperationStatus sqrt() {
        return this.sqrtOperator.operate();
    }

    public OperationStatus undo() {
        return this.undoOperator.operate();
    }

    public OperationStatus clear() {
        return this.clearOperator.operate();
    }

    public void input(Double operand) {
        this.stack.inputElement(operand);
    }

    public Stack<Double> output() {
        return this.stack;
    }
}
