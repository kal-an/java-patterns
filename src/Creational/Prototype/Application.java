package Creational.Prototype;

public class Application {
    private static Shape[] arrayOfShapes = new Shape[5];

    public static void main(String[] args) {
        Application app = new Application();
        Circle circle = new Circle();
        circle.radius = 20;

        Circle anotherCircle = circle.clone();
        arrayOfShapes[0] = circle;
        arrayOfShapes[1] = anotherCircle;

        Rectangele rectangele = new Rectangele();
        rectangele.x = 30;
        rectangele.y = 14;

        arrayOfShapes[2] = rectangele;
        for (int i = 0; i < arrayOfShapes.length; i++) {
            System.out.println(arrayOfShapes[i]);
        }
    }
}
