package factorymethod5;

public class MiniCooper implements IAuto {

	private String name;
	
	@Override
	public String getName() {		
		return "Mini Cooper";
	}
	
	@Override
	public void setName(String name) {
       this.name = name;
	}

	@Override
	public void turnOn() {
		System.out.println("The " + name + " is on! 1.6 Liters of brutal force is churning.");
	}

	@Override
	public void turnOff() {
		System.out.println("The " + name + " is has turned off.");
	}
}