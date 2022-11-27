package Structural.Composite.impl;

import Structural.Composite.Graphic;

public class Dot implements Graphic {

    private int x;
    private int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void draw() {

    }
}
