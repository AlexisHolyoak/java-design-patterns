package abstractfactory3;

import common.Util;

public class Client {

	public static void main(String[] args) throws Exception {
		IAutoFactory factory = loadFactory();
		
		printHeader("SPORTS CAR");
		IAutoMobile car = factory.createSportsCar();
        car.turnOn();
        car.turnOff();
        
        printHeader("LUXURY CAR");
		car = factory.createLuxuryCar();
        car.turnOn();
        car.turnOff();
        
        printHeader("ECONOMY CAR");
		car = factory.createEconomyCar();
        car.turnOn();
        car.turnOff();               
	}
	
	private static IAutoFactory loadFactory() throws Exception
    {
		IAutoFactory autoFactory = null;
		String factoryName = Util.getPropertyValue("config.properties", "DefaultAbstractFactory");
        try {
            autoFactory = (IAutoFactory) Class.forName(factoryName).newInstance();
        } catch( Exception ex) {        	
        }
        return autoFactory;
    }
	
	public static void printHeader(String title)
	{
		System.out.format("++++++++++++++++ %s ++++++++++++++++++\n", title);
	}
}