package Behavioral.Chain;

public class Application {

    public void createUI() {
        Dialog dialog = new Dialog();
        Panel panel = new Panel();
        Button ok = new Button();
        Button cancel = new Button();
        panel.add(ok);
        panel.add(cancel);
        dialog.add(panel);
    }

    public void onF1keyPress() {
        Component component = null;
        component.showHelp();
    }
}
