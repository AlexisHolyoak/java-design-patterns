package abstractfactory3;

public abstract class BMWBase implements IAutoMobile{
	
	public abstract String getName();
	
	@Override
	public void turnOn() {
		System.out.println("The " + getName() + " is on and running.");		
	}

	@Override
	public void turnOff() {
		System.out.println("The " + getName() + " is off.");
	}
}