package Behavioral.Visitor.impl;

import Behavioral.Visitor.Shape;
import Behavioral.Visitor.Visitor;

public class Dot implements Shape {
    @Override
    public void move(int x, int y) {

    }

    @Override
    public void draw() {

    }

    @Override
    public void accept(Visitor v) {
        v.visitDot(this);
    }
}
