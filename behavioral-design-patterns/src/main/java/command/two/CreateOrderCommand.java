package command.two;

public class CreateOrderCommand implements Command, CommandFactory {

    @Override
    public String getCommandName() {
        return "CreateOrder";
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