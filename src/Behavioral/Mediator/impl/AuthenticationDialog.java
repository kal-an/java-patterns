package Behavioral.Mediator.impl;

import Behavioral.Mediator.Button;
import Behavioral.Mediator.Checkbox;
import Behavioral.Mediator.Component;
import Behavioral.Mediator.Mediator;

public class AuthenticationDialog implements Mediator {

    private String title;
    private Button okButton;
    private Checkbox loginOrRegister;
    private Button cancelButton;

    public AuthenticationDialog() {
        //creating component objects;
    }

    @Override
    public void notify(Component sender, String event) {
        if (sender == loginOrRegister && event == "check") {
            //to do something
        }

        if (sender == okButton && event == "click") {

        }
    }
}
