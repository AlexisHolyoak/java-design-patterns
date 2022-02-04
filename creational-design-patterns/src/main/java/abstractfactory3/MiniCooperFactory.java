package abstractfactory3;

public class MiniCooperFactory implements IAutoFactory {

	@Override
	public IAutoMobile createSportsCar() {
		MiniCooper mini = new MiniCooper();
        mini.addSportPackage();
        return mini;
	}

	@Override
	public IAutoMobile createLuxuryCar() {
		MiniCooper mini = new MiniCooper();        
        mini.addLuxuryPackage();        
        return mini;
	}

	@Override
	public IAutoMobile createEconomyCar() {
		return new MiniCooper();
	}	
}