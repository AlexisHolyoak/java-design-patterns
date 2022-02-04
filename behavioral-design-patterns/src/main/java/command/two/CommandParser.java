package command.two;

import java.util.List;
import java.util.Optional;

public class CommandParser {
    List<CommandFactory> availableCommands;

    public CommandParser(List<CommandFactory> availableCommands) {
        this.availableCommands = availableCommands;
    }

    public Command parseCommand(String[] args) {
        String requestedCommandName = args[0];

        CommandFactory command = findRequestedCommand(requestedCommandName);
        if (null == command)
            return new NotFoundCommand(requestedCommandName);

        return command.makeCommand(args);
    }

    private CommandFactory findRequestedCommand(String commandName) {
        Optional<CommandFactory> optional = availableCommands.stream()
                .filter(i -> i.getCommandName().equalsIgnoreCase(commandName)).findFirst();
        if (!optional.isPresent()) {
            return null;
        }
        return optional.get();
    }
}