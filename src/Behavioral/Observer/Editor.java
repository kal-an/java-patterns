package Behavioral.Observer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Editor {

    private EventManager events;
    private File file;

    public Editor() {
        events = new EventManager();
    }

    public void openFile(String path) {
        this.file = new File(path);
        events.notify("open", file.getName());
    }

    public void saveFile() throws IOException {
        FileWriter fw = new FileWriter(file);
        fw.close();
        events.notify("save", file.getName());
    }
}
