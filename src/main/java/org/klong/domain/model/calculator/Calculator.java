package org.klong.domain.model.calculator;

import org.klong.domain.model.operation.Operator;
import org.klong.domain.model.stack.CalculatorStack;
import org.klong.domain.model.operation.OperatorFactory;
import org.klong.domain.model.stack.RevertAction;
import org.klong.domain.model.stack.RevertActionBuilder;
import org.klong.domain.model.stack.RevertActionType;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private CalculatorStack stack = new CalculatorStack();
    private Expression expression;

    public Calculator() {
    }

    public void input(Expression expression) {
        this.expression = expression;
    }

    public void calculate() {
        for (ExpressionItem item : expression.items()) {
            RevertActionBuilder revertActionBuilder = new RevertActionBuilder();

            RevertAction action;
            switch (item.type()) {
                case OPERAND:
                    Double pushedItem = stack.push(Double.valueOf(item.value()));
                    action = new RevertAction(RevertActionType.POP, pushedItem, null, null);
//                    RevertAction action = new RevertAction(RevertActionType.POP, new Double[]{pushedItem});
                case OPERATOR:
                    Operator operator = OperatorFactory.getOperatorInstance(item.value());
                    List<Double> operatedElements = new ArrayList<>();

                    Double result = 0D;
                    for (int i = 0; i < operator.noOfOperandsRequired(); i++) {
                        Double element = stack.pop();
                        // TODO precision issue
                        // java.math.BigDecimal d1=new java.math.BigDecimal(String.valueOf(n));
                        //java.math.BigDecimal d2=new java.math.BigDecimal(String.valueOf(m));

                        operatedElements.add(element);
                    }
                    Double[] elements = new Double[0];
                    Double[] operands = operatedElements.toArray(elements);
                    operator.operate(operands);

                    // PUSH in revert order
                    action = new RevertAction(RevertActionType.PUSH, operatedElements.get(1), RevertActionType.PUSH, operatedElements.get(0));
                    revertActionBuilder.addAction(action);
            }

            stack.recordRevertActions(revertActionBuilder.actions());
        }
    }

}
