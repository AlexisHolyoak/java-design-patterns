package command.two;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<CommandFactory> availableCommands = getAvailableCommands();

        if (args.length == 0) {
            printUsage(availableCommands);
            return;
        }

        CommandParser parser = new CommandParser(availableCommands);
        Command command = parser.parseCommand(args);

        command.execute();
    }

    public static List<CommandFactory> getAvailableCommands() {
        List<CommandFactory> commands = new ArrayList<CommandFactory>();
        commands.add(new CreateOrderCommand());
        commands.add(new UpdateQuantityCommand());
        commands.add(new ShipOrderCommand());
        return commands;
    }

    private static void printUsage(List<CommandFactory> availableCommands) {
        System.out.println("Usage: CommandTest CommandName Arguments");
        System.out.println("Commands:");
        for (CommandFactory command : availableCommands) {
            System.out.format("  %s\n", command.getDescription());
        }
    }
}
