package org.klong.domain.model.stack;

import java.util.Stack;

public class CalculatorStack extends Stack<Double>{
    @Override
    public Double push(Double item) {
        Double pushedItem = this.push(item);
        this.memento.recordChange();
        return pushedItem;
    }

    @Override
    public Double pop() {
        Double item = super.pop();
        return item;
    }

    public void clear() {
        this.stack.clear();
    }

    private Memento memento = new Memento();

    private class Memento {
        public void recordChange() {

        }

        public CalculatorStack retrieveStack() {
            return null;
        }
    }
}
