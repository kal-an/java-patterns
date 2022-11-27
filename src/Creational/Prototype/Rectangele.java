package Creational.Prototype;

public class Rectangele extends Shape{

    Integer x;
    Integer y;

    public Rectangele() {
    }

    public Rectangele(Rectangele source) {
        super(source);
        this.x = source.x;
        this.y = source.y;
    }

    @Override
    public Rectangele clone() {
        return new Rectangele();
    }

    @Override
    public String toString() {
        return "Rectangele{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
