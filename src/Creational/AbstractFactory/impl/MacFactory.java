package Creational.AbstractFactory.impl;

import Creational.AbstractFactory.Button;
import Creational.AbstractFactory.Checkbox;
import Creational.AbstractFactory.GuiFactory;

public class MacFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
