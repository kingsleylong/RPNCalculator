package org.klong.domain.model.operation;

public abstract class Operator {
    private int noOfOperandsRequired;
    public abstract Double operate(Double[] operands);

    public abstract int noOfOperandsRequired();
}
