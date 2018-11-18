package org.klong.application;

import java.util.ArrayList;
import java.util.List;

public class ExpressionProcessor {
    private List<String> paramList = new ArrayList<>();

    public ExpressionProcessor(String read, String delimiter) {
        if (null != read & read.length() > 0) {
            String[] params = read.split(delimiter);

            for (String param : params) {
                paramList.add(param.trim());
            }
        }
    }

    public List<String> paramList() {
        return this.paramList;
    }
}
