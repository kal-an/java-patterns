package Structural.Bridge.remotes;

import Structural.Bridge.devices.Device;

public class AdvancedRemote extends Remote {

    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        device.setVolume(0);
    }
}
