package command.two;

public class UpdateQuantityCommand implements Command, CommandFactory {

    private int newQuantity;

    public UpdateQuantityCommand() {
    }

    public UpdateQuantityCommand(int newQuantity) {
        this.newQuantity = newQuantity;
    }

    @Override
    public String getCommandName() {
        return "UpdateQuantity";
    }

    @Override
    public String getDescription() {
        return "UpdateQuantity number";
    }

    @Override
    public Command makeCommand(String[] arguments) {
        return new UpdateQuantityCommand(Integer.parseInt(arguments[1]));
    }

    @Override
    public void execute() {
        // simulate updating a database
        int oldQuantity = 5;
        System.out.println("DATABASE: Updated");

        // simulate logging
        System.out.format("LOG: Updated order quantity from %s to %s", oldQuantity, newQuantity);
    }

    public int getNewQuantity() {
        return newQuantity;
    }

    public void setNewQuantity(int newQuantity) {
        this.newQuantity = newQuantity;
    }
}