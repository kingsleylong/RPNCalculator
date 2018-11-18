package org.klong.domain.model.stack;

import java.util.List;

public class RevertActionBuilder {
    private List<RevertAction> actions;

    public RevertActionBuilder addAction(RevertAction action) {
        actions.add(action);
        return this;
    }

    public List<RevertAction> actions() {
        return this.actions;
    }
}
