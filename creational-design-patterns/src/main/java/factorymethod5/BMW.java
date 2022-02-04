package factorymethod5;

public class BMW implements IAuto {

	private String name;
	
	public BMW(String name)
	{
		this.name = name;
	}
	
	@Override
	public String getName() {		
		return name;
	}
	
	@Override
	public void setName(String name) {
       this.name = name;
	}

	@Override
	public void turnOn() {
		System.out.println("The " + name + " is on and running.");
	}

	@Override
	public void turnOff() {
		System.out.println("The " + name + " is off.");
	}	
}