package command.two;

public class NotFoundCommand implements Command {

    public String name;

    public NotFoundCommand(String name) {
        this.name = name;
    }

    public void execute() {
        System.out.println("Couldn't find command: " + name);
    }
}