package Structural.Bridge;

import Structural.Bridge.devices.impl.Radio;
import Structural.Bridge.devices.impl.TV;
import Structural.Bridge.remotes.AdvancedRemote;
import Structural.Bridge.remotes.Remote;

public class Application {
    public static void main(String[] args) {
        TV tv = new TV();
        Remote remote = new Remote(tv);

        remote.togglePower();

        Radio radio = new Radio();
        AdvancedRemote advancedRemote = new AdvancedRemote(radio);
    }
}
