package mediator.two;

public class Client {

    public static void main(String[] args) {
        AirTrafficControlMediator yytCenter = new YytCenter();

        Aircraft flight1 = new Airbus321("AC159", yytCenter);
        Aircraft flight2 = new Boeing737200("WS203", yytCenter);
        Aircraft flight3 = new Embraer190("AC602", yytCenter);

        flight1.setCurrentAltitude(flight1.getCurrentAltitude() + 1000);
        flight2.setCurrentAltitude(flight2.getCurrentAltitude() + 10);
        flight3.setCurrentAltitude(flight3.getCurrentAltitude() + 100);
    }
}
