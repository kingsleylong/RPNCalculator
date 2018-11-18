package org.klong.domain.model.operation;

public class SquareRootOperator extends Operator {
    @Override
    public Double operate(Double leftOperand, Double rightOperand) {
        return Math.sqrt(rightOperand);
    }

    @Override
    public int noOfOperandsRequired() {
        return 1;
    }
}
