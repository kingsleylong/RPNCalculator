package org.klong.domain.model.stack;

import java.util.Stack;

public class MementoStack<E> extends Stack<E>{
    private Stack<Stack<E>> memento = new Stack<>();

    public void inputElement(E operand) {
        this.remember();
        this.push(operand);
    }

    public void remember() {
        Stack<E> recentStack = new Stack<>();

        // Deep copy of stack elements
        for (E element : this) {
            recentStack.push(element);
        }

        memento.push(recentStack);
    }

    public Stack<E> retriveMemento() {
        Stack<E> recentStack = memento.pop();
        return recentStack;
    }

    public boolean isMementoEmpty() {
        return memento.isEmpty();
    }
}
