package facade.two;

public class Client {

    public static void main(String[] args) {
        String zipCode = "83714";

        TemperatureLookupFacade temperatureFacade = new TemperatureLookupFacade();
        LocalTemperature localTemp = temperatureFacade.getTemperature(zipCode);

        System.out.format("The current temperature is %.2fF/%.2fC in %s, %s", localTemp.getFarenheit(),
                localTemp.getCelcius(), localTemp.getCity(), localTemp.getState());
    }
}
