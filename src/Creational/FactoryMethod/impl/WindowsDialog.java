package Creational.FactoryMethod.impl;

import Creational.FactoryMethod.Button;

public class WindowsDialog extends Dialog {

    @Override
    Button createButton() {
        return new WindowsButton();
    }

    @Override
    public void render() {
        System.out.println("Render windows button");
    }

    @Override
    public void onClick() {
        System.out.println("windows button clicked");
    }
}
