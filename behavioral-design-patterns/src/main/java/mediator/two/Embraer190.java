package mediator.two;

public class Embraer190 extends Aircraft {

    protected Embraer190(String callSign, AirTrafficControlMediator mediator) {
        super(callSign, mediator);
    }

    @Override
    public int getCurrentAltitude() {
        return 41000;
    }

}
