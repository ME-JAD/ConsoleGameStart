package com.jad.view;

import com.jad.IController;
import com.jad.IModel;
import com.jad.IView;
import com.jad.controller.Action;
import com.jad.model.Model;

import java.awt.event.KeyEvent;

public class View implements IView {
    private final GameWindow gameWindow = new GameWindow("Ascii Snake", this);
    private IModel model;
    private IController controller;

    static Action keyEventToAction(final KeyEvent keyEvent) {
        if (keyEvent.getKeyChar() == Model.getLeftKey()) {
            return Action.LEFT;
        }
        if (keyEvent.getKeyChar() == Model.getRightKey()) {
            return Action.RIGHT;
        }
        return Action.NOOP;
    }

    @Override
    public void display() {
        this.gameWindow.setScreen(this.model.getValue());
    }

    @Override
    public void setModel(final IModel model) {
        this.model = model;
    }

    @Override
    public void setController(final IController controller) {
        this.controller = controller;
    }

    @Override
    public void askActionToUser() {

    }

    void transferAction(final Action action) {
        this.controller.perform(action);
    }
}
