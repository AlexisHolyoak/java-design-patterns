package abstractfactory2;

public class NonLuxuryVehicleFactory extends VehicleFactory {

	public Car getCar() {
        return new NonLuxuryCar("Non Luxury Car");
    }

	public SUV getSUV() {
        return new NonLuxurySUV("Non Luxury SUV");
    }
}