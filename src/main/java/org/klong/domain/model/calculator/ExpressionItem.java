package org.klong.domain.model.calculator;

public class ExpressionItem {
    private ExpressionItemEnum type;
    private String value;

    public ExpressionItem(ExpressionItemEnum type, String value) {
        this.type = type;
        this.value = value;
    }

    public ExpressionItemEnum type() {
        return this.type;
    }

    public String value() {
        return this.value;
    }
}
