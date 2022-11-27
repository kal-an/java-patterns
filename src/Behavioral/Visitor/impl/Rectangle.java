package Behavioral.Visitor.impl;

import Behavioral.Visitor.Shape;
import Behavioral.Visitor.Visitor;

public class Rectangle implements Shape {
    @Override
    public void move(int x, int y) {

    }

    @Override
    public void draw() {

    }

    @Override
    public void accept(Visitor v) {
        v.visitRectangle(this);
    }
}
