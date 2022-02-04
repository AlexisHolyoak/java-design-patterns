package abstractfactory3;

public class MiniCooper implements IAutoMobile {

	private String name;
	
	public MiniCooper()
    {
        this.name = "Mini Cooper";
    }
	
	public void addSportPackage()
    {
        name += " S";
    }

    public void addLuxuryPackage()
    {
        name += " with leather upholstery";
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