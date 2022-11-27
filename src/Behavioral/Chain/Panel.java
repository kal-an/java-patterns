package Behavioral.Chain;

public class Panel extends Container {

    private String modalHelpText;

    @Override
    public void showHelp() {
        if (modalHelpText != null) {

        }
        else super.showHelp();
    }
}
