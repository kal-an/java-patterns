package Structural.Composite.impl;

import Structural.Composite.Graphic;

public class CompoundGraphic implements Graphic {

    private Graphic[] children;

    public void add(Graphic child) {

    }

    public void remove(Graphic child) {

    }

    @Override
    public void move(int x, int y) {
        for (Graphic child : children) {
            child.move(x, y);
        }
    }

    @Override
    public void draw() {

    }
}
