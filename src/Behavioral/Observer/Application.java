package Behavioral.Observer;

import Behavioral.Observer.impl.LoggingListeners;

public class Application {
    public static void main(String[] args) {
        Application app = new Application();

    }

    public void config() {
        Editor editor = new Editor();
        LoggingListeners logger = new LoggingListeners("/path/", "message");
        EventManager manager = new EventManager();
        manager.subscribe("open", logger);
    }
}
