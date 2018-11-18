package org.klong.domain.model.calculator;

import java.util.ArrayList;
import java.util.List;

public class Expression {
    private final String delimiter = " ";
    private String[] expressionStrSplit;

    public Expression(String expressionStr) {
        if (null != expressionStr && expressionStr.length() > 0) {
            this.expressionStrSplit = expressionStr.split(delimiter);
        }
    }

    public List<ExpressionItem> analyze() {
        List<ExpressionItem> items = new ArrayList<>();

        for (String str : expressionStrSplit) {
//            if (isOperator(str)) {
//
//            }
        }
        return null;
    }

    private List<ExpressionItem> items;
    public List<ExpressionItem> items() {
        return this.items;
    }
}
