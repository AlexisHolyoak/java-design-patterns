package command.one;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String args[]) {
        Light bedroomLight = new Light();
        Light kitchenLight = new Light();
        Switch lightSwitch = new Switch();

        Command toggleCommand = new ToggleCommand(bedroomLight);
        lightSwitch.storeAndExecute(toggleCommand);
        // lightSwitch.storeAndExecute(toggleCommand);
        // lightSwitch.storeAndExecute(toggleCommand);

        toggleCommand = new ToggleCommand(kitchenLight);
        lightSwitch.storeAndExecute(toggleCommand);

        System.out.println("****************************");

        List<Light> lights = new ArrayList<>();
        lights.add(kitchenLight);
        lights.add(bedroomLight);
        Command allLightsCommand = new AllLightsCommand(lights);

        lightSwitch.storeAndExecute(allLightsCommand);
    }
}
