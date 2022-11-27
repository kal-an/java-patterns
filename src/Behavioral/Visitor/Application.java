package Behavioral.Visitor;

import Behavioral.Visitor.impl.XMLExportVisitor;

public class Application {

    private Shape[] shapes = new Shape[10];

    public static void main(String[] args) {
        Application application = new Application();
    }

    public void export() {
        XMLExportVisitor exportVisitor = new XMLExportVisitor();

        for (Shape shape: shapes) {
            shape.accept(exportVisitor);
        }
    }
}
