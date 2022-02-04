package command.two;

public interface CommandFactory {
    String getCommandName();

    String getDescription();

    Command makeCommand(String[] arguments);
}