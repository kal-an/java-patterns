package Structural.Decorator.impl;

import Structural.Decorator.DataSource;

public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    public void writeData(String data) {

    }

    public String readData() {
        return null;
    }
}
