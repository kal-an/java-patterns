package Structural.Decorator;

import Structural.Decorator.impl.CompressionDecorator;
import Structural.Decorator.impl.EncryptionDecorator;
import Structural.Decorator.impl.FileDataSource;

public class Application {

    private DataSource source;

    public static void main(String[] args) {
        Application app = new Application();
        app.dumpUsageExample();
    }

    void dumpUsageExample() {
        source = new FileDataSource("somefile.dat");
        source.writeData("salary");

        source = new CompressionDecorator(source);
        source.writeData("salary");

        source = new EncryptionDecorator(source);
        source.writeData("salary");
    }
}
