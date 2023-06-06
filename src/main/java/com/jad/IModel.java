package com.jad;

public interface IModel {
    void setController(IController controller);

    void snakeGoLeft();

    void snakeGoRight();

    String getValue();

    void moveSnake();
}
