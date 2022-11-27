package Creational.AbstractFactory.impl;

import Creational.AbstractFactory.Button;
import Creational.AbstractFactory.Checkbox;
import Creational.AbstractFactory.GuiFactory;

public class LinFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new LinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinCheckbox();
    }
}
