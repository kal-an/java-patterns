package Creational.Prototype;

abstract public class Shape {
    private Integer x;
    private Integer y;
    private String color;

    public Shape() {
    }

    public Shape(Shape source) {
        this.x = source.x;
        this.y = source.y;
        this.color = source.color;
    }

    abstract public Shape clone();
}
