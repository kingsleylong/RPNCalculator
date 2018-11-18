package org.klong.domain.model.operator;

import java.util.Stack;

public class OperandSpecification<E> {
    public boolean isSatisfiedBy(Stack<E> stack, int noOfOperandsRequired) {
        return stack.size() >= noOfOperandsRequired;
    }
}
