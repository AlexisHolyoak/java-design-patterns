package mediator.two;

public class Boeing737200 extends Aircraft {
    protected Boeing737200(String callSign, AirTrafficControlMediator mediator) {
        super(callSign, mediator);
    }

    @Override
    public int getCurrentAltitude() {
        return 35000;
    }
}
