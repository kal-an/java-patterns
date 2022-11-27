package Behavioral.Visitor;

public interface Shape {

    void move(int x, int y);
    void draw();
    void accept(Visitor v);
}
