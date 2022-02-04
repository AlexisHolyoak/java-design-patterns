package factorymethod2;

import common.Util;

public class Client {

	public static void main(String[] args) throws Exception {
		String carName = Util.getPropertyValue("config.properties", "DefaultAutoFactoryMethod1");
		AutoFactory factory = new AutoFactory();
		IAuto car = factory.createInstance(carName);
        car.turnOn();
        car.turnOff();
	}
		
}