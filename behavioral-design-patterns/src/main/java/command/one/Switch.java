package command.one;

//invoker - invocador
public class Switch {
    public void storeAndExecute(Command command) {
        command.execute();
    }
}
