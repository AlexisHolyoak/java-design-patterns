package abstractfactory2;

import common.Util;

public class Client {

	public static void main(String[] args) throws Exception {
		final String Car = "Car";
		final String SUV = "SUV";
		
		String searchResult = null;
		String vehicleCategory = Util.getPropertyValue("config.properties", "VehicleCategory");
		String vehicleType = Util.getPropertyValue("config.properties", "VehicleType");
		
		VehicleFactory vehicleFactory = VehicleFactory.getVehicleFactory(vehicleCategory);

		if (vehicleType.equals(Car)) {
			Car car = vehicleFactory.getCar();
			searchResult = "Name: " + car.getCarName() + "\nFeatures: " + car.getCarFeatures();
		} else if (vehicleType.equals(SUV)) {
			SUV suv = vehicleFactory.getSUV();
			searchResult = "Name: " + suv.getSUVName() + "\nFeatures: " + suv.getSUVFeatures();
		}
		System.out.println(searchResult);
	}
}