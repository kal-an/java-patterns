package Creational.AbstractFactory.impl;

import Creational.AbstractFactory.Button;
import Creational.AbstractFactory.Checkbox;
import Creational.AbstractFactory.GuiFactory;

public class WinFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
