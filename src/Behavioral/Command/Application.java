package Behavioral.Command;

import java.util.List;

public class Application {

    protected String clipboard;
    private List<Editor> editors;
    private Editor editor;
    private CommandHistory history;

    public static void main(String[] args) {

        Application application = new Application();
        application.createUI();
    }

    public void createUI() {
        Command copy = executeCommand(new CopyCommand(this, editor));
        Command cut = executeCommand(new CutCommand(this, editor));
        Command paste = executeCommand(new PasteCommand(this, editor));
        Command undo = executeCommand(new UndoCommand(this, editor));
    }

    public Command executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
        return command;
    }

    public void undo() {
        Command command = history.pop();
        if (command != null) {
            command.undo();
        }
    }
}

