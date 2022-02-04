package abstractfactory3;

public interface IAutoFactory {
	IAutoMobile createSportsCar();
	IAutoMobile createLuxuryCar();
	IAutoMobile createEconomyCar();
}