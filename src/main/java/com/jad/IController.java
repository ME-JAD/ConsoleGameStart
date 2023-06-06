package com.jad;

import com.jad.controller.Action;

public interface IController {
    void start();

    void perform(Action action);
}
