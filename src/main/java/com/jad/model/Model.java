package com.jad.model;

import com.jad.IController;
import com.jad.IModel;

public class Model implements IModel {
    private final Snake snake = new Snake();
    private IController controller;

    public static char getLeftKey() {
        return 'q';
    }

    public static char getRightKey() {
        return 'd';
    }

    @Override
    public void setController(final IController controller) {
        this.controller = controller;
    }

    @Override
    public void snakeGoLeft() {
        this.snake.setValue(this.snake.getValue() + "\nà gauche toute");
    }

    @Override
    public void snakeGoRight() {
        this.snake.setValue(this.snake.getValue() + "\nà droite toute");
    }

    @Override
    public String getValue() {
        return this.snake.getValue();
    }

    @Override
    public void moveSnake() {
        this.snake.setValue(this.snake.getValue() + ".");
    }
}
