package Command;

//Invoker
public class Controller {
    private Command command;

    void setCommand(Command command) {
        this.command = command;
    }

    void execute() {
        command.execute();
    }

    void Undo() {
        command.undo();
    }
}
