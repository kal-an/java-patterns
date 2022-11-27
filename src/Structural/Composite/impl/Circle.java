package Structural.Composite.impl;

import Structural.Composite.Graphic;

public class Circle implements Graphic {

    private int radius;

    public Circle(int x, int y, int radius) {
        this.radius = radius;
    }

    @Override
    public void move(int x, int y) {

    }

    @Override
    public void draw() {

    }
}
