package factorymethod2problem;

import common.Util;

public class Client {

	public static void main(String[] args) throws Exception {
		String carName = Util.getPropertyValue("config.properties", "DefaultAutoFactoryMethod1");
        IAuto car = getCar(carName);
        car.turnOn();
        car.turnOff();
	}
	
	private static IAuto getCar(String carName)
    {
        switch (carName)
        {
            case "BMW335Xi":
                return new BMW335Xi();
            case "MiniCooper":
                return new MiniCooper();
            case "AudiTTS":
                return new AudiTTS();
            default:
                return new BMW335Xi();
        }    
    }
}