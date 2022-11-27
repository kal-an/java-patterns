package Creational.AbstractFactory;

import Creational.AbstractFactory.impl.WinFactory;

public class Application {
    private GuiFactory factory;
    private Button button;

    public static void main(String[] args) {
        Application app = new Application(new WinFactory());
        app.createUi();
        app.paint();
    }

    public Application(GuiFactory factory) {
        this.factory = factory;
    }

    void createUi() {
        this.button = factory.createButton();
    }

    void paint() {
        button.paint();
    }
}

