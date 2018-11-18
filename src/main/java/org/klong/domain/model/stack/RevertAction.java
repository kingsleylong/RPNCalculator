package org.klong.domain.model.stack;

public class RevertAction {
    private RevertActionType actionType;
    private Double[] elements;

    public RevertAction(RevertActionType actionType, Double[] elements) {
        this.actionType = actionType;
        this.elements = elements;
    }

    public RevertActionType actionType() {
        return this.actionType;
    }

    public Double[] elements() {
        return this.elements;
    }

    private RevertActionType actionType1;
    private Double element1;
    private RevertActionType actionType2;
    private Double element2;

    public RevertAction(RevertActionType actionType1, Double element1, RevertActionType actionType2, Double element2) {
        this.actionType1 = actionType1;
        this.element1 = element1;
        this.actionType2 = actionType2;
        this.element2 = element2;
    }
}
