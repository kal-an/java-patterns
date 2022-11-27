package Creational.FactoryMethod;

import Creational.FactoryMethod.impl.Dialog;
import Creational.FactoryMethod.impl.WindowsDialog;

public class Application {

    public static void main(String[] args) {
        Dialog dialog = new WindowsDialog();
        dialog.render();
    }
}
