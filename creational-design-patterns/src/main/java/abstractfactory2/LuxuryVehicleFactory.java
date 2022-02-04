package abstractfactory2;

public class LuxuryVehicleFactory extends VehicleFactory {

	public Car getCar() {
        return new LuxuryCar("Luxury Car");
    }

	public SUV getSUV() {
        return new LuxurySUV("Luxury SUV");
    }
}