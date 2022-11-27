package Structural.Decorator.impl;

import Structural.Decorator.DataSource;

public class CompressionDecorator extends DataSourceDecorator {

    public CompressionDecorator(DataSource source) {
        super(source);
    }

    public void writeData(String data) {

    }

    public String readData() {
        return null;
    }
}
