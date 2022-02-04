package factorymethod2;

public class MiniCooper implements IAuto {

	@Override
	public String getName() {		
		return "Mini Cooper";
	}

	@Override
	public void turnOn() {
		System.out.println("The Mini Cooper is on! 1.6 Liters of brutal force is churning.");
	}

	@Override
	public void turnOff() {
		System.out.println("The Mini Cooper is has turned off.");
	}
}