package factorymethod2;

public class BMW335Xi implements IAuto {

	@Override
	public String getName() {		
		return "BMW 335Xi";
	}

	@Override
	public void turnOn() {
		System.out.println("The BMW 335Xi is on and running.");
	}

	@Override
	public void turnOff() {
		System.out.println("The BMW 335Xi is off.");
	}
}