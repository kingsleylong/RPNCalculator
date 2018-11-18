package org.klong.domain.model.calculator;

import org.klong.domain.model.stack.MementoStack;
import org.klong.domain.model.operator.*;

public class CalculatorFactory {
    public static Calculator createCalculator() {
        MementoStack<Double> stack = new MementoStack<>();

        AddOperator addOperator = new AddOperator(stack);
        UndoOperator undoOperator = new UndoOperator(stack);
        ClearOperator clearOperator = new ClearOperator(stack);
        SqrtOperator sqrtOperator = new SqrtOperator(stack);
        SubstractOperator substractOperator = new SubstractOperator(stack);
        MultiplyOperator multiplyOperator = new MultiplyOperator(stack);
        DivideOperator divideOperator = new DivideOperator(stack);

        Calculator c = new Calculator(stack, addOperator, undoOperator, clearOperator, sqrtOperator, substractOperator, multiplyOperator, divideOperator);
        return c;
    }
}
