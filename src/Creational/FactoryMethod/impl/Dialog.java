package Creational.FactoryMethod.impl;

import Creational.FactoryMethod.Button;

public abstract class Dialog implements Button {

    abstract Button createButton();

    public void render() {
        Button mButton = createButton();
        mButton.onClick();
        mButton.render();
    }
}
