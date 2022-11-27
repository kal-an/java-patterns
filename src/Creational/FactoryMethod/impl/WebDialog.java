package Creational.FactoryMethod.impl;

import Creational.FactoryMethod.Button;

public class WebDialog extends Dialog {

    @Override
    Button createButton() {
        return new HtmlButton();
    }

    @Override
    public void render() {
        System.out.println("Render html button");
    }

    @Override
    public void onClick() {
        System.out.println("html button clicked");
    }

}
