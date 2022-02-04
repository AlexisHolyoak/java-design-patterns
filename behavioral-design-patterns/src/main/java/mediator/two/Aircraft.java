package mediator.two;

//colleague
public abstract class Aircraft {
    private AirTrafficControlMediator mediator;
    private int currentAltitude;
    private String callSign;
    protected int ceiling;

    protected Aircraft(String callSign, AirTrafficControlMediator mediator) {
        this.mediator = mediator;
        this.callSign = callSign;
        mediator.registerAircraftUnderGuidance(this);
    }

    public AirTrafficControlMediator getMediator() {
        return mediator;
    }

    public abstract int getCurrentAltitude();

    public void setCurrentAltitude(int currentAltitude) {
        this.currentAltitude = currentAltitude;
        mediator.receiveAircraftLocation(this);
    }

    public String getCallSign() {
        return callSign;
    }

    public int getCeiling() {
        return ceiling;
    }

    public void climb(int heightToClimb) {
        currentAltitude += heightToClimb;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        return isEqual(other);
    }

    public boolean isEqual(Object other) {
        if (other == null) {
            return false;
        }
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Aircraft incoming = (Aircraft) other;
        return this.callSign.equals(incoming.callSign);
    }

    @Override
    public int hashCode() {
        return callSign.hashCode();
    }

    public void warnOfAirspaceIntrusionBy(Aircraft reportingAircraft) {
        System.out.println("Warning => CallSign: " + reportingAircraft.getCallSign() + " ** Altitude: "
                + reportingAircraft.currentAltitude);
    }
}
