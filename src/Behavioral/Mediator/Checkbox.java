package Behavioral.Mediator;

public class Checkbox extends Component {

    public Checkbox(Mediator dialog) {
        super(dialog);
    }

    public void check() {
        dialog.notify(this, "check");
    }
}
