package abstractfactory3;

public class BMWFactory implements IAutoFactory {

	@Override
	public IAutoMobile createSportsCar() {
		return new BMWM3();
	}

	@Override
	public IAutoMobile createLuxuryCar() {
		return new BMW740i(); 
	}

	@Override
	public IAutoMobile createEconomyCar() {
		return new BMW328i();
	}	
}