package command.two;

public class ShipOrderCommand implements Command, CommandFactory {

    @Override
    public String getCommandName() {
        return "ShipOrder";
    }

    @Override
    public String getDescription() {
        return getCommandName();
    }

    @Override
    public Command makeCommand(String[] arguments) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void execute() {
        throw new UnsupportedOperationException();
    }
}