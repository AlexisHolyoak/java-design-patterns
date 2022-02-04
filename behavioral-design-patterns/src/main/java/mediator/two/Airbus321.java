package mediator.two;

public class Airbus321 extends Aircraft {
    protected Airbus321(String callSign, AirTrafficControlMediator mediator) {
        super(callSign, mediator);
    }

    @Override
    public int getCurrentAltitude() {
        return 41000;
    }
}
