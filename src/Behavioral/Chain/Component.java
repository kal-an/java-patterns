package Behavioral.Chain;

abstract public class Component implements ComponentWithContextualHelp {

    private String tooltipText;

    protected Container container;

    public void showHelp() {
        if (tooltipText != null) {

        } else container.showHelp();
    }
}
