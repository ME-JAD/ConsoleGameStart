package com.jad.controller;

import com.jad.IModel;

final class ActionPerformer {
    private final IModel model;

    public ActionPerformer(final IModel model) {
        this.model = model;
    }

    void perform(final Action action) {
        switch (action) {
            case LEFT:
                this.model.snakeGoLeft();
                break;
            case RIGHT:
                this.model.snakeGoRight();
                break;
            case NOOP:
                // rien
        }
    }
}
