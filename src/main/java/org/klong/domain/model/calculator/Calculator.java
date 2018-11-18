package org.klong.domain.model.calculator;

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

    public void add() {
        this.addOperator.operate();
    }

    public void substract() {
        this.substractOperator.operate();
    }

    public void multiply() {
        this.multiplyOperator.operate();
    }

    public void divide() {
        this.divideOperator.operate();
    }

    public void sqrt() {
        this.sqrtOperator.operate();
    }

    public void undo() {
        this.undoOperator.operate();
    }

    public void clear() {
        this.clearOperator.operate();
    }

    public void input(Double operand) {
        this.stack.inputOperand(operand);
    }

    public Stack<Double> output() {
        return this.stack;
    }
}
