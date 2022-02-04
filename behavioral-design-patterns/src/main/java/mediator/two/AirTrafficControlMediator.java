package mediator.two;

public interface AirTrafficControlMediator {
    public void receiveAircraftLocation(Aircraft location);

    public void registerAircraftUnderGuidance(Aircraft aircraft);
}
