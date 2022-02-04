package factorymethod5;

import common.Util;

public class Client {

	public static void main(String[] args) throws Exception {
		IAutoFactory autoFactory = loadFactory();
		IAuto car = autoFactory.createAutomobile();
        car.turnOn();
        car.turnOff();
	}
	
	private static IAutoFactory loadFactory() throws Exception
    {
		IAutoFactory autoFactory = null;
		String factoryName = Util.getPropertyValue("config.properties", "DefaultAutoFactoryMethod");
        try {
            autoFactory = (IAutoFactory) Class.forName(factoryName).newInstance();
        } catch( Exception ex) {
        	throw ex;
        }
        return autoFactory;
    }
}