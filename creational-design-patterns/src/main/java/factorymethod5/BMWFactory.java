package factorymethod5;

public class BMWFactory implements IAutoFactory {

	@Override
	public IAuto createAutomobile() {
		return new BMW("BMW M5 Cabriolet");
	}	
}